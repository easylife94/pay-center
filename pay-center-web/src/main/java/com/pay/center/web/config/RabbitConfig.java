package com.pay.center.web.config;

import com.pay.assist.client.constants.MsgQueueNames;
import com.pay.center.client.constants.PayCenterMqNames;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * RabbitMQ配置类
 *
 * @author chenwei
 * @date 2018-12-12
 */
@Configuration
public class RabbitConfig {


    /**
     * hello 消息队列
     *
     * @return
     */
    @Bean
    public Queue helloQueue() {
        return new Queue(MsgQueueNames.QUEUE_HELLO);
    }

    /**
     * 进件商户消息队列
     *
     * @return
     */
    @Bean
    public Queue registerMerchantQueue() {
        return new Queue(PayCenterMqNames.QUEUE_REGISTER_MERCHANT);
    }

}
