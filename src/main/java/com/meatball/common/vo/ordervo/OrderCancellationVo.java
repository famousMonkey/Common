package com.meatball.common.vo.ordervo;

import com.meatball.common.base.BaseEntityVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName:
 * @Description: TODO
 * @Author :周晓瀚
 * @Date:2018/12/3 16:09
 * @Version: 1.0
 **/
@Data
@ApiModel("订单取消信息")
public class OrderCancellationVo extends BaseEntityVo{
    @ApiModelProperty(value="订单信息",name="blanketorderId",example = "789654892")

    private String blanketorderId;
    @ApiModelProperty(value="取消原因",name="cancellationReason")

    private String cancellationReason;
    @ApiModelProperty(value="取消日期",name="cancellationDate")

    private String cancellationDate;
    @ApiModelProperty(value="状态",name="cancellationSta")

    private Integer cancellationSta;
    @ApiModelProperty(value="描述",name="cancellationDes")

    private String cancellationDes;
}
