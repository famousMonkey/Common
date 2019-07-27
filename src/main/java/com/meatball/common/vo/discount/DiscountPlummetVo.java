/**
 * Project Name:DiscountPlummetVo.java
 * File Name:DiscountPlummetVo.java
 * Date:2018/11/27 14:31
 * Copyright (c) 2018,m18813049340@163.com All Rights Reserved.
 */
package com.meatball.common.vo.discount;

import com.meatball.common.base.BaseEntityVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @Title: DiscountPlummetVo.java
 * @Description: todo()
 * @Author: 马志超
 * @Date: 2018/11/27 14:25
 * @Version: V1.0
 */
@Data
@ApiModel(value = "商品直降信息")
public class DiscountPlummetVo extends BaseEntityVo {

    @ApiModelProperty("活动优惠信息")
    private String discountInfo;

    @ApiModelProperty("商品信息")
    private String productId;

    @ApiModelProperty("状态0/可用/1不可用")
    private Integer status = 0;

    @ApiModelProperty("描述")
    private String description;

    @ApiModelProperty("优惠金额")
    private BigDecimal disAmount;
}
