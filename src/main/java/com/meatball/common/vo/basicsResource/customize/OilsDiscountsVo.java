package com.meatball.common.vo.basicsResource.customize;

import com.meatball.common.vo.basicsResource.OilsVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
@ApiModel("油品优惠信息")
public class OilsDiscountsVo extends OilsVo {
    @ApiModelProperty(value="优惠Id")
    private String discountsId;

    @ApiModelProperty(value="优惠金额")
    private  BigDecimal discounts;

    @ApiModelProperty(value="现价")
    private BigDecimal currentPrice ;
}
