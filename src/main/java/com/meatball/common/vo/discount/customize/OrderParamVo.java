package com.meatball.common.vo.discount.customize;

import com.meatball.common.vo.basicsResource.customize.OilsTradeVo;
import com.meatball.common.vo.member.MemberVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @Title: OrderParamVo.java
 * @Description: todo(待生成订单参数vo)
 * @Author: 马志超
 * @Date: 2018/11/15 10:25
 * @Version: V1.0
 */
@Data
@ApiModel(value = "待生成订单参数vo")
public class OrderParamVo implements Serializable {

    @ApiModelProperty("会员实体")
    private MemberVo member;

    @ApiModelProperty("油品信息实体")
    private OilsTradeVo oil;

   /* @ApiModelProperty("商品实体集合")
    private List<CommodityTradeVo> products;

    @ApiModelProperty("优惠券id集合")
    private List<String> disCoupons;*/

    @ApiModelProperty("是否参加活动/0是/1否")
    private int isJoinDiscount = 0;

}
