/**
 * Project Name:PendGenerateOrderVo.java
 * File Name:PendGenerateOrderVo.java
 * Date:2018/11/14 20:59
 * Copyright (c) 2018,m18813049340@163.com All Rights Reserved.
 */
package com.meatball.common.vo.discount.customize;

import com.meatball.common.base.BaseEntityVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("待生成订单返回vo")
public class MemberOrderVo extends BaseEntityVo {
    @ApiModelProperty(value="油站Id")
    private String oilStationId;

    @ApiModelProperty(value="总订单编号")
    private String blanketorderNo;

    private String orderType;

    @ApiModelProperty(value="订单状态")
    private Integer status;

    @ApiModelProperty(value="支付方式")
    private Integer paymentType;

    @ApiModelProperty(value="订单来源")
    private Integer orderSource;

    @ApiModelProperty(value="是否临时会员，默认不是")
    private Boolean interim=false;

    @ApiModelProperty(value="版本，0基础版，1减配版，2标准版")
    private Integer version = 0;

    private OrderParamVo orderParam;

    //private PendGenerateOrderVo pendGenerateOrder;
}
