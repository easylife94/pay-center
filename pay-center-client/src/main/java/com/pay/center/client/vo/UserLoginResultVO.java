package com.pay.center.client.vo;

/**
 * 用户登录返回信息VO
 *
 * @author chenwei
 * @date 2019/1/10 15:50
 */
public class UserLoginResultVO {

    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UserLoginResultVO(String userName) {
        this.userName = userName;
    }
}
