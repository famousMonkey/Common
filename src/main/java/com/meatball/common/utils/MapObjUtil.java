package com.meatball.common.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.util.*;

public class MapObjUtil {
    /**
     * 实体对象转成Map
     *
     * @param obj 实体对象
     * @return
     */
    public static Map<String, Object> object2Map(Object obj) {
        Map<String, Object> map = new HashMap<String, Object>();
        if (obj == null) {
            return map;
        }
        Class clazz = obj.getClass();
        List<Class<?>> classes = getsuperClass(clazz);
        classes.add(clazz);

        for (Class c :classes){
            Field[] fields = c.getDeclaredFields();
            try {
                for (Field field : fields) {
                    field.setAccessible(true);
                    if(!field.getName().equals("serialVersionUID") && field.get(obj) !=null){
                        map.put(field.getName(), field.get(obj).toString());
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return map;
    }

    /**
     * Map转成实体对象
     *
     * @param map   map实体对象包含属性
     * @param clazz 实体对象类型
     * @return
     */
    public static <T> T map2Object(Map<String, Object> map, Class<T> clazz) {
        if (map == null) {
            return null;
        }
        T obj = null;
        try {
            obj = clazz.newInstance();

            List<Field> fields = new ArrayList<>();

            Class c = clazz;

            while (c != null){
                fields.addAll(new ArrayList<>(Arrays.asList(c.getDeclaredFields())));
                c = c.getSuperclass();
            }

            for (Field field : fields) {
                int mod = field.getModifiers();
                if (Modifier.isStatic(mod) || Modifier.isFinal(mod)) {
                    continue;
                }
                field.setAccessible(true);
                String filedTypeName = field.getType().getName();

                if(map.get(field.getName()) != null){
                    String value = String.valueOf(map.get(field.getName()));
                    if (filedTypeName.equalsIgnoreCase("java.util.date")) {
                        field.set(obj, new Date(Long.parseLong(value)));
                    }else  if (filedTypeName.equalsIgnoreCase("java.math.BigDecimal")) {
                        field.set(obj, new BigDecimal(value));
                    }else  if (filedTypeName.equalsIgnoreCase("java.lang.Integer")) {
                        field.set(obj, new Integer(value));
                    }else  if (filedTypeName.equalsIgnoreCase("java.lang.String")) {
                        field.set(obj, value);
                    }else {
                        field.set(obj, map.get(field.getName()));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }


    private static List<Class<?>> getsuperClass(Class<?> calzz) {
        List<Class<?>> listSuperClass = new ArrayList<Class<?>>();
        Class<?> superclass = calzz.getSuperclass();
        while (superclass != null) {
            if (superclass.getName().equals("java.lang.Object")) {
                break;
            }
            listSuperClass.add(superclass);
            superclass = superclass.getSuperclass();
        }
        return listSuperClass;
    }
}
