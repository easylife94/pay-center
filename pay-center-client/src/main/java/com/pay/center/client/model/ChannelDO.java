package com.pay.center.client.model;

import java.util.Date;

public class ChannelDO extends Entity {
    private Long id;

    private Date gmtCreate;

    private Date gmtUpdate;

    private Boolean isDeleted;

    private String channelType;

    private String channelMapped;

    private String channelNumber;

    private String channelName;

    private String channelShortName;

    private String channelPattern;

    private Boolean status;

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

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType == null ? null : channelType.trim();
    }

    public String getChannelMapped() {
        return channelMapped;
    }

    public void setChannelMapped(String channelMapped) {
        this.channelMapped = channelMapped == null ? null : channelMapped.trim();
    }

    public String getChannelNumber() {
        return channelNumber;
    }

    public void setChannelNumber(String channelNumber) {
        this.channelNumber = channelNumber == null ? null : channelNumber.trim();
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }

    public String getChannelShortName() {
        return channelShortName;
    }

    public void setChannelShortName(String channelShortName) {
        this.channelShortName = channelShortName == null ? null : channelShortName.trim();
    }

    public String getChannelPattern() {
        return channelPattern;
    }

    public void setChannelPattern(String channelPattern) {
        this.channelPattern = channelPattern == null ? null : channelPattern.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}