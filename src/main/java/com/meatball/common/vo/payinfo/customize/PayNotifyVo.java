/**
 * Project Name:DiscountCouponRepository.java
 * File Name:DiscountCouponRepository.java
 * Date:2018/11/3 13:36
 * Copyright (c) 2018,m18813049340@163.com All Rights Reserved.
 */
package com.meatball.common.vo.payinfo.customize;

import com.meatball.common.base.BaseVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
@ApiModel(value = "支付通知")
public class PayNotifyVo extends BaseVo {

    @ApiModelProperty(value = "支付Id")
    private String payId;

    @ApiModelProperty(value = "订单编号")
    private String payOrder;

    @ApiModelProperty(value = "支付单号")
    private String paymentNumber;

    @ApiModelProperty(value = "相关Id")
    private String relevantId;

    @ApiModelProperty(value = "支付金额")
    private BigDecimal payAmount;

    @ApiModelProperty(value = "找零")
    private BigDecimal returnMoney;

    @ApiModelProperty(value = "支付类别")
    private Integer paymentType;

    @ApiModelProperty(value = "支付方式")
    private Integer paymentMethod;

    @ApiModelProperty(value = "会员ID")
    private String memberId;

}