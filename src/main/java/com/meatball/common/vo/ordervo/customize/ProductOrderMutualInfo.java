package com.meatball.common.vo.ordervo.customize;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@ApiModel(value = "商品订单交互信息")
public class ProductOrderMutualInfo implements Serializable {

    @ApiModelProperty(value="ID",hidden = true)
    private String Id;

    @ApiModelProperty(value="商品ID")
    private String productId;

    @ApiModelProperty(value="商品名称")
    private String productName;

    @ApiModelProperty(value="商品条码")
    private String productBarCode;

    @ApiModelProperty(value="单价")
    private BigDecimal price;

    @ApiModelProperty(value="数量")
    private BigDecimal quantity;

    @ApiModelProperty(value="实付款",hidden = true)
    private BigDecimal copeWith;

    @ApiModelProperty(value="活动ID")
    private String detailId;

    @ApiModelProperty(value="活动名称")
    private String detailName;

    @ApiModelProperty(value="优惠")

    private BigDecimal discounts;

    @ApiModelProperty(value="退款数量")
    private BigDecimal refundQuantity;

    @ApiModelProperty(value="退款金额")
    private BigDecimal refundMoney;

    @ApiModelProperty(value="退款状态，0正常 1退款")
    private Integer refundSta;
}
