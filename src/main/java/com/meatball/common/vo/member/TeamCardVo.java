package com.meatball.common.vo.member;
/**
 * Project value:TeamInfo.java
 * File value:TeamInfo.java
 * Date:2018/11/10 14:47
 * Copyright (c) 2018, xia.yukunu@foxmail.com All Rights Reserved.
 */

import com.meatball.common.base.BaseEntityVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @Title: TeamInfo.java
 * @Description: todo(团体卡信息实体类)
 * @Author: 夏玉昆
 * @Date: 2018/11/10 14:47
 * @Version: V1.0
 */
@Data
@ApiModel("团体卡信息实体类")
public class TeamCardVo extends BaseEntityVo {
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
     * 团体id
     */
    @ApiModelProperty(value = "团体id", example = "168a1008b1634eca91f91a56ce921bf8")
    private String teamInfoId;

    /**
     * 账户类型
     */
    @ApiModelProperty(value = "账户类型", example = "40：通用账户  41：汽油账户  42：柴油账户  43：天然气账户")
    private Integer accountType;

    /**
     * 会员id
     */
    @ApiModelProperty(value = "负责人id", example = "小小")
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
     * 账户余额
     */
    @ApiModelProperty(value = "账户余额", example = "1000.00")
    private BigDecimal totalAmount;

    /**
     * 限用金额
     */
    @ApiModelProperty(value = "限用金额", example = "1000.00")
    private BigDecimal limitAmount;


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






}
