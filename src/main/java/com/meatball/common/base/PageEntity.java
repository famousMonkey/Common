package com.meatball.common.base;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * @author: 张垒
 * @date: 2018/11/24 下午15:16
 */
@MappedSuperclass
@Data
public class PageEntity implements Serializable {

    @ApiModelProperty(value="当前页码")
    private Integer pageNum;

    @ApiModelProperty(value="页面数量")
    private Integer pageSize;

}
