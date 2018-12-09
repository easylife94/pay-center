package com.pay.center.client.model;

import java.util.Date;

public class MemberDO {
    private Long id;

    private Date gmtCreate;

    private Date gmtUpdate;

    private Boolean isDeleted;

    private String memberNumber;

    private String memberName;

    private String solidcodeName;

    private String sysPubKey;

    private String sysPriKey;

    private String memberPubKey;

    private String contactMobile;

    private String remark;

    private String useScene;

    private Long agentId;

    private String agentNumber;

    private String agentName;

    private Long withdrawSettleAccountId;

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

    public String getMemberNumber() {
        return memberNumber;
    }

    public void setMemberNumber(String memberNumber) {
        this.memberNumber = memberNumber == null ? null : memberNumber.trim();
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    public String getSolidcodeName() {
        return solidcodeName;
    }

    public void setSolidcodeName(String solidcodeName) {
        this.solidcodeName = solidcodeName == null ? null : solidcodeName.trim();
    }

    public String getSysPubKey() {
        return sysPubKey;
    }

    public void setSysPubKey(String sysPubKey) {
        this.sysPubKey = sysPubKey == null ? null : sysPubKey.trim();
    }

    public String getSysPriKey() {
        return sysPriKey;
    }

    public void setSysPriKey(String sysPriKey) {
        this.sysPriKey = sysPriKey == null ? null : sysPriKey.trim();
    }

    public String getMemberPubKey() {
        return memberPubKey;
    }

    public void setMemberPubKey(String memberPubKey) {
        this.memberPubKey = memberPubKey == null ? null : memberPubKey.trim();
    }

    public String getContactMobile() {
        return contactMobile;
    }

    public void setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile == null ? null : contactMobile.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getUseScene() {
        return useScene;
    }

    public void setUseScene(String useScene) {
        this.useScene = useScene == null ? null : useScene.trim();
    }

    public Long getAgentId() {
        return agentId;
    }

    public void setAgentId(Long agentId) {
        this.agentId = agentId;
    }

    public String getAgentNumber() {
        return agentNumber;
    }

    public void setAgentNumber(String agentNumber) {
        this.agentNumber = agentNumber == null ? null : agentNumber.trim();
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName == null ? null : agentName.trim();
    }

    public Long getWithdrawSettleAccountId() {
        return withdrawSettleAccountId;
    }

    public void setWithdrawSettleAccountId(Long withdrawSettleAccountId) {
        this.withdrawSettleAccountId = withdrawSettleAccountId;
    }
}