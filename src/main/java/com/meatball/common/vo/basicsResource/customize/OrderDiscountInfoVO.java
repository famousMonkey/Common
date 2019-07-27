package com.meatball.common.vo.basicsResource.customize;
/**
 * Project Name:OrderDiscountInfoVO.java
 * File Name:OrderDiscountInfoVO.java
 * Date:2018/11/22 11:27
 * Copyright (c) 2018, xia.yukunu@foxmail.com All Rights Reserved.
 */

import com.meatball.common.base.BaseVo;
import com.meatball.common.vo.discountvo.OrderDiscountVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @Title: OrderDiscountInfoVO.java
 * @Description: todo(订单优惠统计信息)
 * @Author: 夏玉昆
 * @Date: 2018/11/22 11:27
 * @Version: V1.0
 */
@Data
@ApiModel("订单优惠统计信息")
public class OrderDiscountInfoVO extends BaseVo {
    /**
     * 会员ID
     */
    @ApiModelProperty(value = "会员ID")
    private String memberId;
    /**
     * 会员名称
     */
    @ApiModelProperty(value = "会员名称")
    private String memberName;
    /**
     * 订单ID
     */
    @ApiModelProperty(value = "订单ID")
    private String orderId;
    /**
     * 订单编号
     */
    @ApiModelProperty(value = "订单编号")
    private String orderNum;
    /**
     * 优惠信息(集合)
     */
    @ApiModelProperty(value = "优惠信息(集合)")
    private List<OrderDiscountVo> orderDiscountInfoList;

}
