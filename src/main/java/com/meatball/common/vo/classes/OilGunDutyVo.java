package com.meatball.common.vo.classes;

import com.alibaba.fastjson.annotation.JSONField;
import com.meatball.common.base.BaseEntityVo;
import com.meatball.common.utils.DateSerializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;


@Data
public class OilGunDutyVo extends BaseEntityVo{
    /**
     * 油枪id
     */
    @ApiModelProperty(value = "油枪id")
    private String oilGunId;


    /**
     * 油品id
     */
    @ApiModelProperty(value = "油品id")
    private String oilsId;

    /**
     * 油品名称
     */
    @ApiModelProperty(value = "油品名称")
    private String oilsName;


    /**
     * 油站id
     */
    @ApiModelProperty(value = "油站Id")
    private String oilStationId;

    /**
     * 班组id
     */
    @ApiModelProperty(value = "班组id")
    private String squadId;

    /**
     * 班组名称
     */
    @ApiModelProperty(value = "班组名称")
    private String squadName;

    /**
     * 员工id
     */
    @ApiModelProperty(value = "员工id")
    private String staffId;

    /**
     * 员工名称
     */
    @ApiModelProperty(value = "员工名称")
    private String staffName;

    /**
     * 员工执勤信息ID
     */
    @ApiModelProperty(value = "员工执勤信息ID")
    private String staffDutyId;

    /**
     * 班组执勤Id
     */
    @ApiModelProperty(value = "班组执勤Id")
    private String dutyId;

    /**
     * 开始时间
     */
    @JSONField(serializeUsing = DateSerializer.class)
    @ApiModelProperty(value = "开始时间")
    private Date toWorkTime;

    /**
     * 接表数
     */
    @ApiModelProperty(value = "接表数")
    private BigDecimal receiveOilGauge=new BigDecimal( 0 );

    /**
     * 结束时间
     */
    @JSONField(serializeUsing = DateSerializer.class)
    @ApiModelProperty(value = "结束时间")
    private Date offWorkTime;

    /**
     * 交表数
     */
    @ApiModelProperty(value = "交表数")
    private BigDecimal handOilGauge=new BigDecimal( 0 );

    /**
     * 测试用油
     */
    @ApiModelProperty(value = "测试用油")
    private BigDecimal testOilGauge=new BigDecimal( 0 );

    /**
     * 油表差值
     */
    @ApiModelProperty(value = "油表差值")
    private BigDecimal differenceValue=new BigDecimal( 0 );

    /**
     * 交接员工id
     */
    @ApiModelProperty(value = "交接员工id")
    private String receiveStaffId;

    /**
     * 交接执勤id
     */
    @ApiModelProperty(value = "交接执勤id")
    private String receiveDutyId;

    /**
     * 时间标签
     */
    @JSONField(serializeUsing = DateSerializer.class)
    @ApiModelProperty(value = "时间标签")
    private Date timeLabel;
    /**
     * 状态
     */
    @ApiModelProperty(value = "状态")
    private Integer status;

    /**
     * 描述
     */
    @ApiModelProperty(value = "描述")
    private String description;
}
