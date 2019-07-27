package com.meatball.common.vo.ordervo.customize;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "订单统计")
public class OrderStatistics implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value="订单总数")
    private Integer total = new Integer(0);

    @ApiModelProperty(value="进行中订单数")
    private Integer  proceed = new Integer("0");

    @ApiModelProperty(value="待支付订单数")
    private Integer  unpaid = new Integer("0");

    @ApiModelProperty(value="完成订单数")
    private Integer  success = new Integer("0");

    @ApiModelProperty(value="取消订单数")
    private Integer  cancel = new Integer("0");

    @ApiModelProperty(value="退款订单数")
    private Integer  refund = new Integer("0");

}
