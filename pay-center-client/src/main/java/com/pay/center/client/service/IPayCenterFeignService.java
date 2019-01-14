package com.pay.center.client.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * feign服务接口
 * <code>@RequestMapping</code> 以 <code> /service </code> 开始
 * @author chenwei
 * @date 2019/1/14 13:48
 */
public interface IPayCenterFeignService {

    /**
     * 测试服务是否可用
     *
     * @return
     */
    @RequestMapping(value = "/service/test", method = RequestMethod.POST)
    String test();
}
