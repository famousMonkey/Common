package com.meatball.common.vo.account.customize;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import java.math.BigDecimal;


/**
 * @Title: AccountInfoVo
 * @Description: todo(储值出入信息VO)
 * @Author: 孙明
 * @Date: 2018/11/23 9:35
 * @Version: V1.0
 */
@Data
@ApiModel(value = "储值出入信息VO")
public class AccountInfoVo {

    /**
     * 组织ID
     */
    @ApiModelProperty(value = "组织ID", example = "168a1008b1634eca91f91a56ce921bf8")
    @Column(length = 32)
    private String orgId;
    /**
     * 油站ID
     */
    @ApiModelProperty(value = "油站ID", example = "168a1008b1634eca91f91a56ce921bf8")
    private String oilStationId;

    @ApiModelProperty(value = "会员ID",example = "168a1008b1634eca91f91a56ce921bf8")
    private String memberId;

    @ApiModelProperty(value = "会员名称", example = "王思思", required = true)
    private String name;

    @ApiModelProperty(value = "金额", example = "1000.00")
    private BigDecimal amount=new BigDecimal( 0 );

    @ApiModelProperty(value = "类型",example = "1：充值  2：消费  3：支付退款 4：充值退款")
    private int type;

    @ApiModelProperty(value = "账户类型", example = "40：通用账户  41：汽油账户  42：柴油账户  43：天然气账户")
    private int accountType;

    @ApiModelProperty(value = "支付密码",example = "123456")
    private String passWord;

    @ApiModelProperty(value = "相关id",example = "168a1008b1634eca91f91a56ce921bf8")
    private String relevantId;

    @ApiModelProperty(value = "相关编号",example = "168a1008b1634eca91f91a56ce921bf8")
    private String relevantCode;

    @ApiModelProperty(value = "描述", example = "描述")
    private String description;
}