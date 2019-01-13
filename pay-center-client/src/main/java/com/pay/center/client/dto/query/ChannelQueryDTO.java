package com.pay.center.client.dto.query;

import java.io.Serializable;

/**
 * 通道查询query
 *
 * @author chenwei
 * @date 2019-01-13
 */
public class ChannelQueryDTO implements Serializable {


    private String channelNumber;
    private String channelPattern;
    private String channelType;

    public String getChannelNumber() {
        return channelNumber;
    }

    public void setChannelNumber(String channelNumber) {
        this.channelNumber = channelNumber;
    }

    public String getChannelPattern() {
        return channelPattern;
    }

    public void setChannelPattern(String channelPattern) {
        this.channelPattern = channelPattern;
    }

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }
}
