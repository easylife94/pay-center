package com.pay.center.core.mq.rabbit.recevier;

import com.pay.assist.client.constants.MsgQueueNames;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * hello消息接收器
 * @author chenwei
 * @date 2018-12-12
 */
@Component
@RabbitListener(queues = MsgQueueNames.QUEUE_HELLO)
public class HelloReceiver {

    @RabbitHandler
    public void hello(String name){
        System.out.println("hello " + name);
    }



}
