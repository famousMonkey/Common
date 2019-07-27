package com.meatball.common.vo.basicsResource.customize;
/**
 * Project Name:UserMemberVo.java
 * File Name:UserMemberVo.java
 * Date:2018/11/30 14:12
 * Copyright (c) 2018, xia.yukunu@foxmail.com All Rights Reserved.
 */
import com.meatball.common.vo.member.MemberVo;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Title: UserMemberVo.java
 * @Description: todo()
 * @Author: 夏玉昆
 * @Date: 2018/11/30 14:12
 * @Version: V1.0
 */
@Data
public class UserMemberVo extends MemberVo {
    /**
     * 用户住址
     */
    @ApiModelProperty(name = "用户住址")
    private String userAddress;

    /**
     * 地址详情
     */
    @ApiModelProperty("地址详情")
    private String addressDetail;

    /**
     * 身份证号
     */
    @ApiModelProperty(name = "身份证号")
    private String cardNum;
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
     * 性别
     */
    @ApiModelProperty(name = "性别")
    private Integer userSex;
    /**
     * 真名
     */
    @ApiModelProperty(name = "真名")
    private String nickName;
    /**
     * 用户编号
     */
    @ApiModelProperty(name = "用户编号")
    private String userNum;
}
