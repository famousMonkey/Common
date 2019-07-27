package com.meatball.common.vo.discount.customize;

import com.alibaba.fastjson.annotation.JSONField;
import com.meatball.common.base.BaseVo;
import com.meatball.common.utils.DateSerializer;
import com.meatball.common.vo.basicsResource.customize.CommodityTradeVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * @Title: DiscountVo.java
 * @Description: todo(油站优惠vo)
 * @Author: 马志超
 * @Date: 2018/11/13 14:44
 * @Version: V1.0
 */
@Data
@ApiModel("油站优惠信息")
public class DiscountVo extends BaseVo {

    @ApiModelProperty("活动优惠id")
    private String discountId;

    @ApiModelProperty("优惠规则id")
    private String discountRuleId;

    @ApiModelProperty("商品类别0全部/1油/2商品")
    private Integer productType;

    @JSONField(serializeUsing = DateSerializer.class)
    @ApiModelProperty("活动开始时间")
    private Date startTime;

    @JSONField(serializeUsing = DateSerializer.class)
    @ApiModelProperty("活动结束时间")
    private Date endTime;

    @ApiModelProperty("活动优惠配置名称")
    private String settingName;

    @ApiModelProperty("最低消费")
    private BigDecimal minCharge;

    @ApiModelProperty("优惠规则名称")
    private String settingRuleName;

    @ApiModelProperty("优惠金额")
    private BigDecimal discountAmount;

    @ApiModelProperty("满足活动的商品集合")
    private List<CommodityTradeVo> productVos;

}
