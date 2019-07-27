/**
 * Project Name:meatball-admin
 * File Name:SysLogService.java
 * Package Name:com.meatball.base.system.log.service
 * Date:2017年10月11日下午3:40:23
 * Copyright (c) 2017, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.common.log.service;

import com.alibaba.fastjson.JSON;
import com.meatball.common.constant.MeatballConst;
import com.meatball.common.log.OperateLog;
import com.meatball.common.log.domain.SysLog;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * @Title: SysLogService.java
 * @Description: todo(日志记录服务类)
 * @Author: 張翔宇
 * @Date: 2018/9/5 上午9:59
 * @Version: V1.0
 */
@Slf4j
@Service
public class SysLogService {
	@Autowired
	private AmqpTemplate rabbitTemplate;

	@Async
	public void save(HttpServletRequest request, JoinPoint joinPoint, Throwable e) {
		SysLog sysLog = new SysLog();
		HttpSession session = request.getSession();
		//读取session中的用户    
//        SysUser user = (SysUser) session.getAttribute(MeatballConst.SYSTEM_USER);
//        if(user == null && joinPoint.getArgs().length > MeatballConst.ZERO) {
//        	try {
//        		user = (SysUser) joinPoint.getArgs()[MeatballConst.ZERO];
//			} catch (Exception e2) {
//				user = new SysUser();
//	        	BeanUtils.copyProperties(joinPoint.getArgs()[MeatballConst.ZERO], user);
//			}
//        }
        //请求的IP    
        String ip = request.getRemoteAddr();  
        
        try {
			// 控制台输出
            log.info("=======================通知开始=======================");
            if(e != null) {
            	log.info("异常代码：{}", e.getClass().getName());
            	log.info("异常信息：{}", e.getMessage());
            	log.info("异常方法：{}.{}()", joinPoint.getTarget().getClass().getName(), joinPoint.getSignature().getName());
            }
            log.info("请求方法：{}.{}()", joinPoint.getTarget().getClass().getName(), joinPoint.getSignature().getName());
            log.info("方法描述：{}", getMethodDescription(joinPoint));
            log.info("请求人：{}", "张三");
            log.info("请求IP：{}", ip);
            
            // 数据库日志
            sysLog.setDescription(getMethodDescription(joinPoint));
            sysLog.setMethod((joinPoint.getTarget().getClass().getName() + "." + joinPoint.getSignature().getName() + "()"));    
            sysLog.setRequestIp(ip);    
            sysLog.setOperateUser("张三");
            sysLog.setOperateDate(new Date()); 
            
         // 获取用户请求方法的参数并序列化为JSON格式字符串
            String params = "";
            try {
				if (joinPoint.getArgs() != null && joinPoint.getArgs().length > MeatballConst.ZERO) {
					for (int i = MeatballConst.ZERO; i < joinPoint.getArgs().length; i++) {
						params += JSON.toJSONString(joinPoint.getArgs()[i]) + ";";
					}
				}
			} catch (Exception e2) {
            	e2.printStackTrace();
			}
			sysLog.setParams(params);
            
			if (e != null) {
				
				// 0: 普通日志；1: 异常日志
				sysLog.setType(MeatballConst.ONE);
				sysLog.setExceptionCode(e.getClass().getName());    
	            sysLog.setExceptionDetail(e.getMessage());    
	            
	            log.error("异常方法:{}异常代码:{}异常信息:{}参数:{}", joinPoint.getTarget().getClass().getName() + joinPoint.getSignature().getName(), e.getClass().getName(), e.getMessage(), params);
			} else {
				sysLog.setType(MeatballConst.ZERO);
			}
			// 保存数据库
//			sysLogRepository.save(sysLog);
			rabbitTemplate.convertAndSend(MeatballConst.SYSTEM_LOG, JSON.toJSONString(sysLog));
			log.info("=======================通知结束=======================");
		} catch (Exception e1) {
			//记录本地异常日志    
			log.error("==前置通知异常==");    
			log.error("异常信息:{}", e1.getMessage());
			sysLog.setType(MeatballConst.ONE);
			sysLog.setExceptionCode(e1.getClass().getName());
			sysLog.setExceptionDetail(e1.getMessage());
//			sysLogRepository.save(sysLog);
			rabbitTemplate.convertAndSend(MeatballConst.SYSTEM_LOG, JSON.toJSONString(sysLog));
			e1.printStackTrace();
		}
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
                    description = method.getAnnotation(OperateLog.class).value();
                     break;    
                }    
            }    
        }    
         return description;    
    }
}
