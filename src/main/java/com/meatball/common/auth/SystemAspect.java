/**
 * Project Name:SystemAspect.java
 * File Name:SystemAspect.java
 * Date:2018/9/5 上午9:58
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.common.auth;

import com.meatball.common.log.service.SysLogService;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.authz.AuthorizationException;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;

/**
 * @Title: SystemAspect.java
 * @Description: todo(切点类)
 * @Author: 張翔宇
 * @Date: 2018/9/5 上午9:57
 * @Version: V1.0
 */
@Aspect
@Component
public class SystemAspect {

	@Autowired
	private Authentication authentication;
	@Autowired
	private SysLogService sysLogService;

	// 本地异常日志记录对象
//	private static final Logger logger = LoggerFactory.getLogger(SystemAspect.class);
	
	/**
	 * @Title: controllerAspect
	 * @Description: todo(Controller层切点)
	 * @Params: []
	 * @Return: void    返回类型
	 * @Author: 張翔宇
	 * @Date: 2018/9/5 上午9:55
	 */
	@Pointcut("@annotation(com.meatball.common.auth.MeatballPermissions)")
	public void controllerAspect() {
	}

	/**
	 * @title: controllerLogAspect
	 * @description: todo(业务日志记录)
	 * @params: []
	 * @return: void    返回类型
	 * @author: 張翔宇
	 * @date: 2019/6/19 14:24
	 */
	@Pointcut("@annotation(com.meatball.common.log.OperateLog)")
	public void controllerLogAspect() {}


	/**
	 * @Title: doBefore
	 * @Description: todo(前置通知 用于拦截Controller层记录用户的操作)
	 * @Params: [joinPoint]
	 * @Return: void    返回类型
	 * @Author: 張翔宇
	 * @Date: 2018/9/5 上午9:56
	 */
	@Before(value = "controllerAspect()")
	public void doBefore(JoinPoint joinPoint) throws Exception {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		String accessToken = request.getHeader( "access_token" );
		String authorization = getMethodDescription(joinPoint);
		//如果权限验证不为空，且没有token则返回未登录
		if(StringUtils.isNotEmpty(authorization) && StringUtils.isEmpty( accessToken )){
			throw new AuthorizationException();
		}
		//判断是否有访问权限
		authentication.isPermitted(accessToken,authorization);
	}

	/**
	 * @title: doLogBefore
	 * @description: todo(系统日志处理)
	 * @params: [joinPoint]
	 * @return: void    返回类型
	 * @author: 張翔宇
	 * @date: 2019/6/19 14:25
	 */
	@Before(value = "controllerLogAspect()")
	public void doLogBefore(JoinPoint joinPoint) {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		sysLogService.save(request, joinPoint, null);
	}

	/**
	 * @Title: getMethodDescription
	 * @Description: todo(获取注解中对方法的描述信息 用于Controller层注解)
	 * @Params: [joinPoint]
	 * @Return: java.lang.String    返回类型
	 * @Author: 張翔宇
	 * @Date: 2018/9/5 上午10:04
	 */
	private String getMethodDescription(JoinPoint joinPoint)  throws Exception {
		String targetName = joinPoint.getTarget().getClass().getName();
		String methodName = joinPoint.getSignature().getName();
		Object[] arguments = joinPoint.getArgs();
		Class<?> targetClass = Class.forName(targetName);
		Method[] methods = targetClass.getMethods();
		String description = "";
		for (Method method : methods) {
			if (method.getName().equals(methodName)) {
				Class<?>[] clazzs = method.getParameterTypes();
				if (clazzs.length == arguments.length) {
					description = method.getAnnotation(MeatballPermissions.class).value();
					break;
				}
			}
		}
		return description;
	}
}
