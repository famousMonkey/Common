package com.meatball.common.auth;

import java.lang.annotation.*;

/**
 * @ClassName: SystemControllerLog 
 * @Description: TODO(自定义注解 操作日志 拦截Controller) 
 * @author 張翔宇
 * @date 2017年4月17日 下午2:59:54 
 *
 */
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MeatballPermissions {
	String value() default "";
}
