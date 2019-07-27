package com.meatball.common.base;

import com.meatball.common.client.BaseClient;
import com.meatball.common.response.ResultMsg;
import com.meatball.common.utils.DateUtil;
import com.meatball.common.vo.basicsResource.OilsVo;
import com.meatball.common.vo.loginvo.LoginVo;
import com.meatball.common.vo.oilstationvo.OilStationVo;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.*;
import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

//import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * @author: 张垒
 * @date: 2018/11/5 上午9:04
 */
public class BaseService<T> {

    public static final int pageNum = 1;

    public static final int pageSize = 10;

    public static final String delimiter = ".";

    public static final String orderCondition = "createdTime";


    @Autowired
    private HttpServletRequest request;

    @Autowired
    BaseClient client;

//    @Autowired
//    private StringRedisTemplate stringRedisTemplate;

    /**
     * 获取操作人员名称
     */
    public String getOperationPerson() {
        String access_token = getAccessToken();
        if(StringUtils.isNotBlank(access_token)){
            ResultMsg<LoginVo> resultMsg = client.analysisJWT(access_token);
            if (resultMsg != null && resultMsg.getCode()==10000 && resultMsg.getData() != null) {
                if(StringUtils.isNotBlank(resultMsg.getData().getName())){
                    return resultMsg.getData().getName();
                }else {
                    return "系统管理员";
                }
            }
        }
        return "系统管理员";
    }

    /**
     * 获取操作人员名称
     */
    public String getOperationPersonId() {
        String access_token = getAccessToken();
        if(StringUtils.isNotBlank(access_token)){
            ResultMsg<LoginVo> resultMsg = client.analysisJWT(access_token);
            if (resultMsg != null && resultMsg.getCode()==10000 && resultMsg.getData() != null) {
                return resultMsg.getData().getId();
            }
        }
        return "系统管理员";
    }

    /**
     * 获取登录信息
     */
    public LoginVo getLoginInfo() {
        String access_token = getAccessToken();
        if(StringUtils.isNotBlank(access_token)){
            ResultMsg<LoginVo> resultMsg = client.analysisJWT(access_token);
            if (resultMsg != null && resultMsg.getCode()==10000 && resultMsg.getData() != null) {
                return resultMsg.getData();
            }
        }
        return null;
    }

    public String getAccessToken() {
        String access_token = request.getHeader("access_token");
        return access_token;
    }

    /**
     * 封装插入公用属性
     */
    public void packageInsertProperty (BaseEntity resourceInfo) {

        String userId = this.getOperationPerson();
        resourceInfo.setDeleted(false);
        resourceInfo.setCreatedTime(new Date());
        resourceInfo.setCreator(userId);

        resourceInfo.setLastModifiedTime(new Date());
        resourceInfo.setLastModifier(userId);
    }


    /**
     * 封装插入公用属性
     */
    public void packageInsertProperty (BaseEntity resourceInfo,BaseVo baseVo) {

        resourceInfo.setDeleted(false);
        resourceInfo.setCreatedTime(new Date());
        resourceInfo.setCreator(baseVo.getCreator());

        resourceInfo.setLastModifiedTime(new Date());
        resourceInfo.setLastModifier(baseVo.getLastModifier());
    }

    /**
     * 封装插入公用属性
     */
    public void packageInsertProperty (BaseVo resourceInfo,BaseVo baseVo) {

        resourceInfo.setDeleted(false);
        resourceInfo.setCreatedTime(new Date());
        resourceInfo.setCreator(baseVo.getCreator());

        resourceInfo.setLastModifiedTime(new Date());
        resourceInfo.setLastModifier(baseVo.getLastModifier());

    }

    /**
     * 封装插入公用属性
     */
    public void packageInsertProperty (BaseEntity resourceInfo,BaseEntity baseEntity) {

        resourceInfo.setDeleted(false);
        resourceInfo.setCreatedTime(new Date());
        resourceInfo.setCreator(baseEntity.getCreator());

        resourceInfo.setLastModifiedTime(new Date());
        resourceInfo.setLastModifier(baseEntity.getLastModifier());

    }

