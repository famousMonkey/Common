package com.meatball.common.vo.ordervo.customize;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@ApiModel(value = "油品订单交互信息")
public class OilOrderMutualInfo implements Serializable {

    @ApiModelProperty(value="ID",hidden = true)
    private String Id;

    @ApiModelProperty(value="数据来源编码")
    private String dataCode;

    @ApiModelProperty(value="油枪ID")
    private String oilGunId;

    @ApiModelProperty(value="油枪名称")
    private String oilGunName;

    @ApiModelProperty(value="油品ID")
    private String oilsId;

    @ApiModelProperty(value="油品字典ID")
    private String oilsDicId;

    @ApiModelProperty(value="油品名称")
    private String oilsName;

    @ApiModelProperty(value="油品类别")
    private String oilsCategory;

    @ApiModelProperty(value="加油员 员工ID ")
    private String refuelStaffId;

    @ApiModelProperty(value="加油员名称 员工名称 ")
    private String refuelStaffName;

    @ApiModelProperty(value="加油员 执勤信息ID ")
    private String staffDutyId;

    @ApiModelProperty(value="优惠券ID")
    private String couponId;

    @ApiModelProperty(value="活动ID")
    private String detailId;

    @ApiModelProperty(value="活动类型,1油站活动 2等级活动")
    private Integer activityType;

    @ApiModelProperty(value="单价")
    private BigDecimal price;

    @ApiModelProperty(value="销售价格")
    private BigDecimal sellingPrice;

    @ApiModelProperty(value="数量")
    private BigDecimal quantity;

    @ApiModelProperty(value="总金额")
    private BigDecimal oilMoney;

    @ApiModelProperty(value="优惠")
    private BigDecimal discounts;

    @ApiModelProperty(value="优惠券优惠")
    private BigDecimal couponDis;

    @ApiModelProperty(value="油站活动优惠")
    private BigDecimal grantDis;

    @ApiModelProperty(value="每升优惠")
    private BigDecimal priceDis;

    @ApiModelProperty(value="实付款")
    private BigDecimal copeWith;

    @ApiModelProperty(value="退款状态，0正常 1退款")
    private Integer refundSta;
}
