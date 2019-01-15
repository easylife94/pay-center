package com.pay.center.client.service.hystric;

import com.pay.center.client.service.client.IPayCenterFeignServiceClient;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author chenwei
 * @date 2019/1/14 17:22
 */
@Component
public class PayCenterFeignServiceFallbackFactory implements FallbackFactory<IPayCenterFeignServiceClient> {

    private static Logger logger = LoggerFactory.getLogger(PayCenterFeignServiceFallbackFactory.class);

    @Override
    public IPayCenterFeignServiceClient create(Throwable throwable) {
        logger.error("call service error:{}", throwable.getMessage());
        return new PayCenterFeignServiceFallback();
    }
}
