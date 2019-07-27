package com.meatball.common.vo.integral;
/**
 * Project Name:IntegralVo.java
 * File Name:IntegralVo.java
 * Date:2018/11/28 15:00
 * Copyright (c) 2018, xia.yukunu@foxmail.com All Rights Reserved.
 */
import com.meatball.common.base.BaseEntityVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
/**
 * @Title: IntegralVo.java
 * @Description: todo()
 * @Author: 夏玉昆
 * @Date: 2018/11/28 15:00
 * @Version: V1.0
 */
@Data
@ApiModel(value = "会员积分信息VO")
public class IntegralVo extends BaseEntityVo {
    @ApiModelProperty(value = "会员id")
    private String memberId;

    @ApiModelProperty(value = "剩余积分")
    private  int residueIntegral;

    @ApiModelProperty(value = "描述")
    private String description;

    @ApiModelProperty(value = "油站ID")
    private String oilStationId;
}
