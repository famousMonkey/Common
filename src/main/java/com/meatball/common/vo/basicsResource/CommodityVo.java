package com.meatball.common.vo.basicsResource;

import com.meatball.common.base.BaseEntityVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@ApiModel("商品信息")
public class CommodityVo extends BaseEntityVo {

    @ApiModelProperty(value="商品编码")
    private String commodityNo;

    @ApiModelProperty(value="油站Id",name="oilStationId")
    private String oilStationId;

    @ApiModelProperty(value="条形码")
    private String barCode;

    @ApiModelProperty(value="商品类别",name="category")
    private String category;

    @ApiModelProperty(value="品牌信息")
    private String brandId;

    @ApiModelProperty(value="商品规格")
    private String commoditySpecs;

    @ApiModelProperty(value="单位")
    private String commodityUtil;

    @ApiModelProperty(value="现价")
    private BigDecimal sellingPrice;

    @ApiModelProperty(value="状态")
    private Integer commSta;

    @ApiModelProperty(value="描述")
    private String commDescribe;

    @ApiModelProperty(value="数量")
    private Integer quantity;


    @ApiModelProperty(value="原价")
    private BigDecimal originalPrice;

    @ApiModelProperty(value="优惠的金额")
    private  BigDecimal preferentialPrice;

    @ApiModelProperty(value="可用库存")
    private Integer availableStock;

    @ApiModelProperty(value="图片路径")
    private String[] pictureUrl;

    @ApiModelProperty(value="生产日期",name="productionDate")
    private Date productionDate;

    @ApiModelProperty(value="保质期",name="expirationDate")
    private String expirationDate;

    @ApiModelProperty(value="生产商Id",name="ManufacturerId")
    private String manufacturerId;

    @ApiModelProperty(value="生产商名称",name="ManufacturerName")
    private String manufacturerName;

    @ApiModelProperty(value="是否开启预警")
    private Boolean earlyWarning;

    @ApiModelProperty(value="商品小于开启预警",name="lessThan")
    private Integer lessThan;

    @ApiModelProperty(value="最大库存",name="maxStock")
    private Integer  maxStock;

    @ApiModelProperty(value="最大库存单位",name="maxStockUtil")
    private String   maxStockUtil;

    @ApiModelProperty(value="商品库存",name="stock")
    private Integer stock;

    @ApiModelProperty(value="预售库存",name="advanceCount")
    private Integer advanceCount;
}
