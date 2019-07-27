package com.meatball.common.vo.classes;

import com.alibaba.fastjson.annotation.JSONField;
import com.meatball.common.base.BaseEntityVo;
import com.meatball.common.utils.DateSerializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class StaffDutyVo extends BaseEntityVo{
    /**
     * 员工id
     */
    @ApiModelProperty(value = "员工id", example = "员工id")

    private String staffId;


    /**
     * 油站id
     */
    @ApiModelProperty(value = "油站Id", example = "油站Id")

    private String oilStationId;

    /**
     * 班组Id
     */
    @ApiModelProperty(value = "班组Id", example = "班组Id")

    private String squadId;

    /**
     * 班组执勤Id
     */
    @ApiModelProperty(value = "班组执勤Id", example = "班组执勤Id")

    private String dutyId;

    /**
     * 上班时间
     */
    @JSONField(serializeUsing = DateSerializer.class)
    @ApiModelProperty(value = "上班时间", example = "2018-12-04 08:20:59")
    private Date toWorkTime;

    /**
     * 下班时间
     */
    @JSONField(serializeUsing = DateSerializer.class)
    @ApiModelProperty(value = "下班时间", example = "2018-12-04 08:20:59")
    private Date offWorkTime;

    /**
     * 现金收款
     */
    @ApiModelProperty(value = "现金收款", example = "现金收款")
    private BigDecimal cashReceipts=new BigDecimal( 0 );

    /**
     * 刷卡收款
     */
    @ApiModelProperty(value = "刷卡收款", example = "刷卡收款")
    private BigDecimal cardReceipts=new BigDecimal( 0 );
    /**
     * 第三方收款
     */
    @ApiModelProperty(value = "第三方收款", example = "第三方收款")
    private BigDecimal thirdPartyReceipts=new BigDecimal( 0 );
    /**
     * 储值收款
     */
    @ApiModelProperty(value = "储值收款", example = "储值收款")
    private BigDecimal storedReceipts=new BigDecimal( 0 );

    /**
     * 时间标签
     */
    @JSONField(serializeUsing = DateSerializer.class)
    @ApiModelProperty(value = "时间标签", example = "时间标签")
    private Date timeLabel;

    /**
     * 状态
     */
    @ApiModelProperty(value = "状态", example = "状态")

    private Integer status;

    /**
     * 描述
     */
    @ApiModelProperty(value = "描述", example = "描述")
    private String description;
}
