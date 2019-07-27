package com.meatball.common.vo.loginvo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Title: LoginVo
 * @Description: todo(登录返回信息VO)
 * @Author: 孙明
 * @Date: 2018/11/23 9:35
 * @Version: V1.0
 */
@Data
@ApiModel(value = "登录返回信息VO")
public class LoginVo {

    @ApiModelProperty(value = "手机号码",example = "13888888888")
    private String phone;

    @ApiModelProperty(value = "员工名称", example = "王思思", required = true)
    private String name;

    @ApiModelProperty(value = "员工id", example = "LnuEux-RQNKDWCGhay3tpg")
    private String id;

    @ApiModelProperty(value = "员工类型 staff:油站员工", example = "staff")
    private String type;

    @ApiModelProperty(value = "员工账号", example = "wangsisi")
    private String account;

}