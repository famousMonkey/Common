package com.meatball.common.vo.ordervo.customize;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@ApiModel(value = "销售统计")
public class SalesStatistics implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value="应收")
    private BigDecimal receivableAmount = new BigDecimal("0");

    @ApiModelProperty(value="优惠")
    private BigDecimal  discountAmount = new BigDecimal("0");

    @ApiModelProperty(value="实收")
    private BigDecimal  realAmount = new BigDecimal("0");

    @ApiModelProperty(value="退款")
    private BigDecimal  refundAmount = new BigDecimal("0");

    @ApiModelProperty(value="订单量")
    private Integer orderQuantity = new Integer(0);

    @ApiModelProperty(value="销量")
    private BigDecimal  salesVolume = new BigDecimal("0");

}
