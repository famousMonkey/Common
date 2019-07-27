package com.meatball.common.vo.basicsResource;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @ClassName:ProductVo
 * @Description: TODO
 * @Author :周晓瀚
 * @Date:2018/12/3 23:10
 * @Version: 1.0
 **/
@Data
@ApiModel("优惠信息集合")
public class ProductVo {
    // 商品id
    private  String productId;
    // 优惠类型
    private  Integer preferentialType;
    // 订单类型
    private  Integer orderType;
    // 优惠额度
    private BigDecimal preferentialQuota;
}
