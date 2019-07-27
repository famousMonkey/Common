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
@ApiModel(value = "商品订单")
public class ProductorderVo extends BaseEntityVo {
    @ApiModelProperty(value="商品单号")
    private String productorderNo;

    @ApiModelProperty(value="总订单id")
    private String blanketOrderId;

    @ApiModelProperty(value="油站id")
    private String oilStationId;

    @ApiModelProperty(value="班组id")
    private String squadId;

    @ApiModelProperty(value = "班组执勤Id")
    private String dutyId;

    @ApiModelProperty(value="收银员ID")
    private String staffId;

    @ApiModelProperty(value="收银员名称")
    private String salesperson;

    @ApiModelProperty(value="会员id")
    private String memberId;

    @ApiModelProperty(value="会员名称")
    private String memberName;

    @ApiModelProperty(value = "会员编号")
    private String memberNum;

    @ApiModelProperty(value="会员手机号")
    private String memberPhone;

    @ApiModelProperty(value="数量")
    private BigDecimal quantity;

    @ApiModelProperty(value="商品金额")
    private BigDecimal proMoney;

    @ApiModelProperty(value="商品优惠")
    private BigDecimal discounts;

    @ApiModelProperty(value="实际支付")
    private BigDecimal copeWith;

    @ApiModelProperty(value="退款")
    private BigDecimal refundMoney;

    @JSONField(serializeUsing = DateSerializer.class)
    @ApiModelProperty(value="订单生成时间")
    private Date orderGenerationTime;

    @JSONField(serializeUsing = DateSerializer.class)
    @ApiModelProperty(value="订单完成时间")
    private Date orderCompletionTime;

    @ApiModelProperty(value="支付信息")
    private String paymentId;

    @ApiModelProperty(value="支付编号")
    private String paymentNumber;

    @ApiModelProperty(value="支付种类")
    private Integer paymentType;

    @ApiModelProperty(value="支付方式")
    private Integer paymentMethod;

    @ApiModelProperty(value="订单来源")
    private Integer orderSource;

    @ApiModelProperty(value="结算方式")
    private Integer tradeType;

    @ApiModelProperty(value="版本，0基础版，1减配版，2标准版")
    private Integer version;

    @ApiModelProperty(value="退款状态，0正常 1退款 2部分退款")
    private Integer refundSta;

    @ApiModelProperty(value="订单状态")
    private Integer proSta;
}
