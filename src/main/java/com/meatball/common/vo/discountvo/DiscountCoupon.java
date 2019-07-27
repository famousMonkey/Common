/**
 * Project Name:DiscountCouponRepository.java
 * File Name:DiscountCouponRepository.java
 * Date:2018/11/3 13:36
 * Copyright (c) 2018,m18813049340@163.com All Rights Reserved.
 */
package com.meatball.common.vo.discountvo;

import com.meatball.common.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Title: DiscountCouponRepository.java
 * @Description: todo(优惠券管理)
 * @Author: 马志超
 * @Date: 2018/11/3 13:35
 * @Version: V1.0
 */
@Data

@ApiModel(value = "优惠券管理实体")
public class DiscountCoupon extends BaseEntity {


    @ApiModelProperty(value = "优惠券编号")
    private String disCouponNum;

    @ApiModelProperty(value = "优惠券名称")
    private String disCouponName;

    @ApiModelProperty(value = "油站id")
    private String oilStationId;

    @ApiModelProperty(value = "优惠券类别(油站/平台)")
    private int disCouponType;

    @ApiModelProperty(value = "是否定制商品")
    private int isCusProduct;

    @ApiModelProperty(value = "过期时间")
    private Date expireTime;

    @ApiModelProperty(value = "有效时间")
    private Date periodTime;

    @ApiModelProperty(value = "优惠券额度")
    private BigDecimal disCouponLimit;

    @ApiModelProperty(value = "最低消费")
    private BigDecimal minCharge;

    @ApiModelProperty(value = "公用范围")
    private int pubScope;

    @ApiModelProperty(value = "描述")
    private String description;

    @ApiModelProperty(value = "状态")
    private Boolean disStatus;
}
