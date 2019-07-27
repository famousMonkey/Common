package com.meatball.common.vo.ordervo;

import com.alibaba.fastjson.annotation.JSONField;
import com.meatball.common.base.BaseEntityVo;
import com.meatball.common.utils.DateSerializer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@ApiModel(value = "油品订单")
public class OilsorderVo extends BaseEntityVo {

    @ApiModelProperty(value="油品单号")
    private String oilsorderNo;

    @ApiModelProperty(value="总订单id")
    private String blanketOrderId;

    @ApiModelProperty(value="油站id")
    private String oilStationId;

    @ApiModelProperty(value="班组id")
    private String squadId;

    @ApiModelProperty(value = "班组执勤Id")
    private String dutyId;

    @ApiModelProperty(value="加油员ID")
    private String refuelStaffId;

    @ApiModelProperty(value="加油员名称")
    private String refuelStaffName;

    @ApiModelProperty(value="收银员ID")
    private String staffId;

    @ApiModelProperty(value="收银员名称")
    private String salesperson;

    @ApiModelProperty(value="加油员执勤Id")
    private String staffDutyId;

    @ApiModelProperty(value="是否临时会员，默认不是")
    private Boolean interim;

    @ApiModelProperty(value="会员id")
    private String memberId;

    @ApiModelProperty(value="会员名称")
    private String memberName;

    @ApiModelProperty(value = "会员编号")
    private String memberNum;

    @ApiModelProperty(value="会员手机号")
    private String memberPhone;

    @ApiModelProperty(value="油枪ID")
    private String oilGunId;

    @ApiModelProperty(value="油枪名称")
    private String oilGunName;

    @ApiModelProperty(value="油品ID")
    private String oilsId;

    @ApiModelProperty(value="优惠券ID")
    private String couponId;

    @ApiModelProperty(value="活动ID")
    private String detailId;

    @ApiModelProperty(value="活动类型,1油站活动 2等级活动")
    private Integer activityType;

    @ApiModelProperty(value="油品名称")
    private String oilsName;

    @ApiModelProperty(value="油品类别")
    private String oilsCategory;

    @ApiModelProperty(value="单价")
    private BigDecimal price;

    @ApiModelProperty(value="销售价格")
    private BigDecimal sellingPrice;

    @ApiModelProperty(value="数量")
    private BigDecimal quantity;

    @ApiModelProperty(value="订单金额")
    private BigDecimal oilMoney;

    @ApiModelProperty(value="优惠")
    private BigDecimal discounts;

    @ApiModelProperty(value="优惠券优惠")
    private BigDecimal couponDis;

    @ApiModelProperty(value="油站优惠")
    private BigDecimal grantDis;

    @ApiModelProperty(value="每升优惠")
    private BigDecimal priceDis;

    @ApiModelProperty(value="实际付款")
    private BigDecimal copeWith;

    @ApiModelProperty(value="退款")
    private BigDecimal refundMoney;

    @JSONField(serializeUsing = DateSerializer.class)
    @ApiModelProperty(value="订单生成时间")
    private Date orderGenerationTime;

    @JSONField(serializeUsing = DateSerializer.class)
    @ApiModelProperty(value="订单完成时间")
    private Date orderCompletionTime;

    @ApiModelProperty(value="支付信息ID")
    private String paymentId;

    @ApiModelProperty(value="支付编号")
    private String paymentNumber;

    @ApiModelProperty(value="支付种类")
    private Integer paymentType;

    @ApiModelProperty(value="支付方式")
    private Integer paymentMethod;

    @ApiModelProperty(value="订单来源,")
    private Integer orderSource;

    @ApiModelProperty(value="结算方式")
    private Integer tradeType;

    @ApiModelProperty(value="是否单独油品订单")
    private Boolean singly;

    @ApiModelProperty(value="版本，0基础版，1减配版，2标准版")
    private Integer version;

    @ApiModelProperty(value="退款状态，0正常 1退款")
    private Integer refundSta;

    @ApiModelProperty(value="订单状态")
    private Integer oilSta;

}
