package com.pay.center.client.constants;

/**
 * pay-center项目的消息队列名称
 * 消息队列名称命名规则：项目+服务
 * 消息队列名称类由生产者创建，消费者依赖
 *
 * @author chenwei
 * @date 2018-12-16
 */
public class PayCenterMqNames {


    /**
     * 消息队列前缀
     */
    private static final String QUEUE_PREFIX = "pay.center.";

    /**
     * 进件商户消息队列
     */
    public static final String QUEUE_REGISTER_MERCHANT = QUEUE_PREFIX + "registerMerchant";
}
