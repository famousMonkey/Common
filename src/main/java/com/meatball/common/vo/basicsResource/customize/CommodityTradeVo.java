package com.meatball.common.vo.basicsResource.customize;

import com.meatball.common.vo.basicsResource.CommodityVo;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @Title: CommodityTradeVo.java
 * @Description: todo()
 * @Author: 马志超
 * @Date: 2018/11/27 19:50
 * @Version: V1.0
 */
@Data
public class CommodityTradeVo extends CommodityVo {
        //总金额
        private BigDecimal amount;
}
