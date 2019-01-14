package com.pay.center.client.service.client;

import com.pay.center.client.service.IPayCenterFeignService;
import com.pay.center.client.service.hystric.PayCenterFeignServiceHystricImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * feign服务客户端
 *
 * @author chenwei
 * @date 2019/1/14 16:26
 */
@FeignClient(value = "pay-center", fallback = PayCenterFeignServiceHystricImpl.class)
public interface IPayCenterFeignServiceClient extends IPayCenterFeignService {
}
