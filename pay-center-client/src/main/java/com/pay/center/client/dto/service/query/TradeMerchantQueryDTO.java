package com.pay.center.client.dto.service.query;

import java.util.StringJoiner;

/**
 * 交易商户查询参数DTO
 *
 * @author chenwei
 * @date 2019/2/1 14:33
 */
public class TradeMerchantQueryDTO {

    /**
     * 平台编号
     */
    private String platformNumber;

    /**
     * 通道编号
     */
    private String channelNumber;

    /**
     * 商户编号
     */
    private String merchantNumber;


    public String getPlatformNumber() {
        return platformNumber;
    }

    public void setPlatformNumber(String platformNumber) {
        this.platformNumber = platformNumber;
    }

    public String getChannelNumber() {
        return channelNumber;
    }

    public void setChannelNumber(String channelNumber) {
        this.channelNumber = channelNumber;
    }

    public String getMerchantNumber() {
        return merchantNumber;
    }

    public void setMerchantNumber(String merchantNumber) {
        this.merchantNumber = merchantNumber;
    }

    public TradeMerchantQueryDTO(String platformNumber, String channelNumber, String merchantNumber) {
        this.platformNumber = platformNumber;
        this.channelNumber = channelNumber;
        this.merchantNumber = merchantNumber;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ",
                TradeMerchantQueryDTO.class.getSimpleName() + "{", "}")
                .add("platformNumber=" + platformNumber)
                .add("channelNumber=" + channelNumber)
                .add("merchantNumber=" + merchantNumber)
                .toString();
    }
}
