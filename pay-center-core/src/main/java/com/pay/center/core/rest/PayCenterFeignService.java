package com.pay.center.core.rest;

import com.pay.center.client.service.IPayCenterFeignService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * RESTfull服务实现
 *
 * @author chenwei
 * @date 2019/1/14 14:15
 */
@RestController
public class PayCenterFeignService implements IPayCenterFeignService {

    @Override
    public String test() {
        return "service is available";
    }
}
