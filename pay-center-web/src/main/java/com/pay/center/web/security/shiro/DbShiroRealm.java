package com.pay.center.web.security.shiro;

import com.pay.center.client.model.UserDO;
import com.pay.center.core.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 数据库realm
 *
 * @author chenwei
 * @date 2018-12-08
 */
public class DbShiroRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return new SimpleAuthorizationInfo();
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //获取登陆信息
        String loginName = (String) authenticationToken.getPrincipal();
        UserDO userDO = userService.findByLoginName(loginName);
        if (userDO == null) {
            // 用户名不存在抛出异常
            throw new UnknownAccountException();
        }
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(userDO.getLoginName(), userDO.getPassWd(),
                ByteSource.Util.bytes(userDO.getSalt()), userDO.getUserName());

        return authenticationInfo;
    }
}
