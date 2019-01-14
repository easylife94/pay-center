package com.pay.center.client.service.hystric;

import com.pay.center.client.service.IPayCenterFeignService;
import com.pay.center.client.service.client.IPayCenterFeignServiceClient;
import org.springframework.stereotype.Component;

/**
 * @author chenwei
 * @date 2019/1/14 14:11
 */
@Component
public class PayCenterFeignServiceFallback implements IPayCenterFeignServiceClient {

    @Override
    public String test() {
        return "Sorry pay center service is unavailable";
    }
}
