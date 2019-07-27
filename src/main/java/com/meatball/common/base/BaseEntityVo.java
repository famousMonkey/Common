package com.meatball.common.base;

import com.vdurmont.emoji.EmojiParser;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.apache.commons.lang.StringUtils;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Data
public class BaseEntityVo extends BaseVo{

    @ApiModelProperty(value="ID")
    private String id;

    @ApiModelProperty(value="名称")
    private String name;

    @ApiModelProperty(value="别名")
    private String alias;

    public String getName() {
        return StringUtils.isNotEmpty(name)? EmojiParser.parseToUnicode(name):name;
    }

    public void setName(String name) {
        this.name = StringUtils.isNotEmpty(name)?EmojiParser.parseToAliases(name):name;
    }

}
