package com.meatball.common.auth;

import com.meatball.common.utils.MD5Util;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class Authentication {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    /**
     * 通过token 判断该用户是否有权限访问
     * @param toKen
     * @param authorization
     * @return
     */
    public void isPermitted(String toKen, String authorization){
        String key = MD5Util.MD5Encode(toKen);
        String result = stringRedisTemplate.opsForValue().get(key);
        //如果缓存过期或者为空，用户重新登录
        if(StringUtils.isEmpty( result )){
            throw new AuthorizationException();
        }
        if(StringUtils.isNotEmpty( result )){
            String[] authArray = result.split( "," );
            String[] authorizationArray = authorization.split( "," );
            for(String authorizationStr : authorizationArray){
                boolean haveAuthc = Arrays.asList(authArray).contains(authorizationStr);
                if(haveAuthc){
                    return;
                }
            }
        }
        throw new UnauthorizedException();
    }
}
