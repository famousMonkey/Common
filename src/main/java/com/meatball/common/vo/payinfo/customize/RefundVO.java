package com.meatball.common.vo.payinfo.customize;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName RefundVO
 * @Description //退款VO
 * @Author 宋正健
 * @Date 2019/2/19 17:43
 * @Version 1.0
 **/
@ApiModel(value = "退款VO")
@Data
public class RefundVO {
    @ApiModelProperty(value = "订单id", example = "总订单id/储值单id",required = true)
    private String orderId;
    @ApiModelProperty(value = "商品订单id", example = "油品订单id/商品单id")
    private String goodsId;
    @ApiModelProperty(value = "类型", example = "1:总订单 2:油品订单 3:商品订单 4:储值订单",required = true)
    private Integer type;
    @ApiModelProperty(value = "员工id", required = true)
    private String employeeId;
    @ApiModelProperty(value = "安全密码", required = true)
    private String password;
}
