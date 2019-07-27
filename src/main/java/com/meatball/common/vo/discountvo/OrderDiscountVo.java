package com.meatball.common.vo.discountvo;
/**
 * Project Name:OrderDiscount.java
 * File Name:OrderDiscount.java
 * Date:2018/10/31 16:07
 * Copyright (c) 2018, xia.yukunu@foxmail.com All Rights Reserved.
 */

import com.meatball.common.base.BaseEntity;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @Title: OrderDiscount.java
 * @Description: todo(订单优惠信息)
 * @Author: 夏玉昆
 * @Date: 2018/10/31 16:07
 * @Version: V1.0
 */
@Data
public class OrderDiscountVo extends BaseEntity {
    /**
     * 会员优惠信息
     */
    private String memberDiscountId;
    /**
     * 优惠信息(代金券ID/活动ID)
     */
    private String discountId;

    /**
     * 订单信息
     */
    private String orderId;

    /**
     * 会员信息
     */
    private String memberId;

    /**
     * 订单类型
     * 1总订单,2油品订单,3商品订单,4商品单品
     */
    private Integer orderType;

    /**
     * 优惠类型
     * 1直降，2满减
     */
    private Integer discountType;

    /**
     * 优惠额度
     */
    private BigDecimal discountMoney;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 描述
     */
    private String dsc;
}
