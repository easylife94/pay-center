package com.pay.center.core.mq.rabbit;

import com.pay.assist.client.constants.MsgQueueNames;
import com.pay.center.client.constants.PayCenterMessageQueue;
import com.pay.center.client.dto.mq.RegisterMerchantMsgDTO;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * rabbitMq消息发送器
 *
 * @author chenwei
 * @date 2018-12-16
 */
@Service
public class RabbitMqSender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void sayHi(String name) {
        amqpTemplate.convertAndSend(MsgQueueNames.QUEUE_HELLO, name);
    }

    /**
     * 发送进件商户消息
     *
     * @param registerMerchantMsgDTO
     */
    public void sendRegisterMerchant(RegisterMerchantMsgDTO registerMerchantMsgDTO) {
        amqpTemplate.convertAndSend(PayCenterMessageQueue.QUEUE_REGISTER_MERCHANT, registerMerchantMsgDTO);
    }

    /**
     * 发送测试消息
     *
     * @param name
     */
    public void sendHello(String name) {
        amqpTemplate.convertAndSend(PayCenterMessageQueue.QUEUE_HELLO, name);
    }

}
