package com.pay.center.client.constants;

/**
 * 通道类型枚举
 *
 * @author chenwei
 * @date 2019-01-13
 */
public enum ChannelTypeEnum {
    TRADE("TRADE","交易"),
    RECHARGE("RECHARGE","充值"),
    WITHDRAW("WITHDRAW","提现");

    private String type;
    private String name;

    ChannelTypeEnum(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }}
