/**
 * Project Name:UpdateUtil.java
 * File Name:UpdateUtil.java
 * Date:2018/11/1 6:52 PM
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
 */
package com.meatball.common.utils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import java.beans.PropertyDescriptor;
import java.util.HashSet;
import java.util.Set;

/**
 * @Title: UpdateUtil.java
 * @Description: todo(解决空值也更新的问题)
 * @Author: 張翔宇
 * @Date: 2018/11/1 6:52 PM
 * @Version: V1.0
 */
public class UpdateUtil {
    /**
     * @title: copyNonNullProperties
     * @description: todo(将空值的属性从目标实体类中复制到源实体类中)
     * @params: [src: 要将属性中的空值覆盖的对象(源实体类)
     * , target: 从数据库根据id查询出来的目标对象]
     * @return: void    返回类型
     * @author: 張翔宇
     * @date: 2018/11/1 6:52 PM
     */
    public static void copyNonNullProperties(Object  src,Object target){
        BeanUtils.copyProperties(src,target,getNullProperties(src));
    }

    /**
     * @title: getNullProperties
     * @description: todo(将为空的properties给找出来,然后返回出来)
     * @params: [src]
     * @return: java.lang.String[]    返回类型
     * @author: 張翔宇
     * @date: 2018/11/1 6:53 PM
     */
    private static String[] getNullProperties(Object src) {
        BeanWrapper srcBean = new BeanWrapperImpl(src);
        PropertyDescriptor[] pds = srcBean.getPropertyDescriptors();
        Set<String> emptyName = new HashSet<>();
        for (PropertyDescriptor p : pds) {
            Object srcValue = srcBean.getPropertyValue(p.getName());
            if (srcValue == null) {
                emptyName.add(p.getName());
            }
        }
        String[] result = new String[emptyName.size()];
        return emptyName.toArray(result);
    }
}
