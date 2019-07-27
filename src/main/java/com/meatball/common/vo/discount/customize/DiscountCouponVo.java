/**
 * Project Name:DiscountCouponRepository.java
 * File Name:DiscountCouponRepository.java
 * Date:2018/11/3 13:36
 * Copyright (c) 2018,m18813049340@163.com All Rights Reserved.
 */
package com.meatball.common.vo.discount.customize;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @Title: DiscountCouponRepository.java
 * @Description: todo(优惠券管理)
 * @Author: 马志超
 * @Date: 2018/11/3 13:35
 * @Version: V1.0
 */
@Data
@ApiModel(value = "优惠券管理实体")
public class DiscountCouponVo {

    @ApiModelProperty(value = "优惠券编号")
    private String disCouponNum;

    @ApiModelProperty(value = "优惠券名称")
    private String disCouponName;

    @ApiModelProperty(value = "优惠券id")
    private String id;

    @ApiModelProperty(value = "优惠券额度")
    private BigDecimal disCouponLimit;

}
