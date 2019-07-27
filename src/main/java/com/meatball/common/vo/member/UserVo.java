package com.meatball.common.vo.member;
/**
 * Project Name:UserVo.java
 * File Name:UserVo.java
 * Date:2018/11/30 14:10
 * Copyright (c) 2018, xia.yukunu@foxmail.com All Rights Reserved.
 */
import com.meatball.common.base.BaseEntityVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
/**
 * @Title: UserVo.java
 * @Description: todo()
 * @Author: 夏玉昆
 * @Date: 2018/11/30 14:10
 * @Version: V1.0
 */
@Data
@ApiModel("用户信息VO类")
public class UserVo extends BaseEntityVo {
    /**
     * 用户编号
     */
    @ApiModelProperty(name = "用户编号")
    private String userNum;
    /**
     * 真名
     */
    @ApiModelProperty(name = "真名")
    private String nickName;
    /**
     * 性别
     */
    @ApiModelProperty(name = "性别")
    private Integer userSex;
    /**
     * 用户生日
     */
    @ApiModelProperty(name = "用户生日")
    private String userBirthday;
    /**
     * 手机号
     */
    @ApiModelProperty(name = "手机号")
    private String phoneNum;
    /**
     * 身份证号
     */
    @ApiModelProperty(name = "身份证号")
    private String cardNum;
    /**
     * 用户住址
     */
    @ApiModelProperty(name = "用户住址")
    private String userAddress;
    /**
     * 车牌号
     */
    @ApiModelProperty(name = "车牌号")
    private String carNum;
    /**
     * 类型
     */
    @ApiModelProperty(name = "类型")
    private Integer itemType;
    /**
     * 密码
     */
    @ApiModelProperty(name = "密码")
    private String password;
    /**
     * 地址详情
     */
    @ApiModelProperty("地址详情")
    private String addressDetail;
    /**
     * unionId
     */
    @ApiModelProperty(name = "unionId")
    private String unionId;
}
