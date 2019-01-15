package com.pay.center.web.controller;

import com.pay.api.client.service.client.IPayApiFeignServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author chenwei
 * @date 2019/1/15 14:01
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private IPayApiFeignServiceClient payApiFeignServiceClient;

    @ResponseBody
    @RequestMapping("/feign")
    public String feign(){
        return payApiFeignServiceClient.test();
    }
}
