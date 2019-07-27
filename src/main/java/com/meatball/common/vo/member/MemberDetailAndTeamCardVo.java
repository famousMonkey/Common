package com.meatball.common.vo.member;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Transient;
import java.math.BigDecimal;

@Data
@ApiModel("会员详情信息VO类")
public class MemberDetailAndTeamCardVo extends MemberVo{

    /**
     * 会员账户余额
     */
    @ApiModelProperty(value = "会员账户余额")
    private BigDecimal totalAmount = new BigDecimal( 0 );

    /**
     * 剩余积分
     */
    @ApiModelProperty(value = "剩余积分")
    private Integer residueIntegral;

    /**
     * 可用卡券
     */
    @ApiModelProperty(value = "可用卡券",hidden = true)
    private Integer availableCardTicket;

    /**
     * 关联卡号
     */
    @ApiModelProperty(value = "关联卡号")
    private String associationNum;

    /**
     * 汽油账户余额
     */
    @ApiModelProperty(value = "汽油账户余额", example = "1000.00")
    private BigDecimal gasolineAmount = new BigDecimal( 0 );

    /**
     * 柴油账户余额
     */
    @ApiModelProperty(value = "柴油账户余额", example = "1000.00")
    private BigDecimal dieseloilAmount = new BigDecimal( 0 );

    /**
     * 天然气账户余额
     */
    @ApiModelProperty(value = "天然气账户余额", example = "1000.00")
    private BigDecimal cngAmount = new BigDecimal( 0 );

    /**
     * 团体账户余额
     */
    @ApiModelProperty(value = "团体账户余额", example = "1000.00")
    private BigDecimal teamsAmount=new BigDecimal( 0 );

    /**
     * 账户类型(40:通用账户41:汽油42:柴油43:CNG(天然气)
     */
    @ApiModelProperty(value = "账户类型40:通用账户41:汽油42:柴油43:CNG(天然气)")
    private Integer accountType;
    /**
     * 类型
     */
    @ApiModelProperty(value = "账户类型40:通用账户41:汽油42:柴油43:CNG(天然气)")
    private Integer status;

    /////////////////////////////团体卡信息//////////////////////////////

    /**
     * 会员id
     */
    @ApiModelProperty(value = "会员id", example = "小小")
    private String memberId;

    /**
     * 昵称
     */
    @ApiModelProperty(value = "昵称", example = "小小")
    private String nickName;

    /**
     * 团体卡号
     */
    @ApiModelProperty(value = "团体卡号", example = "小小")
    private String teamCardNumber;

    /**
     * 车牌
     */
    @ApiModelProperty(value = "车牌", example = "168a1008b1634eca91f91a56ce921bf8")
    private String carNumber;

    /**
     * 识别卡号
     */
    @ApiModelProperty(value = "识别卡号", example = "168a1008b1634eca91f91a56ce921bf8")
    private String entityCardNumber;

    /**
     * 是否主卡
     */
    @ApiModelProperty(value = "是否主卡 1:主卡 0:副卡", example = "false")
    private Integer isMainCard;


    /**
     * 限用金额
     */
    @ApiModelProperty(value = "限用金额", example = "1000.00")
    private BigDecimal limitAmount = new BigDecimal( 0 );

    /**
     * 是否限额
     */
    @ApiModelProperty(value = "是否限额 1:限额 0:不限额,默认0", example = "false")
    private Integer islimit;

    /**
     * 限额周期
     */
    @Transient
    @ApiModelProperty(value = "限额周期 week,month", example = "false")
    private String cycle;

    /**
     * 已用金额
     */
    @ApiModelProperty(value = "已用金额", example = "1000.00")
    private BigDecimal usedAmount = new BigDecimal( 0 );

    /**
     * 剩余金额
     */
    @ApiModelProperty(value = "剩余金额", example = "1000.00")
    private BigDecimal surplusAmount = new BigDecimal( 0 );

    /**
     * 状态
     */
    @ApiModelProperty(value = "状态", example = "0：正常  1：停用")
    private Integer state;

}
