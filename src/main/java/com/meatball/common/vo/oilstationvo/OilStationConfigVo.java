package com.meatball.common.vo.oilstationvo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;

/**
 * @ClassName 油站配置
 * @Description todo
 * @Author 周晓瀚
 * Date 2019/1/28 15:29
 * Version  1.0
 **/
@Data
public class OilStationConfigVo{
    @ApiModelProperty(value="油站Id",name="oilStationId")
    private String oilStationId;

    @ApiModelProperty(value="油站名称",name="oilStationName")
    private String oilStationName;

    @ApiModelProperty(value="一键加油打印小票",name="oneClickReceipts")
    private Boolean oneClickReceipts;

    @ApiModelProperty(value="交接班打印小票",name="shiftPrintsReceipts")
    private Boolean shiftPrintsReceipts;

    @ApiModelProperty(value="语音播报",name="voiceBroadcast")
    private Boolean voiceBroadcast;

    @ApiModelProperty(value="打印小票方式",name="wayOfPrint")
    private Integer wayOfPrint;

    @ApiModelProperty(value="打印小票联数",name="printNumberCoupons")
    private String printNumberCoupons;

    @ApiModelProperty(value="补打小票联数",name="makeUpNumberCoupons")
    private String makeUpNumberCoupons;

    @ApiModelProperty(value="小票字号 0:标准 1:中  2:大",name="receiptsFontSize")
    private Integer receiptsFontSize;

    @ApiModelProperty(value="小票-现金")
    private Boolean cash;
    @ApiModelProperty(value="小票-刷卡")
    private Boolean swipingCard;
    @ApiModelProperty(value="小票-微信")
    private Boolean weChat;
    @ApiModelProperty(value="小票-支付宝")
    private Boolean aLiPay;
    @ApiModelProperty(value="小票-余额")
    private Boolean balance;
    @ApiModelProperty(value="小票-白条")
    private Boolean whiteBar;
    //<---------------------语音----------------------------->
    @ApiModelProperty(value="语音-现金")
    private Boolean voiceCash;
    @ApiModelProperty(value="语音-刷卡")
    private Boolean voiceSwipingCard;
    @ApiModelProperty(value="语音-微信")
    private Boolean voiceWeChat;
    @ApiModelProperty(value="语音-支付宝")
    private Boolean voiceALiPay;
    @ApiModelProperty(value="语音-余额")
    private Boolean voiceBalance;
    @ApiModelProperty(value="语音-白条")
    private Boolean voiceWhiteBar;
    @ApiModelProperty(value="语音播报客户类型 0:所有客户 1：仅限会员",name="voiceBroadcastCustomerType")
    private Integer voiceBroadcastCustomerType;
    //<---------------------语音----------------------------->
    @ApiModelProperty(value="油枪")
    private Boolean oilGunName;
    @ApiModelProperty(value="会员等级")
    private Boolean memberLevel;
    @ApiModelProperty(value="消费金额")
    private Boolean consumptionMoney;
    @ApiModelProperty(value="优惠金额")
    private Boolean discountsMoney;
    @ApiModelProperty(value="获得积分")
    private Boolean integrals;
    @ApiModelProperty(value="描述",name="accountDescribe")
    private String oilStationConfigDescribe;
    @ApiModelProperty(value="状态",name="staType")
    private  Integer staType;
    @ApiModelProperty(value="订单显示天数",name="orderShow")
    private Integer orderShow;
    @ApiModelProperty(value="是否打印二维码",name="isQRCode")
    private Boolean isQRCode;
    @ApiModelProperty(value="二维码图片URL",name="QRCodePicture")
    private String QRCodePicture;
    @ApiModelProperty(value="小票打印文字配置",name="receiptsWords")
    private String receiptsWords;
    @ApiModelProperty(value="微信手续费配置",name="weiChatCharge")
    private String weiChatCharge;
    @ApiModelProperty(value="支付宝手续费配置",name="aLiPayCharge")
    private String aLiPayCharge;
    @ApiModelProperty(value="银联手续费配置",name="unionPayCharge")
    private String unionPayCharge;
    @ApiModelProperty(value="微信收款码",name="weiChatProceed")
    private String weiChatProceed;
    @ApiModelProperty(value="支付宝收款码",name="aLiPayProceed")
    private String aLiPayProceed;
    @ApiModelProperty(value="阿里推送设备id",name="pushDeviceId")
    private String pushDeviceId;
    @ApiModelProperty(value="微信AppId",name="wxAppId")
    private String wxAppId;
    @ApiModelProperty(value="微信密钥",name="wxMchId")
    private String wxMchId;
    @ApiModelProperty(value="微信商户号",name="wxMchKey")
    private String wxMchKey;
    @ApiModelProperty(value="支付宝appId",name="aliAppId")
    private String aliAppId;
    @ApiModelProperty(value="支付宝私钥",name="aliPrivateKey")
    private String aliPrivateKey;
    @ApiModelProperty(value="支付宝公钥",name="aliPublicKey")
    private String aliPublicKey;
}
