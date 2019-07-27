package com.meatball.common.vo.ordervo.customize;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@ApiModel(value = "退款统计")
public class RefundStatistics implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value="油品退款总额")
    private BigDecimal oilMoney= new BigDecimal("0");

    @ApiModelProperty(value="油品退款笔数")
    private Integer oilOrder = new Integer(0);

    @ApiModelProperty(value="商品退款总额")
    private BigDecimal productMoney= new BigDecimal("0");

    @ApiModelProperty(value="商品退款笔数")
    private Integer productOrder = new Integer(0);

}
