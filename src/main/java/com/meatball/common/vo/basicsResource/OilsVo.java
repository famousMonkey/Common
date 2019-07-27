package com.meatball.common.vo.basicsResource;

import com.meatball.common.base.BaseEntityVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**油品信息
 * @ClassName:OilsVo
 * @Description: TODO
 * @Author :周晓瀚
 * @Date:2018/11/27 16:57
 * @Version: 1.0
 **/
@Data
@ApiModel("油品信息")
public class OilsVo extends BaseEntityVo {

    @ApiModelProperty(value="油品编号")
    private String oilsNo;

    @ApiModelProperty(value="油品分类")
    private Integer oilsType;

    @ApiModelProperty(value="单价")
    private BigDecimal  price;

    @ApiModelProperty(value="油站Id")
    private String oilStationId;

    @ApiModelProperty(value="描述")
    private String oilsDescribe;

    @ApiModelProperty(value="状态(0禁用，1启用)")
    private Integer oilsSta;

    @ApiModelProperty(value="油品级别")
    private String oilsLevel;

    @ApiModelProperty(value="油品分类名称")
    private String oilsCategory;

    @ApiModelProperty(value="字典油品Id")
    private String dictionaryId;

    @ApiModelProperty(value="组织信息Id")
    private String orgId;
}
