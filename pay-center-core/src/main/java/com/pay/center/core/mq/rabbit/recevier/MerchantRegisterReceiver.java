package com.pay.center.core.mq.rabbit.recevier;

import com.pay.center.client.constants.PayCenterMqNames;
import com.pay.center.client.dto.mq.RegisterMerchantMsgDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 商户进件消息接受器
 *
 * @author chenwei
 * @date 2018-12-12
 */
@Component
@RabbitListener(queues = PayCenterMqNames.QUEUE_REGISTER_MERCHANT)
public class MerchantRegisterReceiver {

    public static final Logger logger = LoggerFactory.getLogger(MerchantRegisterReceiver.class);

    @RabbitHandler
    public void registerMerchant(RegisterMerchantMsgDTO registerMerchantMsgDTO) {

        logger.info("收到进件商户消息：{}",registerMerchantMsgDTO);

    }

}
