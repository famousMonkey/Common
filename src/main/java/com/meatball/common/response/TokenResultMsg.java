/**
 * Project Name:meatball-common
 * File Name:ResultMsg.java
 * Package Name:com.meatball.vo
 * Date:2017年10月17日下午4:18:11
 * Copyright (c) 2017, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.common.response;

import com.alibaba.fastjson.annotation.JSONField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import springfox.documentation.annotations.ApiIgnore;

import java.io.Serializable;

/**   
 * @Title: ResultMsg.java 
 * @Package com.meatball.vo 
 * @Description: TODO(返回消息) 
 * @author 張翔宇  
 * @date 2017年10月17日 下午4:18:11 
 * @version V1.0   
 */
@ApiModel(value = "ResultMsg", description = "消息返回")
@ApiIgnore
@Data
public class TokenResultMsg<T> implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 状态码
	 */
	@ApiModelProperty("状态码")
	private int code;

	/**
	 * 消息内容
	 */
	@ApiModelProperty("消息内容")
	private String message;

	/**
	 * 权限令
	 */
	@ApiModelProperty("权限令牌")
	@JSONField(name = "access_token")
	private String accessToken;

	public TokenResultMsg(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public TokenResultMsg(int code, String message, String accessToken) {
		this.code = code;
		this.message = message;
		this.accessToken = accessToken;
	}
}
