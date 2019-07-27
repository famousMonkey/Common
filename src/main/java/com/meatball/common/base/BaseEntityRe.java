package com.meatball.common.base;

import com.vdurmont.emoji.EmojiParser;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.apache.commons.lang.StringUtils;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
@Data
public class BaseEntityRe implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value="ID")
    private String id;

    @ApiModelProperty(value="名称")
    private String name;

    @ApiModelProperty(value="降序字段，多个使用逗号隔开")
    private String desc;

    @ApiModelProperty(value="升序字段，多个使用逗号隔开")
    private String asc;

    public String getName() {
        return StringUtils.isNotEmpty(name)? EmojiParser.parseToUnicode(name):name;
    }

    public void setName(String name) {
        this.name = StringUtils.isNotEmpty(name)?EmojiParser.parseToAliases(name):name;
    }

}
