package com.meatball.common.base;

import com.alibaba.fastjson.annotation.JSONField;
import com.meatball.common.utils.DateSerializer;
import com.vdurmont.emoji.EmojiParser;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.apache.commons.lang.StringUtils;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

/**
 * @author: 张垒
 * @date: 2018/11/4 下午6:16
 */
@MappedSuperclass
@Data
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value="主键id，新增时不传值")
    @Id
    @GenericGenerator(name = "UUID", strategy = "com.meatball.common.base.ResourceUUIDGenerator")
    @GeneratedValue(generator = "UUID")
    @Column(name = "RES_ID", length = 24) private String id;


    @ApiModelProperty(value="名称")
    @Column(name = "RES_NAME", length = 512)
    private String name;

    @ApiModelProperty(value="别名" ,hidden = true)
    @Column(name = "ALIAS") private String alias;

    @ApiModelProperty(value="标签",hidden = true)
    @Column(name = "TAGS", length = 512) private String tags;

    @ApiModelProperty(value="插入人员",hidden = true)
    @Column(name = "CREATOR", nullable = false)
    private String creator;

    @ApiModelProperty(value="删除状态",hidden = true)
    @Column(name = "DELETED",nullable = false ) private Boolean deleted;

    @JSONField(serializeUsing = DateSerializer.class)
    @ApiModelProperty(value="插入时间",hidden = true)
    @Column(name = "CREATED_TIME", nullable = false, length = 11)
    private Date createdTime;


    @ApiModelProperty(value="最后操作人员",hidden = true)
    @Column(name = "LAST_MODIFIER", nullable = false)
    private String lastModifier;

    @JSONField(serializeUsing = DateSerializer.class)
    @ApiModelProperty(value="最后操作时间",hidden = true)
    @Column(name = "LAST_MODIFIED_TIME", nullable = false, length = 11)
    private Date lastModifiedTime;

    public String getCreator() {
        return StringUtils.isNotEmpty(creator)?EmojiParser.parseToUnicode(creator):creator;
    }

    public void setCreator(String creator) {
        this.creator = StringUtils.isNotEmpty(creator)?EmojiParser.parseToAliases(creator):creator;
    }

    public String getLastModifier() {
        return StringUtils.isNotEmpty(lastModifier)?EmojiParser.parseToUnicode(lastModifier):lastModifier;
    }

    public void setLastModifier(String lastModifier) {
        this.lastModifier = StringUtils.isNotEmpty(lastModifier)?EmojiParser.parseToAliases(lastModifier):lastModifier;
    }

    public String getName() {
        return StringUtils.isNotEmpty(name)?EmojiParser.parseToUnicode(name):name;
    }

    public void setName(String name) {
        this.name = StringUtils.isNotEmpty(name)?EmojiParser.parseToAliases(name):name;
    }
}
