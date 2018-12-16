package com.pay.center.client.dto.mq;

import java.io.Serializable;

/**
 * 进件商户消息dto
 *
 * @author chenwei
 * @date 2018-12-16
 */
public class RegisterMerchantMsgDTO implements Serializable {

    /**
     * 商户id
     */
    private Long merchantId;

    public RegisterMerchantMsgDTO() {
    }

    public RegisterMerchantMsgDTO(Long merchantId) {
        this.merchantId = merchantId;
    }

    public Long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    @Override
    public String toString() {
        return "RegisterMerchantMsgDTO{" +
                "merchantId=" + merchantId +
                '}';
    }
}
