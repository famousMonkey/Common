package com.meatball.common.vo.basicsResource;

import com.meatball.common.base.BaseEntityVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
@ApiModel("油枪信息")
public class OilgunVo extends BaseEntityVo{

    @ApiModelProperty(value="油枪编号",name="oilGunNo")

    private String oilGunNo;

    @ApiModelProperty(value="油枪编码",name="oilGunNum")

    private String oilGunNum;

    @ApiModelProperty(value="油罐ID",name="oilTankId")

    private String oilTankId;

    @ApiModelProperty(value="油罐名称",name="oilTankName")

    private String oilTankName;

    @ApiModelProperty(value="油品ID",name="oilsId")

    private String oilsId;

    @ApiModelProperty(value="油品名称",name="oilsName")

    private String oilsName;

    @ApiModelProperty(value="初始油表",name="initialOil")

    private BigDecimal initialOil;

    @ApiModelProperty(value="油机面板号",name="oilMachine")

    private String oilMachine;

    @ApiModelProperty(value="油机面板型号",name="oilMachineModel",hidden = true)

    private String oilMachineModel;

    @ApiModelProperty(value="是否卡机联动",name="cardMachineLinkage",hidden = true)

    private Integer cardMachineLinkage;

    @ApiModelProperty(value="串口号",name="serialNumber",hidden = true)

    private String serialNumber;

    @ApiModelProperty(value="中控端口",name="controlPort",hidden = true)

    private String controlPort;

    @ApiModelProperty(value="油枪版本",name="oilGunVersions",hidden = true)

    private String oilGunVersions;

    @ApiModelProperty(value="加油机版本",name="tankerVersions",hidden = true)

    private String tankerVersions;

    @ApiModelProperty(value="加油站信息",name="oilStationId")

    private String oilStationId;

    @ApiModelProperty(value="描述",name="oilGunDescribe")

    private String oilGunDescribe;

    @ApiModelProperty(value="状态",name="oilGunSta",hidden = true)

    private Integer oilGunSta;

    @ApiModelProperty(value="单价")
    private BigDecimal price;

    @ApiModelProperty(value="油品级别")
    private String oilsLevel;

    @ApiModelProperty(value="油品分类名称")
    private String oilsCategory;

}
