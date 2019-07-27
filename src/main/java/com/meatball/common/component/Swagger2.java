/**
 * Project Name:meatball-admin
 * File Name:Swagger2.java
 * Package Name:com.meatball.core.component
 * Date:2017年10月16日下午6:43:07
 * Copyright (c) 2017, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.common.component;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMethod;
import springfox.documentation.builders.*;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.service.ResponseMessage;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Title: Swagger2.java
 * @Package com.meatball.core.component
 * @Description: TODO(Swagger2配置)
 * @author 張翔宇
 * @date 2017年10月16日 下午6:43:07
 * @version V1.0
 */
@Configuration
@EnableSwagger2
public class Swagger2 {
	
	/**
	 * @Title: createRestApi 
	 * @Description: TODO(文档@ApiOperation注解来给API增加说明、
	 * 		通过@ApiImplicitParams、@ApiImplicitParam注解来给参数增加说明。) 
	 * @return Docket    返回类型
	 */
	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.meatball"))
				.paths(PathSelectors.any())
				.build()
				.globalOperationParameters(this.setHeaderToken())
				.useDefaultResponseMessages(false)
				.globalResponseMessage(RequestMethod.POST, this.setResponseMessage())
				.globalResponseMessage(RequestMethod.GET,this.setResponseMessage())
				.globalResponseMessage(RequestMethod.PUT, this.setResponseMessage())
				.globalResponseMessage(RequestMethod.DELETE, this.setResponseMessage());
				
	}

	/**
	 * @Title: apiInfo 
	 * @Description: TODO(版本信息备注) 
	 * @return
	 * @return ApiInfo    返回类型
	 */
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("MiniDolphin Integral Apis")
				//.description("更多Spring Boot相关文章请关注：https://my.oschina.net/qjedu")
				.termsOfServiceUrl("http://xxx.xxx.com/")
				//.contact(new Contact("張翔宇", "https://my.oschina.net/qjedu", "zhang.xiangyu@foxmail.com"))
				.license("Apache 2.0")
				.licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
				.version("1.0").build();
	}

	/**
	 * @Title: apiInfo
	 * @Description: TODO(添加自定义返回code)
	 * @return ApiInfo    返回类型
	 */
	private List<ResponseMessage> setResponseMessage() {
		return new ArrayList<>(Arrays.asList(new ResponseMessageBuilder()
				.code(404)
				.message("找不到请求页面")
				.responseModel(new ModelRef("错误"))
				.build()));
	}

	/**
	 * @Title: apiInfo
	 * @Description: TODO(添加自定义参数)
	 * @return ApiInfo    返回类型
	 */
	private List<Parameter> setHeaderToken() {
		ParameterBuilder tokenPar = new ParameterBuilder();
		List<Parameter> pars = new ArrayList<>();
		tokenPar.name("access_token")
				.description("认证令牌")
				.modelRef(new ModelRef("string"))
				.parameterType("header")
				.required(false)
				.build();
		pars.add(tokenPar.build());
		return pars;
	}
 }
