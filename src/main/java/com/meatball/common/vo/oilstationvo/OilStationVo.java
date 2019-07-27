package com.meatball.common.vo.oilstationvo;

import com.meatball.common.base.BaseEntityVo;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName OilStationVo
 * @Description //油站支付信息
 * @Author 宋正健
 * @Date 2019/3/11 11:27
 * @Version 1.0
 **/
@Data
public class OilStationVo extends BaseEntityVo {
    @ApiModelProperty(value="油站编号")
    private String oilStationNumber;

    @ApiModelProperty(value="所属区域")
    private String areaCode;

    @ApiModelProperty(value="所属区域名称")
    private String areaName;

    @ApiModelProperty(value="详细地址")
    private String oilStationSite;

    @ApiModelProperty(value="经度")
    private String longitude;

    @ApiModelProperty(value="纬度")
    private String Latitude;

    @ApiModelProperty(value="联系方式")
    private String oilStationContact;

    @ApiModelProperty(value="简介")
    private String oilStationIntroduction;

    @ApiModelProperty(value="状态")
    private Integer staType;

    @ApiModelProperty(value="负责人ID")
    private String principalId;

    @ApiModelProperty(value="负责人Name")
    private String principalName;

    @ApiModelProperty(value="负责人手机号")
    private String principalPhone;

    @ApiModelProperty(value="负责人安全密码")
    private String safePass;

    @ApiModelProperty(value="版本",example = "0基础版，1减配版，2标准版")
    private  Integer version;

    @ApiModelProperty(value="是否有PDA",example = "0：没有，1：有")
    private Integer havePDA;

    @ApiModelProperty(value="通联商户号")
    private String merchantId;

    @ApiModelProperty(value="通联支付密钥")
    private String merchantSecret;

    @ApiModelProperty(value="通联appId")
    private String appId;

    @ApiModelProperty(value="小程序密钥")
    private String subSecret;

    @ApiModelProperty(value="小程序appid")
    private String subAppId;

    @ApiModelProperty(value="通知APPID")
    private String notifyAppId;

    @ApiModelProperty(value="通知密钥")
    private String notifySecret;

    @ApiModelProperty(value="是否开通一体机")
    private Boolean haveDispenser;

    @ApiModelProperty(value="subKey")
    private String subKey;

    @ApiModelProperty(value="公众号图片")
    private String officialAccount;

    @ApiModelProperty(value="小程序图片")
    private String appletUrl;

    @ApiModelProperty(value="展示小程序或者公众号(1.公众号2.小程序)")
    private Integer exhibition;

    @ApiModelProperty(value="是否绑定油枪")
    private Integer bindingOilGun;

    @ApiModelProperty(value="是否开启线上支付")
    private Boolean onlinePayment;

    @ApiModelProperty(value="是否打通油机")
    private Boolean oilEngine;

    @ApiModelProperty(value="组织信息Id")
    private String orgId;

    @ApiModelProperty(value="哆啦宝使用key",name="dlbAccessKey")
    private String dlbAccessKey;

    @ApiModelProperty(value="哆啦宝密钥",name="dlbSecretKey")
    private String dlbSecretKey;

    @ApiModelProperty(value="哆啦宝客户编号",name="dlbCustomerNum")
    private String dlbCustomerNum;

    @ApiModelProperty(value="哆啦宝商店编号",name="dlbShopNum")
    private String dlbShopNum;

    @ApiModelProperty(value="结算平台类型",name="SettlementType  1.哆啦宝 2. 通联")
    private Integer settlementType;

}
