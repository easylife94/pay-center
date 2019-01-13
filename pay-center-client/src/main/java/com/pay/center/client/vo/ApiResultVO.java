package com.pay.center.client.vo;

import com.pay.center.client.constants.ApiResultEnum;

/**
 * API接口返回结果VO
 *
 * @author chenwei
 * @date 2019/1/10 15:04
 */
public class ApiResultVO<T> {

    /**
     * 接口提示信息
     */
    private String msg;

    /**
     * 接口返回码
     */
    private String code;

    /**
     * 实际返回内容，在接口请求成功时不为空
     */
    private T data;

    /**
     * 默认返回结果为成功
     */
    public ApiResultVO() {
        this.code = ApiResultEnum.SUCCESS.getCode();
        this.msg = ApiResultEnum.SUCCESS.getMsg();
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    /**
     * 设置错误返回结果
     *
     * @param e
     */
    public void errorResult(ApiResultEnum e) {
        this.code = e.getCode();
        this.msg = e.getMsg();
    }
}
