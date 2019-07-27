/**
 * Project Name:HttpMessageConverters.java
 * File Name:HttpMessageConverters.java
 * Date:2018/10/14 下午4:20
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
 */
package com.meatball.common.component;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;

import java.util.Arrays;

/**   
 * @Title: HttpMessageConverters.java
 * @Description: todo(修改默认使用fastjson作为json转换器) 
 * @Author: 張翔宇
 * @Date: 2018/10/14 下午4:20 
 * @Version: V1.0   
 */
@Configuration
public class MassageConverConfiguration {

    @Bean
    public HttpMessageConverters fastJsonHttpMessageConverters() {
        // 定义一个 convert 转换消息的对象
        FastJsonHttpMessageConverter fastConverter  = new FastJsonHttpMessageConverter();
        // 添加fastJson 的配置信息，比如：是否要格式化返回的json数据
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(
                SerializerFeature.PrettyFormat,
                SerializerFeature.WriteMapNullValue
        );
        // 在convert中添加配置信息
        fastConverter.setFastJsonConfig(fastJsonConfig);
        fastConverter.setSupportedMediaTypes(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpMessageConverter<?> converter = fastConverter;
        return new HttpMessageConverters(converter);
    }
}
