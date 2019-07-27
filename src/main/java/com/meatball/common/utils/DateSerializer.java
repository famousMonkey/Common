/**
 * Project Name:DateSerializer.java
 * File Name:DateSerializer.java
 * Date:2018/10/14 下午5:27
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
 */
package com.meatball.common.utils;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.ObjectSerializer;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Date;

/**
 * @Title: DateSerializer.java
 * @Description: todo(时间序列号类)
 * @Author: 張翔宇
 * @Date: 2018/10/14 下午5:27
 * @Version: V1.0
 */
public class DateSerializer implements ObjectSerializer {
    @Override
    public void write(JSONSerializer serializer, Object object, Object fieldName, Type fieldType, int features) throws IOException {
        if (null != object) {
            serializer.write(DateUtil.getDateTime((Date) object));
        } else {
            serializer.write("");
        }
    }
}
