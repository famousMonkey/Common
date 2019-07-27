package com.meatball.common.vo.discountvo;
/**
 * Project Name:DiscountInfoVo.java
 * File Name:DiscountInfoVo.java
 * Date:2018/11/27 17:28
 * Copyright (c) 2018, xia.yukunu@foxmail.com All Rights Reserved.
 */

import com.meatball.common.base.BaseEntityVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @Title: DiscountInfoVo.java
 * @Description: todo()
 * @Author: 夏玉昆
 * @Date: 2018/11/27 17:28
 * @Version: V1.0
 */
@Data
@ApiModel("会员优惠信息")
public class DiscountInfoVo extends BaseEntityVo {
    /**
     * 会员信息
     */
    @ApiModelProperty(name = "会员信息")
    private String memberId;

    /**
     * 优惠信息编号
     */
    @ApiModelProperty(name = "优惠信息编号")
    private String discountNum;

    /**
     * 油站ID
     */
    @ApiModelProperty(name = "油站ID")
    private String oilStationId;

    /**
     * 总优惠额度
     */
    @ApiModelProperty(name = "总优惠额度")
    private BigDecimal allDiscountMoney;

    /**
     * 描述
     */
    @ApiModelProperty(name = "描述")
    private String dsc;
}
