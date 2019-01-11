package com.pay.center.web.controller;

import com.pay.center.client.dto.mq.RegisterMerchantMsgDTO;
import com.pay.center.core.mq.rabbit.RabbitMqSender;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author chenwei
 * @date 2018/12/4 17:48
 */
@Controller
public class IndexController extends BaseController {

    @Autowired
    public RabbitMqSender rabbitMqSender;
    @Resource
    public RedisTemplate<String, String> redisTemplate;

    @RequestMapping("index")
    public String index() {
        return "/static/index.html";
    }

    @RequestMapping("/hi")
    @ResponseBody
    @RequiresUser
    @RequiresPermissions("user:hi")
    public String hi(String name) {
        rabbitMqSender.sayHi(name);
        return "ok";
    }

    @RequestMapping("register")
    @ResponseBody
    public String register(Long merchantId) {
        RegisterMerchantMsgDTO registerMerchantMsgDTO = new RegisterMerchantMsgDTO(merchantId);
        rabbitMqSender.sendRegisterMerchant(registerMerchantMsgDTO);
        return "ok";
    }

    @RequestMapping("/redis/put")
    @ResponseBody
    public String putRedis(String key, String value) {
        BoundValueOperations<String, String> operations = redisTemplate.boundValueOps(key);
        operations.set(value);
        return "ok";
    }

    @RequestMapping("/redis/get")
    @ResponseBody
    public String putRedis(String key) {
        BoundValueOperations<String, String> operations = redisTemplate.boundValueOps(key);
        return operations.get();
    }
}
