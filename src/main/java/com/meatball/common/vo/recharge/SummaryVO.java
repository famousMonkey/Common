package com.meatball.common.vo.recharge;
/**
 * Project Name:SummaryVO.java
 * File Name:SummaryVO.java
 * Date:2019/2/20 16:34
 * Copyright (c) 2019, xia.yukunu@foxmail.com All Rights Reserved.
 */

import com.meatball.common.base.BaseVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @Title: SummaryVO.java
 * @Description: todo()
 * @Author: 夏玉昆
 * @Date: 2019/2/20 16:34
 * @Version: V1.0
 */
@ApiModel("汇总信息")
@Data
public class SummaryVO extends BaseVo {
    /**
     * 储值充值笔数
     */
    @ApiModelProperty(value = "储值充值笔数")
    private Integer rechargeCount;

    /**
     * 储值充值总金额
     */
    @ApiModelProperty(value = "储值充值总金额")
    private BigDecimal rechargeMoney=new BigDecimal( 0 );

    /**
     * 赠送总金额
     */
    @ApiModelProperty(value = "赠送总金额")
    private BigDecimal discountMoney=new BigDecimal( 0 );

    /**
     * 微信储值总金额
     */
    @ApiModelProperty(value = "微信储值总金额")
    private BigDecimal weChatRechargeMoney=new BigDecimal( 0 );

    /**
     * 支付宝储值总金额
     */
    @ApiModelProperty(value = "支付宝储值总金额")
    private BigDecimal alipayRechargeMoney=new BigDecimal( 0 );

    /**
     * 银联储值总金额
     */
    @ApiModelProperty(value = "银联储值总金额")
    private BigDecimal unionPayRechargeMoney=new BigDecimal( 0 );

    /**
     * 现金储值总金额
     */
    @ApiModelProperty(value = "现金储值总金额")
    private BigDecimal cashRechargeMoney=new BigDecimal( 0 );

    /**
     * 新会员储值充值笔数
     */
    @ApiModelProperty(value = "新会员储值充值笔数")
    private Integer newMemberRechargeCount;

    /**
     * 新会员储值充值金额
     */
    @ApiModelProperty(value = "新会员储值充值金额")
    private BigDecimal newMemberRechargeMoney=new BigDecimal( 0 );

    /**
     * 储值充值实收金额
     */
    @ApiModelProperty(value = "储值充值实收金额")
    private BigDecimal rechargePayableMoney=new BigDecimal( 0 );

    /**
     * 储值退款笔数
     */
    @ApiModelProperty(value = "储值退款笔数")
    private Integer rechargeRefundMoneyCount;

    /**
     * 储值退款总额
     */
    @ApiModelProperty(value = "储值退款总额")
    private BigDecimal rechargeRefundTotalMoney=new BigDecimal( 0 );

}
