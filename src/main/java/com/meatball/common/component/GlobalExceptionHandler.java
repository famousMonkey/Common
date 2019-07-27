/**
 * Project Name:meatball-core
 * File Name:GlobalExceptionHandler.java
 * Package Name:com.meatball.component
 * Date:2018年1月29日上午11:18:46
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.common.component;

import com.meatball.common.constant.MeatballConst;
import com.meatball.common.exception.SignatureExpiredException;
import com.meatball.common.response.ResultMsg;
import com.meatball.common.response.TokenResultMsg;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.MalformedJwtException;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.security.SignatureException;


/**
 * @Title: GlobalExceptionHandler.java 
 * @Package com.meatball.component 
 * @Description: TODO(注册全局异常处理) 
 * @author 張翔宇  
 * @date 2018年1月29日 上午11:18:46 
 * @version V1.0   
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

	/**
	 * @Title: allExceptionHandler
	 * @Description: TODO(制定权限不足异常)
	 * @throws Exception
	 * @return Map<String,Object>    返回类型
	 */
	@ExceptionHandler(value = UnauthorizedException.class)
	public ResultMsg unauthorizedExceptionHandler(UnauthorizedException e) {
		e.printStackTrace();
		return new ResultMsg(MeatballConst.ResultCode.UNAUTHORIZED_EXCEPTION.CODE,
				MeatballConst.ResultCode.UNAUTHORIZED_EXCEPTION.MESSAGE);
	}

	/**
	 * @Title: expiredJwtException
	 * @Description: TODO(权限校验)
	 * @param e
	 * @return ResultMsg    返回类型
	 */
	@ExceptionHandler(value = ExpiredJwtException.class)
	public ResultMsg expiredJwtExceptionHandler(ExpiredJwtException e) {
		e.printStackTrace();
		return new ResultMsg(MeatballConst.ResultCode.EXPIRED_JWT_EXCEPTION.CODE,
				MeatballConst.ResultCode.EXPIRED_JWT_EXCEPTION.MESSAGE);
	}

	/**
	 * @Title: SignatureException
	 * @Description: TODO(权限校验)
	 * @param e
	 * @return ResultMsg    返回类型
	 */
	@ExceptionHandler(value = SignatureException.class)
	public ResultMsg signatureExceptionHandler(SignatureException e) {
		e.printStackTrace();
		return new ResultMsg(MeatballConst.ResultCode.SIGNATURE_EXCEPTION.CODE,
				MeatballConst.ResultCode.SIGNATURE_EXCEPTION.MESSAGE);
	}

	/**
	 * @Title: SignatureException
	 * @Description: TODO(权限校验)
	 * @param e
	 * @return ResultMsg    返回类型
	 */
	@ExceptionHandler(value = MalformedJwtException.class)
	public ResultMsg malformedJwtExceptionHandler(MalformedJwtException e) {
		e.printStackTrace();
		return new ResultMsg(MeatballConst.ResultCode.MALFORMED_JWT_EXCEPTION.CODE,
				MeatballConst.ResultCode.MALFORMED_JWT_EXCEPTION.MESSAGE);
	}

	/**
	 * @Title: authorizationExceptionHandler
	 * @Description: TODO(请求被拒绝)
	 * @param e
	 * @return ResultMsg    返回类型
	 */
	@ExceptionHandler(value = AuthorizationException.class)
	public ResultMsg authorizationExceptionHandler(AuthorizationException e) {
		e.printStackTrace();
		return new ResultMsg(MeatballConst.ResultCode.AUTHORIZATION_EXCEPTION.CODE,
				MeatballConst.ResultCode.AUTHORIZATION_EXCEPTION.MESSAGE);
	}

	/**
	 * @Title: nullPointerExceptionHandler
	 * @Description: TODO(空异常)
	 * @return ResultMsg    返回类型
	 */
	@ExceptionHandler(value = NullPointerException.class)
	public ResultMsg nullPointerExceptionHandler(NullPointerException e) {
		e.printStackTrace();
		return new ResultMsg(MeatballConst.ResultCode.NULL_POINTER_EXCEPTION.CODE,
				MeatballConst.ResultCode.NULL_POINTER_EXCEPTION.MESSAGE);
	}

	/**
	 * @Title: nullPointerExceptionHandler
	 * @Description: TODO(参数异常)
	 * @param e
	 * @return ResultMsg    返回类型
	 */
	@ExceptionHandler(value = IllegalArgumentException.class)
	public ResultMsg nullPointerExceptionHandler(IllegalArgumentException e) {
		e.printStackTrace();
		return new ResultMsg(MeatballConst.ResultCode.ILLEGAL_ARGUMENT_EXCEPTION.CODE,
				MeatballConst.ResultCode.ILLEGAL_ARGUMENT_EXCEPTION.MESSAGE);
	}

	/**
	 * @Title: signatureExpiredException
	 * @Description: todo(签名错误)
	 * @Params: [e]
	 * @Return     返回类型
	 * @Author 張翔宇
	 * @Date 2018/8/28 上午9:48
	 */
	@ExceptionHandler(value = SignatureExpiredException.class)
	public TokenResultMsg signatureExpiredExceptionHandler(SignatureExpiredException e) {
		e.printStackTrace();
		return new TokenResultMsg(MeatballConst.ResultCode.SIGNATURE_EXPIRED_EXCEPTION.CODE,
				MeatballConst.ResultCode.SIGNATURE_EXPIRED_EXCEPTION.MESSAGE);
	}
	
}
