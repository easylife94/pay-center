package com.pay.center.web.controller;

import com.pay.center.client.dto.service.UserDTO;
import com.pay.center.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author chenwei
 * @date 2018-12-04
 */
@Controller
@RequestMapping("user")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/getLoginName")
    @ResponseBody
    public String getLoginName(String loginName){
        UserDTO user = userService.getUser(loginName);
        if(user != null){
            return user.getLoginName();
        } else {
            return null;
        }
    }
}
