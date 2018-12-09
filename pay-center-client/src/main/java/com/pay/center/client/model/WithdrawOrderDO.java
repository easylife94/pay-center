package com.pay.center.client.model;

import java.math.BigDecimal;
import java.util.Date;

public class WithdrawOrderDO {
    private Long id;

    private Date gmtCreate;

    private Date gmtUpdate;

    private Byte isDeleted;

    private String sysOrderNumber;

    private String channelOrderNumber;

    private String sourceOrderNumber;

    private String withdrawType;

    private String currenciesType;

    private String defrayalChannel;

    private String defrayalType;

    private String orderType;

    private String authStatus;

    private String settleStatus;

    private BigDecimal totalAmount;

    private String sysRate;

    private BigDecimal sysFee;

    private String channelRate;

    private BigDecimal channelFee;

    private BigDecimal withdrawFee;

    private BigDecimal withdrawAmount;

    private String remark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtUpdate() {
        return gmtUpdate;
    }

    public void setGmtUpdate(Date gmtUpdate) {
        this.gmtUpdate = gmtUpdate;
    }

    public Byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getSysOrderNumber() {
        return sysOrderNumber;
    }

    public void setSysOrderNumber(String sysOrderNumber) {
        this.sysOrderNumber = sysOrderNumber == null ? null : sysOrderNumber.trim();
    }

    public String getChannelOrderNumber() {
        return channelOrderNumber;
    }

    public void setChannelOrderNumber(String channelOrderNumber) {
        this.channelOrderNumber = channelOrderNumber == null ? null : channelOrderNumber.trim();
    }

    public String getSourceOrderNumber() {
        return sourceOrderNumber;
    }

    public void setSourceOrderNumber(String sourceOrderNumber) {
        this.sourceOrderNumber = sourceOrderNumber == null ? null : sourceOrderNumber.trim();
    }

    public String getWithdrawType() {
        return withdrawType;
    }

    public void setWithdrawType(String withdrawType) {
        this.withdrawType = withdrawType == null ? null : withdrawType.trim();
    }

    public String getCurrenciesType() {
        return currenciesType;
    }

    public void setCurrenciesType(String currenciesType) {
        this.currenciesType = currenciesType == null ? null : currenciesType.trim();
    }

    public String getDefrayalChannel() {
        return defrayalChannel;
    }

    public void setDefrayalChannel(String defrayalChannel) {
        this.defrayalChannel = defrayalChannel == null ? null : defrayalChannel.trim();
    }

    public String getDefrayalType() {
        return defrayalType;
    }

    public void setDefrayalType(String defrayalType) {
        this.defrayalType = defrayalType == null ? null : defrayalType.trim();
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    public String getAuthStatus() {
        return authStatus;
    }

    public void setAuthStatus(String authStatus) {
        this.authStatus = authStatus == null ? null : authStatus.trim();
    }

    public String getSettleStatus() {
        return settleStatus;
    }

    public void setSettleStatus(String settleStatus) {
        this.settleStatus = settleStatus == null ? null : settleStatus.trim();
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getSysRate() {
        return sysRate;
    }

    public void setSysRate(String sysRate) {
        this.sysRate = sysRate == null ? null : sysRate.trim();
    }

    public BigDecimal getSysFee() {
        return sysFee;
    }

    public void setSysFee(BigDecimal sysFee) {
        this.sysFee = sysFee;
    }

    public String getChannelRate() {
        return channelRate;
    }

    public void setChannelRate(String channelRate) {
        this.channelRate = channelRate == null ? null : channelRate.trim();
    }

    public BigDecimal getChannelFee() {
        return channelFee;
    }

    public void setChannelFee(BigDecimal channelFee) {
        this.channelFee = channelFee;
    }

    public BigDecimal getWithdrawFee() {
        return withdrawFee;
    }

    public void setWithdrawFee(BigDecimal withdrawFee) {
        this.withdrawFee = withdrawFee;
    }

    public BigDecimal getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(BigDecimal withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}