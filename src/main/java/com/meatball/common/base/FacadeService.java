package com.meatball.common.base;

import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Map;

/**
 * @author: 张垒
 * @date: 2018/11/4 下午5:15
 */
public interface FacadeService<T>{

    Boolean saveResourceInfo(T resourceInfo);

    Boolean updateResourceInfo(T resourceInfo);

    Boolean deleteResourceInfo(List<T> list);

    T selectResourceInfo(String resourceId);

    Page<T> queryPage(Map<String, String> query);

    List<T> queryList(Map<String, String> query);
}