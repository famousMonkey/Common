/**
 * Project Name:Integral.java
 * File Name:Integral.java
 * Date:2018/10/30 9:23
 * Copyright (c) 2018,m18813049340@163.com All Rights Reserved.
 */
package com.meatball.common.vo.account.customize;

import com.meatball.common.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * @Title: Integral.java
 * @Description: 会员储值账户信息明细
 * @Author: 孙明
 * @Date: 2018/11/22 10:59
 * @Version: V1.0
 */

@Data
@ApiModel(value = "团体卡储值/消费明细Vo")
public class TeamsDetailVo {

    /**
     * 团体id
     */
    @ApiModelProperty(value = "团体id", example = "168a1008b1634eca91f91a56ce921bf8")
    private String teamInfoId;

    /**
     * 团体主副卡id
     */
    @ApiModelProperty(value = "团体主副卡id", example = "168a1008b1634eca91f91a56ce921bf8")
    private String teamCardId;

    /**
     * 名称
     */
    @ApiModelProperty(value = "名称", example = "168a1008b1634eca91f91a56ce921bf8")
    private String name;

    /**
     * 组织ID
     */
    @ApiModelProperty(value = "组织ID", example = "168a1008b1634eca91f91a56ce921bf8")
    private String orgId;

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
     * 昵称
     */
    @ApiModelProperty(value = "昵称", example = "小小")
    @Column(length = 255)
    private String nickName;

    /**
     * 团体卡号
     */
    @ApiModelProperty(value = "团体卡号", example = "小小")
    private String teamCardNumber;

    /**
     * 手机号
     */
    @ApiModelProperty(value = "手机号", example = "13812345678")
    private String phone;

    /**
     * 车牌
     */
    @ApiModelProperty(value = "车牌", example = "168a1008b1634eca91f91a56ce921bf8")
    private String carNumber;

    /**
     * 识别卡号
     */
    @ApiModelProperty(value = "识别卡号", example = "168a1008b1634eca91f91a56ce921bf8")
    private String entityCardNumber;

    /**
     * 是否主卡
     */
    @ApiModelProperty(value = "是否主卡 1:主卡 0:副卡", example = "false")
    private Integer isMainCard;

    /**
     * 金额
     */
    @ApiModelProperty(value = "金额", example = "13.12")
    private BigDecimal amount;

    /**
     * 类型
     */
    @ApiModelProperty(value = "类型", example = "1：充值  2：消费  3：支付退款 4：充值退款")
    private int type;

    /**
     * 账户类型
     */
    @ApiModelProperty(value = "账户类型", example = "40：通用账户  41：汽油账户  42：柴油账户  43：天然气账户")
    @Column(length = 2)
    private int accountType;

    /**
     * 相关ID  充值id/订单id/退货单id
     */
    @ApiModelProperty(value = "相关ID:充值id/订单id/退货单id", example = "168a1008b1634eca91f91a56ce921bf8")
    private String relevantId;

    /**
     * 相关编号  油站编号/会员编号/订单编号
     */
    @ApiModelProperty(value = "相关ID:充值id/订单id/退货单id", example = "168a1008b1634eca91f91a56ce921bf8")
    private String relevantCode;


}
