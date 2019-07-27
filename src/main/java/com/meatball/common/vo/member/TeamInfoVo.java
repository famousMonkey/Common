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

import javax.persistence.Column;

/**
 * @Title: TeamInfo.java
 * @Description: todo(团体卡实体类)
 * @Author: 夏玉昆
 * @Date: 2018/11/10 14:47
 * @Version: V1.0
 */
@Data
@ApiModel("团体信息实体类")
public class TeamInfoVo extends BaseEntityVo {
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
     * 负责人id
     */
    @ApiModelProperty(value = "负责人id", example = "小小")
    private String memberId;

    /**
     * 负责人姓名
     */
    @ApiModelProperty(value = "负责人姓名", example = "小小")
    private String memberName;

    /**
     * 手机号
     */
    @ApiModelProperty(value = "手机号", example = "13812345678")
    private String phone;

    /**
     * 是否限额
     */
    @ApiModelProperty(value = "是否限额 1:限额 0:不限额,默认0", example = "false")
    private Integer islimit;

    /**
     * 限额周期
     */
    @ApiModelProperty(value = "限额周期 week,month", example = "false")
    private String cycle;

    /**
     * 账户类型
     */
    @ApiModelProperty(value = "账户类型", example = "40：通用账户  41：汽油账户  42：柴油账户  43：天然气账户")
    private Integer accountType;

    /**
     * 支付密码
     */
    @ApiModelProperty(value = "支付密码", example = "QWEQWR1236QWE")
    private String password;

    /**
     * 描述
     */
    @ApiModelProperty(value = "描述", example = "描述")
    private String description;
}
