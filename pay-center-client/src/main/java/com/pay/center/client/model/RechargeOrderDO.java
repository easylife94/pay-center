package com.pay.center.client.model;

import java.math.BigDecimal;
import java.util.Date;

public class RechargeOrderDO {
    private Long id;

    private Date gmtCreate;

    private Date gmtUpdate;

    private Byte isDeleted;

    private String sysOrderNumber;

    private String channelOrderNumber;

    private String sourceOrderNumber;

    private Long memberId;

    private String memberNumber;

    private Long channelId;

    private String channelNumber;

    private String currenciesType;

    private String defrayalChannel;

    private String defrayalType;

    private String orderStatus;

    private String settleStatus;

    private Date payTime;

    private Date notifyTime;

    private Date settleTime;

    private String channelRate;

    private BigDecimal channelFee;

    private String sysRate;

    private BigDecimal sysFee;

    private BigDecimal totalAmount;

    private BigDecimal rechargeFee;

    private BigDecimal rechargeAmount;

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

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getMemberNumber() {
        return memberNumber;
    }

    public void setMemberNumber(String memberNumber) {
        this.memberNumber = memberNumber == null ? null : memberNumber.trim();
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
        this.channelNumber = channelNumber == null ? null : channelNumber.trim();
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

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    public String getSettleStatus() {
        return settleStatus;
    }

    public void setSettleStatus(String settleStatus) {
        this.settleStatus = settleStatus == null ? null : settleStatus.trim();
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getNotifyTime() {
        return notifyTime;
    }

    public void setNotifyTime(Date notifyTime) {
        this.notifyTime = notifyTime;
    }

    public Date getSettleTime() {
        return settleTime;
    }

    public void setSettleTime(Date settleTime) {
        this.settleTime = settleTime;
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

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getRechargeFee() {
        return rechargeFee;
    }

    public void setRechargeFee(BigDecimal rechargeFee) {
        this.rechargeFee = rechargeFee;
    }

    public BigDecimal getRechargeAmount() {
        return rechargeAmount;
    }

    public void setRechargeAmount(BigDecimal rechargeAmount) {
        this.rechargeAmount = rechargeAmount;
    }
}