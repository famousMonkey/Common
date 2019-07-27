package com.meatball.common.vo.ordervo.customize;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "油品销售统计")
public class OilSalesStatistics extends SalesStatistics {

    @ApiModelProperty(value="油品ID")
    private String oilsId;

    @ApiModelProperty(value="油品关联ID")
    private String oilsDicId;

    @ApiModelProperty(value="油品名称")
    private String oilsName;

}
