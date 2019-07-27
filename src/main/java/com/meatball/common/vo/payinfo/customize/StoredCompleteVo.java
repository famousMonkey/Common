package com.meatball.common.vo.payinfo.customize;
/**
 * Project Name:StoredCompleteVo.java
 * File Name:StoredCompleteVo.java
 * Date:2019/7/18 14:32
 * Copyright (c) 2019, xia.yukunu@foxmail.com All Rights Reserved.
 */
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Title: StoredCompleteVo.java
 * @Description: todo(储值订单通知VO)
 * @Author: 夏玉昆
 * @Date: 2019/7/18 14:32
 * @Version: V1.0
 */
@Data
public class StoredCompleteVo implements Serializable {
    /**
     * 油站ID
     */
    private String oilStationId;

    /**
     * 手機號碼
     */
    private String mobile;

    /**
     * 會員ID
     */
    private String memberId;

    /**
     * 储值金额
     */
    private String storedAmount;

    /**
     * 账户余额
     */
    private String balance;

    /**
     * 储值时间
     */
    private Date storedTime;

    /**
     * 付款方式
     */
    private String payMethod;
}