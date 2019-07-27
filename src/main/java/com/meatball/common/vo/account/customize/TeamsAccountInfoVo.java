/**
 * Project Name:Integral.java
 * File Name:Integral.java
 * Date:2018/10/30 9:23
 * Copyright (c) 2018,m18813049340@163.com All Rights Reserved.
 */
package com.meatball.common.vo.account.customize;

import com.alibaba.fastjson.annotation.JSONField;
import com.meatball.common.base.BaseEntity;
import com.meatball.common.base.BaseEntityVo;
import com.meatball.common.utils.DateSerializer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Title: Integral.java
 * @Description: 团体主副卡账户Vo
 * @Author: 孙明
 * @Date: 2018/12/25 10:59
 * @Version: V1.0
 */

@Data
@ApiModel(value = "团体主副卡账户Vo")
public class TeamsAccountInfoVo extends BaseEntity {

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
     * 限用金额
     */
    @ApiModelProperty(value = "限用金额", example = "1000.00")
    private BigDecimal limitAmount=new BigDecimal( 0 );


    /**
     * 状态
     */
    @ApiModelProperty(value = "状态", example = "0：正常  1：停用")
    private Integer state;

    /**
     * 描述
     */
    @ApiModelProperty(value = "描述", example = "描述")
    private String description;


    /**
     * 账户余额
     */
    @ApiModelProperty(value = "账户余额", example = "1000.00")
    private BigDecimal totalAmount=new BigDecimal( 0 );

    /**
     * 汽油账户余额
     */
    @ApiModelProperty(value = "汽油账户余额", example = "1000.00")
    @Column(scale = 2)
    private BigDecimal gasolineAmount=new BigDecimal( 0 );

    /**
     * 柴油账户余额
     */
    @ApiModelProperty(value = "柴油账户余额", example = "1000.00")
    @Column(scale = 2)
    private BigDecimal dieseloilAmount=new BigDecimal( 0 );

    /**
     * 天然气账户余额
     */
    @ApiModelProperty(value = "天然气账户余额", example = "1000.00")
    @Column(scale = 2)
    private BigDecimal cngAmount=new BigDecimal( 0 );

    /**
     * 已用金额
     */
    @ApiModelProperty(value = "已用金额", example = "1000.00")
    private BigDecimal usedAmount=new BigDecimal( 0 );

    /**
     * 累计使用金额
     */
    @ApiModelProperty(value = "累计使用金额", example = "1000.00")
    private BigDecimal allUsedAmount=new BigDecimal( 0 );

    /**
     * 最后使用时间
     */
    @JSONField(serializeUsing = DateSerializer.class)
    @ApiModelProperty("最后使用时间")
    private Date lastUsedDate;

    /**
     * 是否限额
     */
    @Transient
    @ApiModelProperty(value = "是否限额 1:限额 0:不限额,默认0", example = "false")
    private Integer islimit;

    /**
     * 限额周期
     */
    @Transient
    @ApiModelProperty(value = "限额周期 week,month", example = "false")
    private String cycle;



}
