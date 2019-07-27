package com.meatball.common.vo.vipaccount;

import com.meatball.common.base.BaseEntityVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

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
public class VipAccountInfoVo extends BaseEntityVo {

    /**
     * 油站ID
     */
    @ApiModelProperty(value = "油站ID", example = "168a1008b1634eca91f91a56ce921bf8", required = true)
    private String oilStationId;

    /**
     * 会员ID
     */
    @ApiModelProperty(value = "会员ID", example = "168a1008b1634eca91f91a56ce921bf8", required = true)
    private String memberId;

    /**
     * 账户余额
     */
    @ApiModelProperty(value = "账户余额", example = "1000.00", required = true)
    private BigDecimal totalAmount=new BigDecimal( 0 );

    /**
     * 汽油账户余额
     */
    @ApiModelProperty(value = "汽油账户余额", example = "1000.00")
    private BigDecimal gasolineAmount=new BigDecimal( 0 );

    /**
     * 柴油账户余额
     */
    @ApiModelProperty(value = "柴油账户余额", example = "1000.00")
    private BigDecimal dieseloilAmount=new BigDecimal( 0 );

    /**
     * 天然气账户余额
     */
    @ApiModelProperty(value = "天然气账户余额", example = "1000.00")
    private BigDecimal cngAmount=new BigDecimal( 0 );


    /**
     * 支付密码
     */
    @ApiModelProperty(value = "支付密码", example = "Yy123..", required = true)
    private String passWord;

    /**
     * 描述
     */
    @ApiModelProperty(value = "描述", example = "描述", required = true)
    private String description;

}