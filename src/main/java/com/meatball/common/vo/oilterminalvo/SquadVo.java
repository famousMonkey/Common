package com.meatball.common.vo.oilterminalvo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName:SquadVo
 * @Description: TODO
 * @Author :周晓瀚
 * @Date:2018/12/4 11:34
 * @Version: 1.0
 **/
@Data
@ApiModel("班组信息实体类")
public class SquadVo{
    @ApiModelProperty(value="负责人id")
    private String principalId;
    @ApiModelProperty(value="负责人名称")
    private String principalName;
    @ApiModelProperty(value="所属油站")
    private String oilStationId;
    @ApiModelProperty(value="描述")
    private String squadDescribe;
    @ApiModelProperty(value="状态")
    private  Integer staType;
}
