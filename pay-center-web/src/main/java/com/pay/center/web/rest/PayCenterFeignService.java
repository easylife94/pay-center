package com.pay.center.web.rest;

import com.pay.center.client.dto.service.ChannelDTO;
import com.pay.center.client.service.IPayCenterFeignService;
import com.pay.center.core.service.ChannelService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private ChannelService channelService;

    @Override
    public String test() {
        return "service is available";
    }

    @Override
    public ChannelDTO getMember(String memberNumber) {
        return null;
    }
}
