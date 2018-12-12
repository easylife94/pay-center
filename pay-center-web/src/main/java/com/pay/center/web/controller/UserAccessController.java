package com.pay.center.web.controller;

import com.pay.center.client.model.UserDO;
import com.pay.center.core.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.util.SavedRequest;
import org.apache.shiro.web.util.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletRequest;

/**
 * 用户访问控制器
 *
 * @author chenwei
 * @date 2018-12-09
 */
@Controller
public class UserAccessController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView login(ServletRequest request, String loginName, String password) {
        UsernamePasswordToken token = new UsernamePasswordToken(loginName, password);
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(token);
        } catch (IncorrectCredentialsException ice) {
            // 捕获密码错误异常
            ModelAndView mv = new ModelAndView("login");
            mv.addObject("message", "password error!");
            return mv;
        } catch (UnknownAccountException uae) {
            // 捕获未知用户名异常
            ModelAndView mv = new ModelAndView("login");
            mv.addObject("message", "username error!");
            return mv;
        } catch (ExcessiveAttemptsException eae) {
            // 捕获错误登录过多的异常
            ModelAndView mv = new ModelAndView("login");
            mv.addObject("message", "times error");
            return mv;
        }

        UserDO user = userService.findByLoginName(loginName);
        subject.getSession().setAttribute("user", user);

        SavedRequest savedRequest = WebUtils.getSavedRequest(request);
        if (savedRequest != null) {
            String url = savedRequest.getRequestUrl();
            if (StringUtils.isBlank(url)) {
                url = "/index";
            }
            return new ModelAndView("redirect:" + url);
        } else {
            return new ModelAndView("/index");
        }
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage() {
        return "login";
    }
}
