/**
 * Project Name:MeatballConst.java
 * File Name:MeatballConst.java
 * Date:2018/8/30 下午3:08
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.common.constant;

/**
 * @Title: MeatballConst.java
 * @Description: todo(静态常量定义)
 * @Author: 張翔宇
 * @Date: 2018/8/30 下午3:08
 * @Version: V1.0
 */
public class MeatballConst {
    /**
     * 定义消息队列名
     */
    public final static String STUDENT = "student";
    /**
     * 訂單
     */
    public final static String ORDER = "order";
    /**
     * 班组
     */
    public final static String CLASSES = "classes";
    /**
     * 会员
     */
    public final static String MEMBER_INFO = "member.info";
    /**
     * 儲值訂單
     */
    public final static String ORDER_STORED = "order.stored";
    /**
     * 储值完成通知
     */
    public final static String NOTIFICATION_STORED_COMPLETE = "notification.stored.complete";
    /**
     * 儲值退款訂單
     */
    public final static String ORDER_STORED_RECHARGE = "order.stored.recharge";
    /**
     * 積分
     */
    public final static String INTEGRAL = "integral";
    /**
     * 通知
     */
    public final static String NOTIFICATION_ORDER_COMPLETE = "notification.order.complete";
    /**
     * 操作日志
     */
    public final static String SYSTEM_LOG = "system.log";

    /**
     * 加密盐长度定义
     */
    public static final int SALT_LEGTH = 45;

    /**
     * 设置默认密码及提示
     */
    public static final String DEFAULT_PASSWORD = "88888888";
    public static final String DEFAULT_PASSWORD_MESSAGE = "密码已经重置为[88888888]，请提醒用户尽快修改。";

    /**
     * 设置静态常量：零
     */
    public static final int ZERO = 0;
    /**
     * 设置静态常量：壹
     */
    public static final int ONE = 1;

    /**
     * 设置静态常量：贰
     */
    public static final int TWO = 2;

    /**
     * 设置静态常量：叁
     */
    public static final int THREE = 3;

    /**
     * 设置静态常量：肆
     */
    public static final int FOUR = 4;

    /**
     * 设置静态常量：壹仟
     */
    public static final int ONE_THOUSAND = 1000;

    /**
     * 设置静态常量：-1
     */
    public static final int NEGATIVE_ONE = -1;

    /**
     * 设置静态常量：Appid 前缀
     */
    public static final String APPID_PREFIX = "mt";

    /**
     * 定义静态常量：系统用户标志
     */
    public static final String SYSTEM_USER = "sysUser";

    /**
     * 定义静态常量：角色标志
     */
    public static final String SYSTEM_ROLES = "roles";

    /**
     * 定义静态常量：系统菜单标志
     */
    public static final String SYSTEM_MENUS = "menus";

    /**
     * 应用ID
     */
    public static final String APPID = "appId";

    /**
     * 应用秘钥
     */
    public static final String APPSECRET = "appsecret";

    /**
     * 时间戳
     */
    public static final String TIMESTAMP = "timestamp";

    /**
     * 权限标志
     */
    public static final String REALM_NAME = "realmName";

    /**
     * 查询不到结果
     */
    public static final String RESULT_BLANK="查询不到结果!";

    /**
     * 油价更新key值
     */
    public static final String OILS_PRICE_UPDATE = "OILS_PRICE_UPDATE";

    /**
     * 团体卡限制周期-周
     */
    public static final String TEAM_LIMIT_WEEK = "week";

    /**
     * 团体卡限制周期-月
     */
    public static final String TEAM_LIMIT_MONTH = "month";


    public enum ResultCode {
        SUCCESS(10000, "操作成功。"),
        PASSWORD_CHANGED_SUCCESSFULLY(10000, "密码修改成功，请重新登录系统。"),
        ACCOUNT_EXIST(10001, "该用账号经存在，请重新设置。"),
        ORIGINAL_PASSWORD_ERROR(10002, "当前密码不正确。"),
        WRONG_USERNAME_OR_PASSWORD(10003, "错误的用户名或密码。"),
        UNAUTHORIZED_EXCEPTION(10010, "权限不足，请联系系统管理员。"),
        EXPIRED_JWT_EXCEPTION(10011, "登录超时，请重新登录。"),
        SIGNATURE_EXCEPTION(10012, "非法的权限令牌。"),
        MALFORMED_JWT_EXCEPTION(10013, "错误的权限令牌格式。"),
        AUTHORIZATION_EXCEPTION(10014, "请重新登录。"),
        NULL_POINTER_EXCEPTION(10015, "必要参数不能为空。"),
        ILLEGAL_ARGUMENT_EXCEPTION(10016, "非法的请求参数。"),
        SIGNATURE_EXPIRED_EXCEPTION(10017, "非法的签名信息。"),
        SIGNATURE_VERIFICATION_ERROR(10018, "签名认证错误，请重新提交申请。"),
        EMPTY_OBJECT(10019, "信息为空，无需操作。"),
        ALREADY_DELETE(10020, "信息已删除，无需操作。"),
        MODIFY_EXCEPTION(10021, "信息变更异常。"),
        ADDORMODIFY_DEFEATED(10022, "新增或修改失败。"),
        PRICE_ERROR(10025,"商品单价错误，订单提交失败。"),
        ACCOUNT_NOT_ENOUGH(10023, "账户余额不足。"),
        CHANGE_PASSWORD_ERROR(10024, "修改支付密码失败，请检查相关参数是否正确。"),
        PAYMENT_PASSWORD_ERROR(10025, "支付密码错误。");
        public int CODE;
        public String MESSAGE;

        ResultCode(int value ,String desc) {
            this.CODE = value;
            this.MESSAGE = desc;
        }
    }

//    public static void main(String[] args) {
//        System.out.println(ResultCode.SUCCESS.CODE);
//    }
}
