package com.meatball.common.vo.ordervo;

import com.meatball.common.base.BaseEntityVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
@ApiModel(value = "商品明细单")
public class ProductdetailVo extends BaseEntityVo {

    @ApiModelProperty(value="总订单ID")
    private String blanketOrderId;

    @ApiModelProperty(value="油站ID")
    private String oilStationId;

    @ApiModelProperty(value="商品订单ID")
    private String prorderId;

    @ApiModelProperty(value="会员id")
    private String memberId;

    @ApiModelProperty(value="商品ID")
    private String productId;

    @ApiModelProperty(value="单价")
    private BigDecimal price;

    @ApiModelProperty(value="数量")
    private BigDecimal quantity;

    @ApiModelProperty(value="金额")
    private BigDecimal proMoney;

    @ApiModelProperty(value="实际付款")
    private BigDecimal copeWith;

    @ApiModelProperty(value="退款状态，0正常 1退款")
    private Integer refundSta;

    @ApiModelProperty(value="订单状态")
    private Integer prodeSta;
}
