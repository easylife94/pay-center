package com.pay.center.client.dto.service;

import java.util.StringJoiner;

/**
 * 交易商户
 *
 * @author chenwei
 * @date 2019/2/1 14:30
 */
public class TradeMerchantDTO {

    private Long platformId;
    private String platformNumber;
    private Long channelId;
    private String channelNumber;
    private Long merchantId;
    private String merchantNumber;


    public Long getPlatformId() {
        return platformId;
    }

    public void setPlatformId(Long platformId) {
        this.platformId = platformId;
    }

    public String getPlatformNumber() {
        return platformNumber;
    }

    public void setPlatformNumber(String platformNumber) {
        this.platformNumber = platformNumber;
    }

    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    public String getChannelNumber() {
        return channelNumber;
    }

    public void setChannelNumber(String channelNumber) {
        this.channelNumber = channelNumber;
    }

    public Long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantNumber() {
        return merchantNumber;
    }

    public void setMerchantNumber(String merchantNumber) {
        this.merchantNumber = merchantNumber;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ",
                TradeMerchantDTO.class.getSimpleName() + "{", "}")
                .add("platformId=" + platformId)
                .add("platformNumber=" + platformNumber)
                .add("channelId=" + channelId)
                .add("channelNumber=" + channelNumber)
                .add("merchantId=" + merchantId)
                .add("merchantNumber=" + merchantNumber)
                .toString();
    }
}
