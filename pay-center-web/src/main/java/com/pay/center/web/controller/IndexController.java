package com.pay.center.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chenwei
 * @date 2018/12/4 17:48
 */
@Controller
public class IndexController {

    @RequestMapping("index")
    private String index(){
        return "/static/index.html";
    }

}
