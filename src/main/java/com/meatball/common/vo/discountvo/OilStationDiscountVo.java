package com.meatball.common.vo.discountvo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Title: OilStationDiscountVo.java
 * @Description: todo(油站优惠vo)
 * @Author: 马志超
 * @Date: 2018/11/13 14:44
 * @Version: V1.0
 */
@Data
@ApiModel("油站优惠信息")
public class OilStationDiscountVo implements Serializable {

    @ApiModelProperty("是否可用/true可用/false不可用")
    private Boolean canUse;

    @ApiModelProperty("不可用原因")
    private String reason;

    @ApiModelProperty("优惠类型/满减/折扣/直降")
    private String discountType;

    @ApiModelProperty("优惠金额")
    private BigDecimal discountAmount;

}
