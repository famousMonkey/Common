/**
 * Project Name:FeignConfiguration.java
 * File Name:FeignConfiguration.java
 * Date:2019/6/22 10:57
 * Copyright (c) 2019, zhang.xiangyu@foxmail.com All Rights Reserved.
 */
package com.meatball.common.client;


import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**   
 * @Title: FeignConfiguration.java
 * @Description: todo(Feign调用的时候添加请求头Token)
 * @Author: 張翔宇
 * @Date: 2019/6/22 10:57 
 * @Version: V1.0   
 */
@Configuration
public class FeignConfiguration implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate template) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        template.header("access_token", request.getHeader("access_token"));
    }
}
