package com.meatball.common.vo.discountvo;

import com.meatball.common.vo.basicsResource.customize.CommodityTradeVo;
import com.meatball.common.vo.basicsResource.customize.OilsTradeVo;
import com.meatball.common.vo.member.MemberVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @ClassName:BlanketVo
 * @Description: TODO
 * @Author :周晓瀚
 * @Date:2018/11/20 16:39
 * @Version: 1.0
 **/
@Data
@ApiModel("总订单vo")
public class BlanketVo implements Serializable{

    @ApiModelProperty("会员实体")
    private MemberVo memberVo;

    @ApiModelProperty("油品信息实体")
    private OilsTradeVo oilVo;

    @ApiModelProperty("商品实体集合")
    private List<CommodityTradeVo> productVos;

    @ApiModelProperty("优惠券id集合")
    private List<String> disCouponIds;

    @ApiModelProperty("是否参加活动/0是/1否")
    private int isJoinDiscount;


    @ApiModelProperty("活动优惠名称")
    private String discountName;

    @ApiModelProperty("活动配置名称")
    private String settingName;

    @ApiModelProperty("活动配置规则")
    private String settingRule;

    @ApiModelProperty("单价")
    private BigDecimal oilUnitPrice;

    @ApiModelProperty("数量")
    private  BigDecimal quantity;

    @ApiModelProperty("金额")
    private BigDecimal amount;

    @ApiModelProperty("油站优惠信息vo")
    private List<OilStationDiscountVo> oilStationDiscountVos;

    @ApiModelProperty("优惠券")
    private List<DiscountCoupon> discountCoupons;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("总优惠")
    private BigDecimal totalDisCount;

    @ApiModelProperty("实际支付金额")
    private BigDecimal actualAmount;
}
