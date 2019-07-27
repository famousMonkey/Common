package com.meatball.common.client;

import com.meatball.common.response.ResultMsg;
import com.meatball.common.vo.basicsResource.OilsVo;
import com.meatball.common.vo.loginvo.LoginVo;
import com.meatball.common.vo.oilstationvo.OilStationVo;
import com.meatball.common.vo.vipaccount.VipAccountInfoVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface BaseClient {
    @GetMapping(value = "/api/authenticate/token/analysisJWT/{param}")
    ResultMsg<LoginVo> analysisJWT(@PathVariable("param") String param);

    //调用油站服务
    @GetMapping("/api/oilstationservice/oilstation/{resourceId}")
    ResultMsg<OilStationVo> queryOilStationById(@PathVariable("resourceId") String resourceId);

    //调用油站服务
    @GetMapping("/api/basicsresourceservice/oils/{resourceId}")
    ResultMsg<OilsVo> queryOilsById(@PathVariable("resourceId") String resourceId);



}
