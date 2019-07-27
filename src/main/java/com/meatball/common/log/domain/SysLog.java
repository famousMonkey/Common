package com.meatball.common.log.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.Date;

@Data
public class SysLog implements Serializable {
	private static final long serialVersionUID = 1L;

    /**
     * 自增ID
     */
    @Id
	private String id;

    /**
     * 操作描述
     */
    private String description;

    /**
     * 操作方法
     */
    private String method;

    /**
     * 请求参数
     */
    private String params;

    /**
     * 类型
     */
    private Integer type;

    /**
     * 请求地址
     */
    private String requestIp;

    /**
     * 异常代码
     */
    private String exceptionCode;

    /**
     * 异常明细
     */
    private String exceptionDetail;

    /**
     * 操作人
     */
    private String operateUser;

    /**
     * 操作时间
     */
    private Date operateDate;
}