package com.meatball.common.base;

import com.meatball.common.client.BaseClient;
import com.meatball.common.constant.MeatballConst;
import com.meatball.common.response.PageResultMsg;
import com.meatball.common.response.ResultMsg;
import com.meatball.common.vo.loginvo.LoginVo;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author: 张垒
 * @date: 2018/11/4 下午6:09
 */
public class BaseController{



    /**
     * 不存在线程问题
     */
    @Autowired
    private HttpSession session = null;

    @Autowired
    private HttpServletRequest request;

    @Autowired
    BaseClient client;


    /**
     * 获取操作人员名称
     */
    public String getOperationPerson() {
        String access_token = getAccessToken();
        if(StringUtils.isNotBlank(access_token)){
            ResultMsg<LoginVo> resultMsg = client.analysisJWT(access_token);
            if (resultMsg != null && resultMsg.getCode()==10000 && resultMsg.getData() != null) {
                return resultMsg.getData().getId();
            }
        }
        return "系统管理员";
    }
    /**
     * 获取操作人员账号
     */
    public String getOperationPersonAccount() {
        String access_token = getAccessToken();
        if(StringUtils.isNotBlank(access_token)){
            ResultMsg<LoginVo> resultMsg = client.analysisJWT(access_token);
            if (resultMsg != null && resultMsg.getCode()==10000 && resultMsg.getData() != null) {
                return resultMsg.getData().getAccount();
            }
        }
        return "系统管理员";
    }

    /**
     * 获取操作人员id
     */
    public String getOperationPersonName() {
        String access_token = getAccessToken();
        if(StringUtils.isNotBlank(access_token)){
            ResultMsg<LoginVo> resultMsg = client.analysisJWT(access_token);
            if (resultMsg != null && resultMsg.getCode()==10000 && resultMsg.getData() != null) {
                if(StringUtils.isNotBlank(resultMsg.getData().getName())){
                    return resultMsg.getData().getName();
                }else {
                    return "系统管理员";
                }

            }
        }
        return "系统管理员";
    }

    public String getAccessToken() {
        String access_token = request.getHeader("access_token");
        return access_token;
    }

    /**
     * 获取远程连接地址
     */
    public String getRemoteAddr(){
        return request.getRemoteAddr();
    }


    /**
     * 封装插入公用属性
     */
    public void packageInsertProperty (BaseEntity resourceInfo) {

        String userId = this.getOperationPersonName();
        resourceInfo.setDeleted(false);
        resourceInfo.setCreatedTime(new Date());
        resourceInfo.setCreator(userId);

        resourceInfo.setLastModifiedTime(new Date());
        resourceInfo.setLastModifier(userId);

    }

    /**
     * 封装插入公用属性
     */
    public void packageInsertProperty (BaseEntityVo resourceInfo) {

        String userId = this.getOperationPersonName();
        resourceInfo.setDeleted(false);
        resourceInfo.setCreatedTime(new Date());
        resourceInfo.setCreator(userId);

        resourceInfo.setLastModifiedTime(new Date());
        resourceInfo.setLastModifier(userId);

    }

    /**
     * 封装插入公用属性
     */
    public void packageInsertProperty (BaseVo resourceInfo) {
        String userId = this.getOperationPersonName();
        resourceInfo.setDeleted(false);
        resourceInfo.setCreatedTime(new Date());
        resourceInfo.setCreator(userId);

        resourceInfo.setLastModifiedTime(new Date());
        resourceInfo.setLastModifier(userId);

    }


    /**
     * 封装修改公用属性
     */
    public void packageUpdateProperty (BaseEntity resourceInfo) {
        resourceInfo.setLastModifiedTime(new Date());
        resourceInfo.setLastModifier(this.getOperationPersonName());
    }

    /**
     * 封装修改公用属性
     */
    public void packageUpdateProperty (BaseEntityVo resourceInfo) {
        resourceInfo.setLastModifiedTime(new Date());
        resourceInfo.setLastModifier(this.getOperationPersonName());
    }

    /**
     * 封装修改公用属性
     */
    public void packageUpdateProperty (BaseVo resourceInfo) {
        resourceInfo.setLastModifiedTime(new Date());
        resourceInfo.setLastModifier(this.getOperationPersonName());
    }

    /**
     * 获取响应正常时的封装对象
     */
    public ResultMsg getSuccessCode () {
        return new ResultMsg(MeatballConst.ResultCode.SUCCESS.CODE,
                MeatballConst.ResultCode.SUCCESS.MESSAGE);

    }

    /**
     * 获取响应正常时的封装对象
     */
    public ResultMsg getPdaSuccessCode () {
        return new ResultMsg(MeatballConst.ResultCode.SUCCESS.CODE,
                MeatballConst.RESULT_BLANK);

    }

    /**
     * 获取响应正常时的封装对象
     * 单个对象
     */
    public ResultMsg getSuccessCode (Object object) {
        return new ResultMsg(MeatballConst.ResultCode.SUCCESS.CODE,MeatballConst.ResultCode.SUCCESS.MESSAGE,
                object);
    }


    /**
     * 获取响应正常时的封装对象
     * 不分页列表
     */
    public PageResultMsg getSuccessCode (List list) {
        return new PageResultMsg(MeatballConst.ResultCode.SUCCESS.CODE,MeatballConst.ResultCode.SUCCESS.MESSAGE,
                list==null? 0:list.size(),list);

    }


    /**
     * 获取响应正常时的封装对象
     * 分页列表
     */
    public PageResultMsg getSuccessCode (Page page) {
        return new PageResultMsg(MeatballConst.ResultCode.SUCCESS.CODE,MeatballConst.ResultCode.SUCCESS.MESSAGE,
                page.getTotalElements(),page.getContent());
    }

    /**
     * 获取响应正常时的封装对象
     * 分页列表
     */
    public PageResultMsg getSuccessCode(PageInfo pageInfo){
        return new PageResultMsg(MeatballConst.ResultCode.SUCCESS.CODE,MeatballConst.ResultCode.SUCCESS.MESSAGE,
                pageInfo.getTotalElements(),pageInfo.getContent());
    }

    /**
     * 获取响应异常的封装对象
     * 单个对象
     */
    public ResultMsg getErrorCode(String message){
        return new ResultMsg(MeatballConst.ResultCode.ADDORMODIFY_DEFEATED.CODE,
                message);
    }

    /**
     * 获取响应异常的封装对象
     * 列表
     */
    public PageResultMsg getPageErrorCode(String message){
        return new PageResultMsg(MeatballConst.ResultCode.ADDORMODIFY_DEFEATED.CODE,
                message);
    }

    /**
     * 获取自定义响应封装
     */
    public ResultMsg getCustomizeCode (int code,String message) {
        return new ResultMsg(code,message);
    }

    /**
     * 获取自定义响应封装
     */
    public ResultMsg getCustomizeCode (int code, String message, Serializable serializable) {
        return new ResultMsg(code,message,serializable);
    }
}