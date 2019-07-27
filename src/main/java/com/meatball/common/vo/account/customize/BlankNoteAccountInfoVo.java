/**
 * Project Name:Integral.java
 * File Name:Integral.java
 * Date:2018/10/30 9:23
 * Copyright (c) 2018,m18813049340@163.com All Rights Reserved.
 */
package com.meatball.common.vo.account.customize;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import java.math.BigDecimal;

/**
 * @Title: Integral.java
 * @Description: 会员白条信息
 * @Author: 孙明
 * @Date: 2018/12/25 10:59
 * @Version: V1.0
 */

@Data
@ApiModel(value = "会员白条信息")
public class BlankNoteAccountInfoVo{

    /**
     * 白条名称
     */
    @ApiModelProperty(value = "白条名称", example = "白条名称")
    private String name;
    /**
     * 油站ID
     */
    @ApiModelProperty(value = "油站ID", example = "168a1008b1634eca91f91a56ce921bf8")
    private String oilStationId;

    /**
     * 会员ID
     */
    @ApiModelProperty(value = "会员ID", example = "168a1008b1634eca91f91a56ce921bf8")
    private String memberId;

    /**
     * 会员电话
     */
    @ApiModelProperty(value = "会员电话", example = "13812345678")
    private String phone;

    /**
     * 白条金额
     */
    @ApiModelProperty(value = "白条金额", example = "1000.00")
    private BigDecimal amount;

    /**
     * 类型
     */
    @ApiModelProperty(value = "类型", example = "0：打白条  1：还款  2：退款")
    private Integer type;


    /**
     * 状态
     */
    @ApiModelProperty(value = "状态", example = "0：未还款  1：已还款  2：已退款")
    @Column(length = 1)
    private Integer state;

    /**
     * 订单id
     */
    @ApiModelProperty(value = "订单id", example = "168a1008b1634eca91f91a56ce921bf8")
    private String relevantId;

    /**
     * 订单编号
     */
    @ApiModelProperty(value = "订单编号", example = "168a1008b1634eca91f91a56ce921bf8")
    private String relevantCode;

    /**
     * 相关ID  借款id/还款id
     */
    @ApiModelProperty(value = "借款id/还款id", example = "168a1008b1634eca91f91a56ce921bf8")
    private String correlationId;
    /**
     * 订单时间
     */
    @ApiModelProperty(value = "订单时间", example = "2019/01/01")
    private String createdTime;

    /**
     * 描述
     */
    @ApiModelProperty(value = "描述", example = "描述")
    private String description;
}
