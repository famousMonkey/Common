package com.meatball.common.vo.member;
/**
 * Project Name:MemberVo.java
 * File Name:MemberVo.java
 * Date:2018/12/14 20:49
 * Copyright (c) 2018, xia.yukunu@foxmail.com All Rights Reserved.
 */

import com.alibaba.fastjson.annotation.JSONField;
import com.meatball.common.base.BaseEntityVo;
import com.meatball.common.utils.DateSerializer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;


/**
 * @Title: MemberVo.java
 * @Description: todo()
 * @Author: 夏玉昆
 * @Date: 2018/12/14 20:49
 * @Version: V1.0
 */
@Data
@ApiModel("会员信息实体类")
public class MemberVo extends BaseEntityVo {
    /**
     * 车牌号
     */
    @ApiModelProperty(value = "车牌号")
    private String carNum;
    /**
     * 会员编号
     */
    @ApiModelProperty(value = "会员编号")
    private String memberNum;
    /**
     * 会员卡级别
     */
    @ApiModelProperty(value = "会员卡级别")
    private Integer memberCardLevel;
    /**
     * 会员卡名称
     */
    @ApiModelProperty(value = "会员卡名称")
    private String memberCardName;
    /**
     * 会员卡ID
     */
    @ApiModelProperty(value = "会员卡ID")
    private String memberCardId;
    /**
     * 团体信息
     */
    @Deprecated
    @ApiModelProperty(value = "团体信息")
    private String teamInfoId ;
    /**
     * 用户头像url
     */
    @ApiModelProperty(value = "用户头像url")
    private String headimgurl;
    /**
     * 分组信息
     */
    @ApiModelProperty(value = "分组信息")
    private String groupInfoId ;
    /**
     * 描述
     */
    @ApiModelProperty(value = "描述",hidden = true)
    private String dsc;
    /**
     * 用户信息
     */
    @Deprecated
    @ApiModelProperty(value = "用户信息")
    private String userId;
    /**
     * 微信信息
     */
    @ApiModelProperty(value = "微信信息")
    private String weChatUserId;
    /**
     *姓名
     */
    @ApiModelProperty(value = "姓名")
    private String fullName;
    /**
     * 油站信息
     */
    @ApiModelProperty(value = "油站信息")
    private String oilStationId;
    /**
     * 认证手机号
     */
    @ApiModelProperty(value = "认证手机号")
    private String phone;
    /**
     * unionId
     */
    @Deprecated
    @ApiModelProperty(value = "unionId")
    private String unionId;
    /**
     * openid
     */
    @Deprecated
    @ApiModelProperty(value = "openid")
    private String openid;
    /**
     * 会员生日
     */
    @ApiModelProperty(value = "会员生日")
    private String userBirthday;
    /**
     * 身份证号
     */
    @ApiModelProperty(value = "身份证号")
    private String cardNum;
    /**
     * 用户住址
     */
    @ApiModelProperty(value = "用户住址")
    private String userAddress;
    /**
     * 性别
     */
    @ApiModelProperty(value = "性别")
    private Integer userSex;
    /**
     * 状态
     */
    @ApiModelProperty(value = "状态")
    private Integer status;

    /**
     * 班组ID
     */
    @ApiModelProperty(value = "班组ID")
    private String teamId;

    /**
     * 执勤班组ID
     */
    @ApiModelProperty(value = "执勤班组ID")
    private String dutyTeams;

    /**
     * 详情地址
     */
    @ApiModelProperty(value = "详情地址")
    private String addressDetail;

//    @ApiModelProperty(value="名称")
//    private String name;

    /**
     * 分组名称
     */
    @ApiModelProperty(value = "分组名称")
    private String groupName;

    /**
     * 实体卡号
     */
    @ApiModelProperty(value = "实体卡号")
    private String entityCardNum;

    /**
     * 绑卡时间
     */
    @JSONField(serializeUsing = DateSerializer.class)
    @ApiModelProperty("绑卡时间")
    private Date bindingCardTime;

    /**
     * 实体卡状态
     */
    @ApiModelProperty(value = "实体卡状态")
    private Integer cardStatus;

    /**
     * 首次加油时间
     */
    @ApiModelProperty(value = "首次加油时间")
    private Date firstOilTime;

    /**
     * 最后加油时间
     */
    @ApiModelProperty(value = "最后加油时间")
    private Date lastOilTime;

    /**
     * 注册时间
     */
    @ApiModelProperty(value = "注册时间")
    private Date registerTime;

    /**
     * 品牌商ID
     */
    @ApiModelProperty(value = "品牌商ID")
    private String orgId;

    /**
     * 注册会员来源(,0小程序 1PDA 2收银台)
     */
    @ApiModelProperty(value = "注册会员来源,0小程序 1PDA 2收银台 3后台(导入)")
    private Integer registerSource;

    /**
     * 团体卡ID
     */
    @ApiModelProperty(value = "团体卡ID")
    private String teamCardId;

    /**
     * 是否主卡
     */
    @ApiModelProperty(value = "是否主卡 1:主卡 0:副卡", example = "false")
    private Integer isMainCard;

    /**
     * 会员类型(1团体)
     */
    @ApiModelProperty(value = "会员类型 1:团体 0：会员")
    private Integer memberType;

}
