package com.meatball.common.utils;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Created by 张垒 on 2018/11/4.
 */
public class LogUtil {
    /**
     * 根据异常转换成完整异常字符串
     */
    public static String getExceptionMessage(Exception e) {
        StringWriter sw=new StringWriter();
        PrintWriter pw=new PrintWriter(sw);
        e.printStackTrace(pw);
        return sw.toString();
    }
}
