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
 * @Description: 会员储值账户信息明细Vo
 * @Author: 孙明
 * @Date: 2018/11/22 10:59
 * @Version: V1.0
 */

@Data
@ApiModel(value = "会员储值账户信息明细Vo")
public class VipAccountInfoDetailVo {

    /**
     * 组织ID
     */
    @ApiModelProperty(value = "组织ID", example = "168a1008b1634eca91f91a56ce921bf8")
    @Column(length = 32)
    private String orgId;

    /**
     * 油站ID
     */
    @ApiModelProperty(value = "油站ID", example = "168a1008b1634eca91f91a56ce921bf8")
    private String oilStationId;

    /**
     * 会员储值账户ID-外键
     */
    @ApiModelProperty(value = "会员储值账户ID", example = "168a1008b1634eca91f91a56ce921bf8")
    @Column(length = 32)
    private String vipAccountInfoId;

    /**
     * 会员名称
     */
    @ApiModelProperty(value = "会员ID", example = "168a1008b1634eca91f91a56ce921bf8")
    @Column(length = 32)
    private String memberId;

    /**
     * 金额
     */
    @ApiModelProperty(value = "金额", example = "13.12")
    @Column(scale = 2)
    private BigDecimal amount;

    /**
     * 类型
     */
    @ApiModelProperty(value = "类型", example = "1：充值  2：消费  3：支付退款 4：充值退款")
    @Column(length = 1)
    private Integer type;

    /**
     * 账户类型
     */
    @ApiModelProperty(value = "账户类型", example = "40：通用账户  41：汽油账户  42：柴油账户  43：天然气账户")
    @Column(length = 2)
    private Integer accountType;

    /**
     * 相关ID  充值id/订单id/退货单id
     */
    @ApiModelProperty(value = "相关ID:充值id/订单id/退货单id", example = "168a1008b1634eca91f91a56ce921bf8")
    @Column(length = 32)
    private String relevantId;

    /**
     * 相关编号  油站编号/会员编号/订单编号
     */
    @ApiModelProperty(value = "相关ID:充值id/订单id/退货单id", example = "168a1008b1634eca91f91a56ce921bf8")
    @Column(length = 32)
    private String relevantCode;

    /**
     * 通用账户余额
     */
    @ApiModelProperty(value = "通用账户余额", example = "1000.00")
    @Column(scale = 2)
    private BigDecimal totalAmount;

    /**
     * 汽油账户余额
     */
    @ApiModelProperty(value = "汽油账户余额", example = "1000.00")
    @Column(scale = 2)
    private BigDecimal gasolineAmount;

    /**
     * 柴油账户余额
     */
    @ApiModelProperty(value = "柴油账户余额", example = "1000.00")
    @Column(scale = 2)
    private BigDecimal dieseloilAmount;

    /**
     * 天然气账户余额
     */
    @ApiModelProperty(value = "天然气账户余额", example = "1000.00")
    @Column(scale = 2)
    private BigDecimal cngAmount;

    /**
     * 白条
     */
    @ApiModelProperty(value = "白条", example = "1000.00")
    @Column(scale = 2)
    private BigDecimal blankNoteAmount;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间", example = "创建时间")
    private String createdTime;

}
