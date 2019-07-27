/**
 * Project Name:Integral.java
 * File Name:Integral.java
 * Date:2018/10/30 9:23
 * Copyright (c) 2018,m18813049340@163.com All Rights Reserved.
 */
package com.meatball.common.vo.account.customize;

import com.meatball.common.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import java.math.BigDecimal;

/**
 * @Title: OrganizationVo.java
 * @Description: 组织预收账户信息
 * @Author: 孙明
 * @Date: 2019/5/16 10:59
 * @Version: V1.0
 */

@ApiModel(value = "组织预收账户信息")
@Data
public class OrganizationVo extends BaseEntity {

    /**
     * 组织ID
     */
    @ApiModelProperty(value = "组织ID", example = "168a1008b1634eca91f91a56ce921bf8")
    @Column(length = 32)
    private String orgId;

    /**
     * 预收总额
     */
    @ApiModelProperty(value = "预收总额", example = "2000", required = true)
    @Column(scale = 2)
    private BigDecimal totalAmount = new BigDecimal( 0 );

    /**
     * 汽油账户余额
     */
    @ApiModelProperty(value = "汽油账户余额", example = "1000.00")
    @Column(scale = 2)
    private BigDecimal gasolineAmount = new BigDecimal( 0 );

    /**
     * 柴油账户余额
     */
    @ApiModelProperty(value = "柴油账户余额", example = "1000.00")
    @Column(scale = 2)
    private BigDecimal dieseloilAmount = new BigDecimal( 0 );

    /**
     * 天然气账户余额
     */
    @ApiModelProperty(value = "天然气账户余额", example = "1000.00")
    @Column(scale = 2)
    private BigDecimal cngAmount = new BigDecimal( 0 );

    /**
     * 描述
     */
    @ApiModelProperty(value = "描述", example = "描述")
    @Column(length = 1000)
    private String description;
}
