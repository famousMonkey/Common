package com.meatball.common.vo.classes;

import com.alibaba.fastjson.annotation.JSONField;
import com.meatball.common.base.BaseEntity;
import com.meatball.common.utils.DateSerializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName:班组执勤
 * @Description: TODO
 * @Author :孙明
 * @Date:2018/11/2 15:56
 * @Version: 1.0
 **/
@Data
public class SquadDutyVo extends BaseEntity implements Serializable {


    /**
     * 班组Id
     */
    @ApiModelProperty(value = "班组Id", example = "班组Id")
    private String squadId;

    /**
     * 油站id
     */
    @ApiModelProperty(value = "油站Id", example = "油站Id")
    private String oilStationId;

    /**
     * 时间标签
     */
    @JSONField(serializeUsing = DateSerializer.class)
    @ApiModelProperty(value = "时间标签", example = "时间标签")
    private Date timeLabel;

    /**
     * 班组负责人id
     */
    @ApiModelProperty(value = "班组负责人id", example = "班组负责人id")
    private String squadLeaderId;

    /**
     * 班次班组ID
     */
    @ApiModelProperty(value = "班次班组ID", example = "班次班组ID")
    private String shiftsSquadId;

    /**
     * 交班班组ID
     */
    @ApiModelProperty(value = "交班班组ID", example = "交班班组ID")
    private String handoverSquadId;

    /**
     * 接班班组Id
     */
    @ApiModelProperty(value = "接班班组Id", example = "接班班组Id")
    private String receiveSquadId;

    /**
     * 交班人员ID
     */
    @ApiModelProperty(value = "交班人员ID", example = "交班人员ID")
    private String handoverStaffId;

    /**
     * 接班人员Id
     */
    @ApiModelProperty(value = "接班人员Id", example = "接班人员Id")
    private String receiveStaffId;


    /**
     * 上班时间
     */
    @JSONField(serializeUsing = DateSerializer.class)
    @ApiModelProperty(value = "上班时间", example = "2018-12-04 08:20:59")
    private Date toWorkTime;

    /**
     * 下班时间
     */
    @JSONField(serializeUsing = DateSerializer.class)
    @ApiModelProperty(value = "下班时间", example = "2018-12-04 08:20:59")
    private Date offWorkTime;

    /**
     * 现金收款
     */
    @ApiModelProperty(value = "现金收款", example = "50.00")
    @Column(scale = 2)
    private BigDecimal cashReceipts;

    /**
     * 现金收款笔数
     */
    @ApiModelProperty(value = "现金收款笔数", example = "20")
    private Integer cashReceiptsCount;

    /**
     * 刷卡收款
     */
    @ApiModelProperty(value = "刷卡收款", example = "50.00")
    @Column(scale = 2)
    private BigDecimal cardReceipts;

    /**
     * 刷卡收款笔数
     */
    @ApiModelProperty(value = "刷卡收款笔数", example = "20")
    private Integer cardReceiptsCount;
    /**
     * 微信收款
     */
    @ApiModelProperty(value = "微信收款", example = "50")
    @Column(scale = 2)
    private BigDecimal weChat;

    /**
     * 微信收款笔数
     */
    @ApiModelProperty(value = "微信收款笔数", example = "20")
    private Integer weChatCount;
    /**
     * 支付宝收款
     */
    @ApiModelProperty(value = "支付宝收款", example = "50.00")
    @Column(scale = 2)
    private BigDecimal alipay;

    /**
     * 支付宝收款笔数
     */
    @ApiModelProperty(value = "支付宝收款笔数", example = "20")
    private Integer alipayCount;
    /**
     * 储值收款
     */
    @ApiModelProperty(value = "储值收款", example = "50.00")
    @Column(scale = 2)
    private BigDecimal storedReceipts;

    /**
     * 储值收款笔数
     */
    @ApiModelProperty(value = "储值收款笔数", example = "20")
    private Integer storedReceiptsCount;

    /**
     * 白条收款
     */
    @ApiModelProperty(value = "白条收款", example = "50.00")
    @Column(scale = 2)
    private BigDecimal blankNote;

    /**
     * 白条收款收款笔数
     */
    @ApiModelProperty(value = "白条收款收款笔数", example = "20")
    private Integer blankNoteCount;

    /**
     * 收款总额
     */
    @ApiModelProperty(value = "油品收款总额", example = "5000.00")
    @Column(scale = 2)
    private BigDecimal total;

    /**
     * 油品销售数量
     */
    @ApiModelProperty(value = "油品销售数量", example = "300.00")
    @Column(scale = 2)
    private BigDecimal saleTotal;

    /**
     * 排班时间
     */
    @ApiModelProperty(value = "排班时间", example = "06:00:00-12:00:00")
    private String orderTime;

    /**
     * 状态
     */
    @ApiModelProperty(value = "状态 0:分配 1:执勤中 2:交接中 3:完成", example = "状态 0:分配 1:执勤中 2:交接中 3:完成")
    @Column(length = 2)
    private int status;
    /**
     * 描述
     */
    @ApiModelProperty(value = "描述", example = "描述")
    private String description;

    /**以下为便利店销售数据*/

    /**
     * 便利店-销售订单总额
     */
    @ApiModelProperty(value = "便利店-销售订单总额", example = "5000.00")
    @Column(scale = 2)
    private BigDecimal storeTotal;

    /**
     * 便利店-销售实付总额
     */
    @ApiModelProperty(value = "便利店-销售实付总额", example = "4000.00")
    @Column(scale = 2)
    private BigDecimal storeActualTotal;

    /**
     * 便利店-销售优惠总额
     */
    @ApiModelProperty(value = "便利店-销售优惠总额", example = "1000.00")
    @Column(scale = 2)
    private BigDecimal storeDiscountTotal;

    /**
     * 便利店-销售商品数量
     */
    @ApiModelProperty(value = "便利店-销售商品数量", example = "20")
    private Integer storeCommodityNumber;


    /**
     * 便利店-核销积分总数
     */
    @ApiModelProperty(value = "便利店-核销积分总数", example = "20000")
    private Integer storeIntegralTotal;


    /**
     * 便利店-核销商品数量
     */
    @ApiModelProperty(value = "便利店-核销商品数量", example = "30")
    private Integer storeIntegralNumber;


    /**
     * 便利店-核销积分笔数
     */
    @ApiModelProperty(value = "便利店-核销积分笔数", example = "6")
    private Integer storeIntegralCount;


}


