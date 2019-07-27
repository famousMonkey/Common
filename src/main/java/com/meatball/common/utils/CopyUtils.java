/**
 * Project Name:CopyUtils.java
 * File Name:CopyUtils.java
 * Date:2018/11/30 7:28 PM
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
 */
package com.meatball.common.utils;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

import static org.apache.commons.beanutils.BeanUtils.copyProperty;
import static org.apache.commons.beanutils.PropertyUtils.*;

/**
 * @Title: CopyUtils.java
 * @Description: todo()
 * @Author: 張翔宇
 * @Date: 2018/11/30 7:28 PM
 * @Version: V1.0
 */
public abstract class CopyUtils {

  public static <T> T copyObject(Class<T> cls, Object src) {
    if (src == null) { return null;}
    try {
      Object dst = cls.newInstance();
      copyProperties(dst, src);
      return (T) dst;
    } catch (Exception e) {
      e.printStackTrace();
      throw new RuntimeException(e);
    }
  }

  public static <T,E> List<T> copyArray(Class<T> cls, List<E> srcArray) {
      List<T> desList = new ArrayList<>();
      copyCollection(cls,srcArray,desList);
      return desList;
  }

  public static <T,E> Set<T> copyArray(Class<T> cls, Set<E> srcArray) {
    Set<T> desSet = new HashSet<>();
    copyCollection(cls,srcArray,desSet);
    return desSet;
  }

  public static <T, E> void copyCollection(Class<T> cls, Collection<E> srcArray, Collection<T> desCollection) {
    try {
      if(srcArray ==null) return;
      for (E src : srcArray){
        Object dst = cls.newInstance();
        copyProperties(dst, src);
        desCollection.add((T)dst);
      }
    } catch (Exception e) {
      e.printStackTrace();
      throw new RuntimeException(e);
    }
  }

  private static void copyProperties(final Object dest, final Object orig)
          throws IllegalAccessException, InvocationTargetException {
    if (dest == null) {
      throw new IllegalArgumentException
              ("No destination bean specified");
    }
      final PropertyDescriptor[] origDescriptors = getPropertyDescriptors(orig);
      for (PropertyDescriptor origDescriptor : origDescriptors) {
        final String name = origDescriptor.getName();
        if ("class".equals(name)) {
          continue;
        }
        if(origDescriptor.getPropertyType().getName().equals("java.lang.String")
                ||origDescriptor.getPropertyType().getName().equals("java.util.Date")
                ||origDescriptor.getPropertyType().getName().equals("java.lang.Integer")
                ||origDescriptor.getPropertyType().getName().equals("java.lang.Boolean")
                ||origDescriptor.getPropertyType().getName().equals("java.math.BigDecimal")){
          if (isReadable(orig, name) && isWriteable(dest, name)) {
            try {
              final Object value = getSimpleProperty(orig, name);
              copyProperty(dest, name, value);
            } catch (final NoSuchMethodException e) {

            }
          }
        }
      }
  }
}
