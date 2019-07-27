package com.meatball.common.vo.payinfo.customize;

import com.alibaba.fastjson.annotation.JSONField;
import com.meatball.common.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName RefundInfo
 * @Description //TODO
 * @Author 宋正健
 * @Date 2019/2/19 17:54
 * @Version 1.0
 **/
@Data
@ApiModel(value = "退款信息实体")
public class RefundInfo extends BaseEntity {

    @ApiModelProperty(value = "退款单号")
    private String refundNum;


    @ApiModelProperty(value = "退款金额")
    private BigDecimal refundAmount;


    @ApiModelProperty(value = "相关id")
    private String currentId;


    @ApiModelProperty(value = "类型",example = "1:总订单 2:油品订单 3:商品订单 4:储值订单")
    private Integer type;


    @ApiModelProperty(value = "退款状态")
    private Integer refundStatus;

    //@Temporal(value = TemporalType.DATE)
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "退款发起时间")
    private Date refundStartTime;

    //@Temporal(value = TemporalType.DATE)
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "退款完成时间")
    private Date refundEndTime;


    @ApiModelProperty(value = "描述")
    private String description;

}
