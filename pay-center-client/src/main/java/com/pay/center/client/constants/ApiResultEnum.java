package com.pay.center.client.constants;

/**
 * API返回结果枚举
 *
 * @author chenwei
 * @date 2019/1/10 16:07
 */
public enum ApiResultEnum {

    SUCCESS("000000","成功"),

    INCORRECT_CREDENTIAL("000001","登录密码错误"),
    UNKNOWN_ACCOUNT("000002","登录用户名不存在"),
    EXCESSIVE_ATTEMPTS_EXCEPTION("000003","登录错误次数达到上限"),
    UNAUTHENTICATED("000004","未登录"),
    UNAUTHORIZED("000005","无权限"),

    UNKNOWN("999999","未知错误")
    ;

    private String code;
    private String msg;

    ApiResultEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }}
