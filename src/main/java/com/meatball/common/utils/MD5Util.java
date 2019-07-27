/**
 * Project Name:meatball-common
 * File Name:MD5Util.java
 * Package Name:com.meatball.common.utils
 * Date:2017年10月10日下午12:03:30
 * Copyright (c) 2017, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.common.utils;

import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

import java.security.MessageDigest;
import java.util.Random;

/**   
 * @Title: MD5Util.java 
 * @Package com.meatball.common.utils
 * @Description: TODO(带盐加密MD5) 
 * @author 張翔宇  
 * @date 2017年10月10日 下午12:03:30 
 * @version V1.0   
 */
public class MD5Util {
	/**
	 * 加盐参数
	 */
    public final static String HASHALGORITHMNAME = "MD5";

	/**
	 * 循环次数
	 */
	public final static int HASHITERATIONS = 1024;

    /**
     * @Title: md5 
     * @Description: TODO(shiro密码加密工具类) 
     * @param credentials 密码
     * @param saltSource	密码盐
     * @return String    返回类型
     */
    public static String md5(String credentials, String saltSource) {
        ByteSource salt = new Md5Hash(saltSource);
        return new SimpleHash(HASHALGORITHMNAME, credentials, salt, HASHITERATIONS).toString();
    }

	/**
	 * 返回16位MD5码
	 * @param credentials
	 * @param saltSource
	 * @return
	 */
	public static String md5_16(String credentials, String saltSource) {
		ByteSource salt = new Md5Hash(saltSource);
		return new SimpleHash(HASHALGORITHMNAME, credentials, salt, HASHITERATIONS).toString().substring(8, 24);
	}
    
    /**
     * @Title: getRandomString 
     * @Description: TODO(获取一个随机字符串，用于生成用户盐) 
     * @param length
     * @return String    返回类型
     */
    public static String getRandomString(int length) {
        String base = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }
    
    private static final String hexDigits[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};

	private static String byteArrayToHexString(byte b[]) {
		StringBuffer resultSb = new StringBuffer();
		for (int i = 0; i < b.length; i++) {
			resultSb.append(byteToHexString(b[i]));
		}
		return resultSb.toString();
	}

	private static String byteToHexString(byte b) {
		int n = b;
		if (n < 0) {
			n += 256;
		}
		int d1 = n / 16;
		int d2 = n % 16;
		return hexDigits[d1] + hexDigits[d2];
	}
    
    public static String MD5Encode(String origin) {
		String result = null;
		try {
			result = new String(origin);
			MessageDigest md = MessageDigest.getInstance("MD5");
			result = byteArrayToHexString(md.digest(result.getBytes("UTF-8")));
		} catch (Exception exception) {
		}
		return result;
	}
    
}
