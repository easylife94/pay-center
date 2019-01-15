package com.pay.center.client.service.client;

import com.pay.center.client.service.IPayCenterFeignService;
import com.pay.center.client.service.hystric.PayCenterFeignServiceFallbackFactory;
import com.pay.center.client.service.hystric.PayCenterFeignServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * feign服务客户端
 *
 * @author chenwei
 * @date 2019/1/14 16:26
 */
@FeignClient(value = "pay-center", fallbackFactory = PayCenterFeignServiceFallbackFactory.class)
public interface IPayCenterFeignServiceClient extends IPayCenterFeignService {
}
