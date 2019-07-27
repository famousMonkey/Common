package com.meatball.common.vo.oilstationvo;

import com.meatball.common.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @ClassName:OilStationAccountInfoVo
 * @Description: TODO
 * @Author :周晓瀚
 * @Date:2018/12/9 15:53
 * @Version: 1.0
 **/
@ApiModel("油站预收账户信息")
@Data
public class OilStationAccountInfoVo extends BaseEntity implements Serializable {
    /**
     * 油站ID
     */
    @ApiModelProperty(value = "油站ID")

    private String oilStationId;
    /**
     * 油站名称
     */
    @ApiModelProperty(value = "油站名称")

    private String name;

    /**
     * 油站编码
     */
    @ApiModelProperty(value = "油站编码", example = "1223222", required = true)
    private String oilStationNumber;


    /**
     * 预收总额
     */
    @ApiModelProperty(value = "预收总额")
    private BigDecimal totalAmount;


    @ApiModelProperty(value="组织信息Id",name="orgId")
    private String orgId;

    /**
     * 描述
     */
    @ApiModelProperty(value = "描述")
    private String description;


}
