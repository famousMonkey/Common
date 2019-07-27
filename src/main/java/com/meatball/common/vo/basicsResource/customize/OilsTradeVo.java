package com.meatball.common.vo.basicsResource.customize;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Title: null.java
 * @Description: todo()
 * @Author: 马志超
 * @Date: 2018/11/27 19:57
 * @Version: V1.0
 */
@Data
public class OilsTradeVo extends OilsDiscountsVo{

    /**
     * 员工id
     */
    private String staffId;

    /**
     * 员工执勤信息ID
     */
    private String staffDutyId;

    /**
     * 班组id
     */
    private String squadId;


    /**
     * 班组执勤Id
     */
    private String dutyId;

    /**
     * 油枪名称
     */
    private String oilGunName;


    // 数量
    private BigDecimal quantity;

    // 总金额
    private BigDecimal amount;

    // 结账方式,默认0
    // 0:订单总额=总金额，实收金额计算，优惠后少收钱。
    // 1:实收金额=总金额，订单总额计算，优惠后多给油。
    private Integer tradeType=0;
}