    /**
     * 封装修改公用属性
     */
    public void packageUpdateProperty (BaseEntity resourceInfo) {
        String userId = this.getOperationPerson();
        resourceInfo.setLastModifiedTime(new Date());
        resourceInfo.setLastModifier(userId);
    }

    /**
     * 封装修改公用属性
     */
    public void packageUpdateProperty (BaseEntity resourceInfo,BaseVo baseVo) {
        resourceInfo.setLastModifiedTime(new Date());
        resourceInfo.setLastModifier(baseVo.getLastModifier());
    }

    /**
     * 封装修改公用属性
     */
    public void packageUpdateProperty (BaseVo resourceInfo,BaseVo baseVo) {
        resourceInfo.setLastModifiedTime(new Date());
        resourceInfo.setLastModifier(baseVo.getLastModifier());
    }

    /**
     * 封装修改公用属性
     */
    public void packageUpdateProperty (BaseEntity resourceInfo,BaseEntity baseEntity) {
        resourceInfo.setLastModifiedTime(new Date());
        resourceInfo.setLastModifier(baseEntity.getLastModifier());
    }

    /**
     * 封装查询条件
     * 规则：
     * 查询条件根据json中的key为基准，多层嵌套使用key.key为查询时的参数名
     * 排序条件根据json中的key为基准，多层嵌套使用key.key为排序时的参数名
     * 分页条件使用pageNum，pageSize标记，默认为第一页，每页10条
     */
    public Map<String, Object> queryUsualPageCondition (Map<String, String> query) {
        query.put("deleted","false");
        return checkQueryCommonConditon(query);
    }

    public Map<String, Object> checkQueryCommonConditon (Map<String, String> query) {
        Map<String, String> queryConditionMap = new HashMap<String, String>();
        int pageNum = BaseService.pageNum;
        int pageSize = BaseService.pageSize;
        List<Order> orderList = new ArrayList<>();
        for (String queryKey : query.keySet()) {
            String queryValue = (String)query.get(queryKey);
            if ("pageNum".equalsIgnoreCase(queryKey)) {
                try {
                    pageNum = Integer.parseInt(queryValue);
                } catch (Exception e) {
                }
                continue;
            }
            if ("pageSize".equalsIgnoreCase(queryKey)) {
                try {
                    pageSize = Integer.parseInt(queryValue);
                } catch (Exception e) {
                }
                continue;
            }
            queryConditionMap.put(queryKey, queryValue);
        }
        Pageable pageable;
        pageable = PageRequest.of(pageNum - 1, pageSize);
        Specification<T> specification = packageQueryCondition(queryConditionMap);
        Map<String, Object> afterCheckCondition = new HashMap<>();
        afterCheckCondition.put("specification", specification);
        afterCheckCondition.put("pageable", pageable);
        return afterCheckCondition;
    }

    public Specification<T> queryUsualListCondition (Map<String, String> query) {
        query.put("deleted","false");
        return queryCommonListCondition(query);
    }

    public Specification<T> queryCommonListCondition (Map<String, String> query) {
        return packageQueryCondition(query);
    }

    /**
     * 使用预设格式将字符串转为Date
     */
    private static Date parse(String strDate){
        try {
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = format.parse(strDate);
            return date;
        } catch (Exception e) {
            return null;
        }
    }

