/**
 * Project Name:meatball-common
 * File Name:ResultMsg.java
 * Package Name:com.meatball.vo
 * Date:2017年10月17日下午4:18:11
 * Copyright (c) 2017, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.common.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import springfox.documentation.annotations.ApiIgnore;

import java.io.Serializable;

/**   
 * @Title: ResultMsg.java 
 * @Package com.meatball.vo 
 * @Description: TODO(返回消息 - 分页数据)
 * @author 張翔宇  
 * @date 2017年10月17日 下午4:18:11 
 * @version V1.0   
 */
@ApiModel(value = "ResultMsg", description = "返回消息 - 分页数据")
@ApiIgnore
@Data
public class PageResultMsg<T> implements Serializable {
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
	 * 条数
	 */
	@ApiModelProperty("总条数")
	private Long count;

	/**
	 * 返回数据
	 */
	@ApiModelProperty("返回数据")
	private T data;


	public PageResultMsg(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public PageResultMsg(int code, long count, T data) {
		this.code = code;
		this.count = count;
		this.data = data;
	}

	public PageResultMsg(int code, String message, long count, T data) {
		this.code = code;
		this.message = message;
		this.count = count;
		this.data = data;
	}
}
