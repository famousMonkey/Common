package com.meatball.common.vo.discount.customize;

import lombok.Data;

import java.util.List;

/**
 * @Title: DiscountStatus.java
 * @Description: todo()
 * @Author: 马志超
 * @Date: 2018/12/3 15:25
 * @Version: V1.0
 */
@Data
public class DiscountStatus {

    private String orderId;

    private List<String> disCouponIds;

    private Integer status;
}
