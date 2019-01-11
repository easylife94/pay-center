package com.pay.center.web.security.shiro;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.web.util.WebUtils;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * shiro 跨域表单拦截器
 *
 * 前端跨域请求发送option的请求默认返回true
 * @author chenwei
 * @date 2019/1/11 16:15
 */
public class CorsFormAuthenticationFilter extends FormAuthenticationFilter {

    @Override
    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) {

        String method = WebUtils.toHttp(request).getMethod();
        if (StringUtils.equalsIgnoreCase("OPTIONS", method)) {
            return true;
        }
        return super.isAccessAllowed(request, response, mappedValue);
    }
}
