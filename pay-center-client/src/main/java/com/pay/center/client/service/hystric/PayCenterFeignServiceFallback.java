package com.pay.center.client.service.hystric;

import com.pay.center.client.dto.service.MemberDTO;
import com.pay.center.client.dto.service.TradeMerchantDTO;
import com.pay.center.client.dto.service.query.TradeMerchantQueryDTO;
import com.pay.center.client.service.client.IPayCenterFeignServiceClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author chenwei
 * @date 2019/1/14 14:11
 */
@Component
public class PayCenterFeignServiceFallback implements IPayCenterFeignServiceClient {

    private static final Logger logger = LoggerFactory.getLogger(PayCenterFeignServiceFallback.class);

    @Override
    public String test() {
        return "Sorry pay center service is unavailable";
    }

    @Override
    public MemberDTO getMember(String memberNumber) {
        logger.error("[PAY CENTER SERVICE - 获取会员]服务异常，memberNumber:{}", memberNumber);
        return null;
    }

    @Override
    public List<TradeMerchantDTO> listTradeMerchant(TradeMerchantQueryDTO query) {
        logger.error("[PAY CENTER SERVICE - 获取可交易商户列表]服务异常，query:{}", query);
        return null;
    }
}
