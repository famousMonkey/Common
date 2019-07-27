package com.meatball.common.utils;

import org.apache.commons.lang.StringUtils;

/**
 * @Title: OrderNumberUtil.java
 * @Description: todo(编号生成类 - 订单/会员编号等)
 * @Author: 孙明
 * @Date: 2018/11/26 下午2:45
 * @Version: V1.0
 */
public class NumberUtil {

    /**
     * 生成会员编号
     * @return
     */
    public String createMemberNumber(){
        return String.valueOf( ((Math.random()*9+1)*10000000) );
    }

    /**
     * 生成订单编号
     * @param memberNumber 会员编号
     * @return
     */
    public String createOrderNumber(String memberNumber){
        String orderNumber = String.valueOf(((Math.random()*9+1)*1000000000));
        if(StringUtils.isNotEmpty(memberNumber)){
            return orderNumber+orderNumber;
        }
        return null;
    }
}
