package com.meatball.common.utils;


/**
 * @author: 张垒
 * @date: 2018/11/4 下午5:51
 */
public class BaseServiceUtil {

    public static final String deleteDelimiter = ",";

    public static final String updateDelimiter = "@";

    /**
     * 进行删除操作时，对ids进行分割
     */
    public static String[] splitResourceIds(String resourceIds) {
        int length = resourceIds.length();
        if (resourceIds.indexOf("[") == 0 && resourceIds.indexOf("]") == length) {
            resourceIds = resourceIds.substring(1, length-1);
        }
        String[] split = resourceIds.split(deleteDelimiter);
        return split;
    }

}