    /**
     *  封装查询条件
     *  规则：
     *          日期要求格式：毫秒值
     *          比较条件的要求：value@0，其中0等于(默认)，1大于，2小于, 3不等于,4代表like,
     *          5大于等于(日期类型)，6小于等于（日期类型）,7In多结果查询逗号隔开
     *          当存在同一级相同字段的区间查询时，如createdTime在某个区间，key值需要用'##'+@5或@6拼接
     */
    public Specification<T> packageQueryCondition (final Map<String, String> queryConditionMap) {
        if (queryConditionMap == null || queryConditionMap.size() == 0) {
            return null;
        }
        Specification<T> queryCondition = new Specification<T>() {
            @Override
            public Predicate toPredicate(Root<T> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                List<Predicate> predicates = new ArrayList<>();
                List<Order> orders = new ArrayList<>();
                Map<String,Join> joinMap = new HashMap<>();
                for (String queryKey : queryConditionMap.keySet()) {
                    // 剔除所有条件为空字符的条件
                    if(StringUtils.isBlank(queryConditionMap.get(queryKey))){
                        continue;
                    }
                    Path path;
                    if(queryKey.equals("desc") || queryKey.equals("asc")){
                        String values = parseParamName(queryConditionMap.get(queryKey));
                        for (String value : values.split(",")){
                            path = root.get(parseParamName(value));
                            if(queryKey.equals("desc")){
                                Order order = criteriaBuilder.desc(path);
                                orders.add(order);
                            }else {
                                Order order = criteriaBuilder.asc(path);
                                orders.add(order);
                            }
                        }
                        continue;
                    }else if (queryKey.contains(BaseService.delimiter)) {
                        Join<T,Object> joinPath = null;
                        String[] delimiterStr = queryKey.split("\\"+ BaseService.delimiter);
                        if(joinMap.containsKey(delimiterStr[0])){
                            joinPath = joinMap.get(delimiterStr[0]);
                        }else {
                            Join<T,Object> join = root.join(parseParamName(delimiterStr[0]), JoinType.INNER);
                            joinMap.put(delimiterStr[0],join);
                            joinPath= join;
                        }
                        String delimiterKey = delimiterStr[0];

                        for (int i = 0; i < delimiterStr.length-1; i++) {
                            if (i == 0) {
                                continue;
                            }
                            delimiterKey = delimiterKey+"."+delimiterStr[i];
                            if(joinMap.containsKey(delimiterKey)){
                                joinPath = joinMap.get(delimiterKey);
                            }else {
                                Join<T,Object> join = joinPath.join(parseParamName(delimiterStr[i]), JoinType.INNER);
                                joinMap.put(delimiterKey,join);
                                joinPath= join;
                            }
                        }
                        path = joinPath.get(parseParamName(delimiterStr[delimiterStr.length-1]));
                    } else {
                        path = root.get(parseParamName(queryKey));
                    }

                    String string = queryConditionMap.get(queryKey);

                    String[] valuses = string.split("##");
                    for (String queryValue : valuses){
                        if(StringUtils.isBlank(queryValue)){
                            continue;
                        }
                        String[] delimiterStr = queryValue.split("@");
                        Predicate predicate = null;
                        String nowValue = delimiterStr[0];
                        if (delimiterStr.length == 1) {
                            if ("true".equalsIgnoreCase(nowValue)) {
                                predicate = criteriaBuilder.isTrue(path);
                            }else if ("false".equalsIgnoreCase(nowValue)) {
                                predicate = criteriaBuilder.isFalse(path);
                            } else  if(nowValue.equals("null")){
                                predicate = criteriaBuilder.isNull(path);
                            } else{
                                predicate = criteriaBuilder.equal(path, nowValue);
                            }
                        } else {
                            switch (delimiterStr[1]){
                                case "4":{
                                    predicate = criteriaBuilder.like(path, "%"+nowValue+"%");
                                    break;
                                }
                                case "0":{
                                    if(nowValue.equals("null")){
                                        predicate = criteriaBuilder.isNull(path);
                                    }else {
                                        predicate = criteriaBuilder.equal(path, nowValue);
                                    }
                                    break;
                                }
                                case "1":{
                                    predicate = criteriaBuilder.greaterThan(path, nowValue);
                                    break;
                                }
                                case "2":{
                                    predicate = criteriaBuilder.lessThan(path, nowValue);
                                    break;
                                }
                                case "1_1":{
                                    predicate = criteriaBuilder.greaterThanOrEqualTo(path, nowValue);
                                    break;
                                }
                                case "2_1":{
                                    predicate = criteriaBuilder.lessThanOrEqualTo(path, nowValue);
                                    break;
                                }
                                case "5":{
                                    predicate = criteriaBuilder.greaterThanOrEqualTo(path, DateUtil.minimumParse(nowValue));
                                    break;
                                }
                                case "6":{
                                    predicate = criteriaBuilder.lessThanOrEqualTo(path, DateUtil.maximumParse(nowValue));
                                    break;
                                }
                                case "3":{
                                    if(nowValue.equals("null")){
                                        predicate = criteriaBuilder.isNotNull(path);
                                    }else {
                                        predicate = criteriaBuilder.or(criteriaBuilder.isNull(path),
                                                criteriaBuilder.notEqual(path, nowValue));
                                        if (predicate != null) {
                                            predicates.add(predicate);
                                        }
                                    }
                                    break;
                                }
                                case "7":{
                                    CriteriaBuilder.In<Object> in = criteriaBuilder.in(path);
                                    String[] values = nowValue.split(",");
                                    for (String value : values) {
                                        if(NumberUtils.isNumber(value)){
                                            in.value(NumberUtils.createNumber(value));
                                        }else {
                                            in.value(value);
                                        }

                                    }
                                    predicate = in;
                                    break;
                                }
                            }

                        }
                        if (predicate != null) {
                            predicates.add(predicate);
                        }

                    }

                }
                if(orders.size()>0){
                    criteriaQuery.orderBy(orders);
                }else {
                    criteriaQuery.orderBy(criteriaBuilder.desc(root.get(parseParamName(orderCondition))));
                }
                return criteriaBuilder.and(predicates.toArray(new Predicate[] {}));
            }
        };
        return queryCondition;
    }

