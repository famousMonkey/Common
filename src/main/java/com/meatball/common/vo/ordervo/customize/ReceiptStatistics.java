package com.meatball.common.vo.ordervo.customize;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@ApiModel(value = "收款统计")
public class ReceiptStatistics implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value="现金")
    private BigDecimal cash = new BigDecimal("0");

    @ApiModelProperty(value="现金订单")
    private Integer cashOrder = new Integer(0);

    @ApiModelProperty(value="刷卡")
    private BigDecimal swipe = new BigDecimal("0");

    @ApiModelProperty(value="刷卡订单")
    private Integer swipeOrder = new Integer(0);

    @ApiModelProperty(value="微信")
    private BigDecimal wechat = new BigDecimal("0");

    @ApiModelProperty(value="微信订单")
    private Integer wechatOrder = new Integer(0);

    @ApiModelProperty(value="支付宝")
    private BigDecimal alipay = new BigDecimal("0");

    @ApiModelProperty(value="支付宝订单")
    private Integer alipayOrder = new Integer(0);

    @ApiModelProperty(value="余额")
    private BigDecimal account = new BigDecimal("0");

    @ApiModelProperty(value="余额订单")
    private Integer accountOrder = new Integer(0);

    @ApiModelProperty(value="通用账户")
    private BigDecimal commonAccount = new BigDecimal("0");

    @ApiModelProperty(value="通用账户订单")
    private Integer commonAccountOrder = new Integer(0);

    @ApiModelProperty(value="汽油账户")
    private BigDecimal gasolineAccount = new BigDecimal("0");

    @ApiModelProperty(value="汽油账户订单")
    private Integer gasolineAccountOrder = new Integer(0);

    @ApiModelProperty(value="柴油账户")
    private BigDecimal dieselAccount = new BigDecimal("0");

    @ApiModelProperty(value="柴油账户订单")
    private Integer dieselAccountOrder = new Integer(0);

    @ApiModelProperty(value="CNG账户")
    private BigDecimal cngAccount = new BigDecimal("0");

    @ApiModelProperty(value="柴油账户订单")
    private Integer cngAccountOrder = new Integer(0);

    @ApiModelProperty(value="白条")
    private BigDecimal iou = new BigDecimal("0");

    @ApiModelProperty(value="白条订单")
    private Integer iouOrder = new Integer(0);

    @ApiModelProperty(value="总计收款")
    private BigDecimal total = new BigDecimal("0");

    @ApiModelProperty(value="总计订单")
    private Integer totalOrder = new Integer(0);

}
