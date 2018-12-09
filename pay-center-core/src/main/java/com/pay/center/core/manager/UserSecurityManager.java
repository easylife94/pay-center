package com.pay.center.core.manager;

import com.pay.center.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 用户安全管理器
 * 用于用户登陆校验、注册用户初始化
 * @author chenwei
 * @date 2018-12-09
 */
@Component
public class UserSecurityManager {

    @Autowired
    private UserService userService;




}
