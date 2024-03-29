/**
 * Project Name:meatball-common
 * File Name:UUIDUtil.java
 * Package Name:com.meatball.common.utils
 * Date:2017年10月11日下午4:49:27
 * Copyright (c) 2017, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.common.utils;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang.StringUtils;

import java.util.UUID;

/**   
 * @Title: UUIDUtil.java 
 * @Package com.meatball.common.utils
 * @Description: TODO(生成ID) 
 * @author 張翔宇  
 * @date 2017年10月11日 下午4:49:27 
 * @version V1.0   
 */
public class UUIDUtil {

	public static String UUID() {
		UUID uuid = UUID.randomUUID();
		return uuid.toString();
	}

	public static String compressedUUID() {
		UUID uuid = UUID.randomUUID();
		return compressedUUID(uuid);
	}

	public static String compactUUID() {
		UUID uuid = UUID.randomUUID();
		String result = uuid.toString();

		return StringUtils.remove(result, '-');

	}

	protected static String compressedUUID(UUID uuid) {
		byte[] byUUID = new byte[16];
		long least = uuid.getLeastSignificantBits();
		long most = uuid.getMostSignificantBits();
		long2bytes(most, byUUID, 0);
		long2bytes(least, byUUID, 8);
		String compressUUID = Base64.encodeBase64URLSafeString(byUUID);
		return compressUUID;
	}

	protected static void long2bytes(long value, byte[] bytes, int offset) {
		for (int i = 7; i > -1; i--) {
			bytes[offset++] = (byte) ((value >> 8 * i) & 0xFF);
		}
	}

	public static String compress(String uuidString) {
		UUID uuid = UUID.fromString(uuidString);
		return compressedUUID(uuid);
	}

	public static String uncompress(String compressedUUID) {
		if (compressedUUID.length() != 22) {
			throw new IllegalArgumentException("Invalid uuid!");
		}
		byte[] byUUID = Base64.decodeBase64(compressedUUID + "==");
		long most = bytes2long(byUUID, 0);
		long least = bytes2long(byUUID, 8);
		UUID uuid = new UUID(most, least);
		return uuid.toString();
	}

	protected static long bytes2long(byte[] bytes, int offset) {
		long value = 0;
		for (int i = 7; i > -1; i--) {
			value |= (((long) bytes[offset++]) & 0xFF) << 8 * i;
		}
		return value;
	}
}
