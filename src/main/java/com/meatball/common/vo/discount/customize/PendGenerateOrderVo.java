/**
 * Project Name:PendGenerateOrderVo.java
 * File Name:PendGenerateOrderVo.java
 * Date:2018/11/14 20:59
 * Copyright (c) 2018,m18813049340@163.com All Rights Reserved.
 */
package com.meatball.common.vo.discount.customize;

import com.meatball.common.base.BaseVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**   
 * @Title: PendGenerateOrderVo.java
 * @Description: todo(待生成订单vo)
 * @Author: 马志超
 * @Date: 2018/11/1420:59
 * @Version: V1.0   
 */
@Data
@ApiModel("待生成订单返回vo")
public class PendGenerateOrderVo extends BaseVo {
    @ApiModelProperty("总金额")
    private BigDecimal totalAmount;

    @ApiModelProperty("油品优惠金额")
    private BigDecimal oilDisAmount;

    @ApiModelProperty("商品优惠金额")
    private BigDecimal productDisAmount;

    @ApiModelProperty("订单活动优惠金额")
    private BigDecimal discountAmount;

    @ApiModelProperty("代金券优惠金额")
    private BigDecimal discountCouponAmount;

    @ApiModelProperty("总优惠金额")
    private BigDecimal totalDisCount;

    @ApiModelProperty("实际支付金额")
    private BigDecimal actualAmount;

    @ApiModelProperty("活动优惠信息vo")
    private List<DiscountVo> oilStationDiscounts;

    @ApiModelProperty("使用的优惠券")
    private List<DiscountCouponVo> usedCoupons;

    @ApiModelProperty("可用的优惠券")
    private List<DiscountCouponVo> canUseDiscount;
}
