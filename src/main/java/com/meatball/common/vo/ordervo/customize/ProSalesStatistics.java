package com.meatball.common.vo.ordervo.customize;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "油品销售统计")
public class ProSalesStatistics extends SalesStatistics {

    @ApiModelProperty(value = "商品Id")
    private String commodityId;

    @ApiModelProperty(value = "商品Id")
    private String commodityName;

}