    /**
     *  进行区间查询时，参数名还原
     */
    private String parseParamName (String paramName) {
        if (paramName.contains("-")) {
            int index = paramName.indexOf("-");
            return paramName.substring(0, index);
        }
        return paramName;
    }


    public OilStationVo queryOilStation(String oilStationId) {
        if(StringUtils.isBlank(oilStationId)){
            return null;
        }
//        //先从redis中取
//        String s = stringRedisTemplate.opsForValue().get(oilStationId);
//        if (StringUtils.isNotBlank(s)){//redis 有值
//            OilStationVo oilStation = JSON.parseObject(s, OilStationVo.class);
//            if(oilStation != null){
//                return  oilStation;
//            }
//
//        }

        ResultMsg<OilStationVo> resultMsg = client.queryOilStationById(oilStationId);
        if(resultMsg != null && resultMsg.getCode() == 10000){
            return resultMsg.getData();
        }else {
            return null;
        }
    }

    public Boolean isOrganizationOilStation(String oilStationId){
        OilStationVo oilStation = queryOilStation(oilStationId);
        if(oilStation == null || StringUtils.isBlank(oilStation.getOrgId())){
            return false;
        }else {
            return true;
        }
    }

    public OilsVo queryOils(String oilsId) {
        if(StringUtils.isBlank(oilsId)){
            return null;
        }
//        //先从redis中取
//        String s = stringRedisTemplate.opsForValue().get(oilsId);
//        if (StringUtils.isNotBlank(s)){//redis 有值
//            OilsVo oils = JSON.parseObject(s, OilsVo.class);
//            if(oils != null){
//                return  oils;
//            }
//        }

        ResultMsg<OilsVo> resultMsg = client.queryOilsById(oilsId);
        if(resultMsg != null && resultMsg.getCode() == 10000){
            return resultMsg.getData();
        }else {
            return null;
        }
    }
}
