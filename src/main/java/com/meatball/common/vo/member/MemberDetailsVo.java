package com.meatball.common.vo.member;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
@ApiModel("会员详情信息VO类")
public class MemberDetailsVo extends MemberVo{
    /**
     * 会员账户余额
     */
    @ApiModelProperty(value = "会员账户余额")
    private BigDecimal totalAmount;

    /**
     * 通用账户余额
     */
    @ApiModelProperty(value = "通用账户余额", example = "1000.00")
    private BigDecimal BlankNoteAmount;

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
    private BigDecimal gasolineAmount;

    /**
     * 柴油账户余额
     */
    @ApiModelProperty(value = "柴油账户余额", example = "1000.00")
    private BigDecimal dieseloilAmount;

    /**
     * 天然气账户余额
     */
    @ApiModelProperty(value = "天然气账户余额", example = "1000.00")
    private BigDecimal cngAmount;

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


}
