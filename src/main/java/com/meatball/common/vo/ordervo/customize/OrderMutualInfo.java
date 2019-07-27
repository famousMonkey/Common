package com.meatball.common.vo.ordervo.customize;

import com.alibaba.fastjson.annotation.JSONField;
import com.meatball.common.utils.DateSerializer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@ApiModel(value = "订单交互信息")
public class OrderMutualInfo implements Serializable {

    @ApiModelProperty(value="ID",hidden = true)
    private String Id;

    @ApiModelProperty(value="是否临时会员，默认不是")
    private Boolean interim=false;

    @ApiModelProperty(value="会员ID")
    private String memberId;

    @ApiModelProperty(value="会员名称")
    private String memberName;

    @ApiModelProperty(value = "会员编号")
    private String memberNum;

    @ApiModelProperty(value = "会员手机号")
    private String memberPhone;

    @ApiModelProperty(value = "会员车牌号")
    private String memberCarNum;

    @ApiModelProperty(value = "会员等级名称")
    private String memberCardName;

    @ApiModelProperty(value="会员积分")
    private Integer memberIntegral;


    @ApiModelProperty(value = "会员类型(0.个人 1.团体)")
    private Integer memberType;

    @ApiModelProperty(value = "团体ID")
    private String teamInfoId;

    @ApiModelProperty(value = "团体卡ID")
    private String teamCardId;

    @ApiModelProperty(name = "组织ID",hidden = true)
    private String orgId;

    @ApiModelProperty(name = "油站ID")
    private String oilStationId;

    @ApiModelProperty(value = "班组id",hidden = true)
    private String squadId;

    @ApiModelProperty(value = "班组执勤Id",hidden = true)
    private String dutyId;

    @ApiModelProperty(value="收银员ID",hidden = true)
    private String staffId;

    @ApiModelProperty(value="收银员名称")
    private String salesperson;

    @ApiModelProperty(value="是否新订单，默认是")
    private Boolean newOrder=true;

    @ApiModelProperty(value="订单编号，新订单时候这个为空")
    private String blanketorderNo;

    @ApiModelProperty(value="是否挂单，默认不是")
    private Boolean pend=false;

    @ApiModelProperty(value="支付种类")
    private Integer paymentType;

    @ApiModelProperty(value="支付方式")
    private Integer paymentMethod;

    @ApiModelProperty(value="订单来源,0小程序 1PDA 2收银台")
    private Integer orderSource;

    @ApiModelProperty(value="订单总额")
    private BigDecimal orderSum;

    @ApiModelProperty(value="实际支付")
    private BigDecimal copeWith;

    @ApiModelProperty(value = "收款")
    private BigDecimal payAmount;

    @ApiModelProperty(value = "找零")
    private BigDecimal returnMoney;

    @ApiModelProperty(value="总优惠",hidden = true)
    private BigDecimal discounts = new BigDecimal(0);

    @ApiModelProperty(value="油站活动优惠",hidden = true)
    private BigDecimal grantDis = new BigDecimal(0);

    @ApiModelProperty(value="优惠券优惠",hidden = true)
    BigDecimal couponDis = new BigDecimal(0);

    @ApiModelProperty(value="积分")
    private Integer integral;

    @ApiModelProperty(value="订单状态")
    private Integer blankSta;

    @ApiModelProperty(value="退款状态，0正常 1退款 2部分退款")
    private Integer refundSta;

    @ApiModelProperty(value="退款")
    private BigDecimal refundMoney;

    @ApiModelProperty(value="版本，0基础版，1减配版，2标准版")
    private Integer version = 0;

    @JSONField(serializeUsing = DateSerializer.class)
    @ApiModelProperty(value="订单完成时间")
    private Date orderCompletionTime;

    @ApiModelProperty(value="支付编号")
    private String paymentNumber;

    @ApiModelProperty(value="发票状态，0未开 1已开")
    private Integer invoiceSta;

    @ApiModelProperty(value="油品订单")
    private OilOrderMutualInfo oilOrder;

    @ApiModelProperty(value="商品订单")
    private List<ProductOrderMutualInfo> productOrders;

}
