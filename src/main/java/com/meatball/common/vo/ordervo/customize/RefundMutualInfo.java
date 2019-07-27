package com.meatball.common.vo.ordervo.customize;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@ApiModel(value = "退款交互信息")
public class RefundMutualInfo implements Serializable {

    @ApiModelProperty(value="订单ID")
    private String orderId;

    @ApiModelProperty(value="订单编号",hidden = true)
    private String orderNo;

    @ApiModelProperty(value="类型,0全部 1油品 2商品")
    private Integer type;

    @ApiModelProperty(value="数量")
    private BigDecimal quantity;

    @ApiModelProperty(value="退款原因")
    private String refundReason ;

    @ApiModelProperty(value = "班组id",hidden = true)
    private String squadId;

    @ApiModelProperty(value = "班组执勤Id",hidden = true)
    private String dutyId;

    @ApiModelProperty(value="员工ID")
    private String staffId;

    @ApiModelProperty(value="总优惠")
    private BigDecimal discounts;

    @ApiModelProperty(value="密码")
    private String safePass;

    @ApiModelProperty(value="员工名称 ",hidden = true)
    private String staffName;

    @ApiModelProperty(value="退款编号 ",hidden = true)
    private String returnNo;

}
