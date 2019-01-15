package com.pay.center.core.rest;

import com.pay.center.client.service.IPayCenterFeignService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

/**
 * RESTfull服务实现
 *
 * @author chenwei
 * @date 2019/1/14 14:15
 */
@RestController
public class PayCenterFeignService implements IPayCenterFeignService {

    private static Logger logger = LoggerFactory.getLogger(PayCenterFeignService.class);

    @Override
    public String test() {
        logger.error("test service is available");
        return "service is available";
    }
}
