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
@ApiModel(value = "总订单")
public class BlanketorderVo extends BaseEntityVo {

    @ApiModelProperty(value="订单编号")
    private String blanketorderNo;

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

    @ApiModelProperty(value = "会员车牌号")
    private String memberCarNum;

    @ApiModelProperty(value = "会员等级")
    private String memberCardName;

    @ApiModelProperty(value = "会员类型(0.个人 1.团体)")
    private Integer memberType;

    @ApiModelProperty(value = "团体ID")
    private String teamInfoId;

    @ApiModelProperty(value = "团体卡ID")
    private String teamCardId;

    @ApiModelProperty(value="油品金额")
    private BigDecimal oilMoney;

    @ApiModelProperty(value="商品金额")
    private BigDecimal proMoney;

    @ApiModelProperty(value="订单总额")
    private BigDecimal orderSum;

    @ApiModelProperty(value="总优惠")
    private BigDecimal discounts;

    @ApiModelProperty(value="优惠券优惠")
    private BigDecimal couponDis;

    @ApiModelProperty(value="油站优惠")
    private BigDecimal grantDis;

    @ApiModelProperty(value="实际支付")
    private BigDecimal copeWith;

    @ApiModelProperty(value="退款")
    private BigDecimal refundMoney;

    @ApiModelProperty(value = "收款")
    private BigDecimal payAmount;

    @ApiModelProperty(value = "找零")
    private BigDecimal returnMoney;

    @ApiModelProperty(value="积分")
    private Integer integral;

    @ApiModelProperty(value="支付信息ID")
    private String paymentId;

    @ApiModelProperty(value="支付编号")
    private String paymentNumber;

    @ApiModelProperty(value="支付种类")
    private Integer paymentType;

    @ApiModelProperty(value="支付方式")
    private Integer paymentMethod;

    @ApiModelProperty(value="订单来源")
    private Integer orderSource;

    @JSONField(serializeUsing = DateSerializer.class)
    @ApiModelProperty(value="订单生成时间")
    private Date orderGenerationTime;

    @JSONField(serializeUsing = DateSerializer.class)
    @ApiModelProperty(value="订单完成时间")
    private Date orderCompletionTime;

    @ApiModelProperty(value="订单描述")
    private String orderDesc;

    @ApiModelProperty(value="版本，0基础版，1减配版，2标准版")
    private Integer version;

    @ApiModelProperty(value="退款状态，0正常 1退款 2部分退款")
    private Integer refundSta;

    @ApiModelProperty(value="发票状态，0未开 1已开")
    private Integer invoiceSta;

    @ApiModelProperty(value="订单状态")
    private Integer blankSta;

}
