package com.meatball.common.base;

import com.alibaba.fastjson.annotation.JSONField;
import com.meatball.common.utils.DateSerializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
@Data
public class BaseVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value="删除状态",hidden = true)
    private Boolean deleted;

    @ApiModelProperty(value="插入人员",hidden = true)
    private String creator;

    @JSONField(serializeUsing = DateSerializer.class)
    @ApiModelProperty(value="插入时间",hidden = true)
    private Date createdTime;

    @ApiModelProperty(value="最后操作人员",hidden = true)
    private String lastModifier;

    @JSONField(serializeUsing = DateSerializer.class)
    @ApiModelProperty(value="最后操作时间",hidden = true)
    private Date lastModifiedTime;
}
