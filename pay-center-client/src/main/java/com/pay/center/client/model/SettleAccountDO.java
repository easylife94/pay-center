package com.pay.center.client.model;

import java.util.Date;

public class SettleAccountDO extends Entity {
    private Long id;

    private Date gmtCreate;

    private Date gmtUpdate;

    private Boolean isDeleted;

    private String accountType;

    private String bankAccountType;

    private String bankAccountName;

    private String bankCardFrontFileUrl;

    private String bankCardBackFileUrl;

    private String bankCardAllFileUrl;

    private String bankMobile;

    private String aliAccountType;

    private String aliAccount;

    private String legalerCertType;

    private String legalerCertName;

    private String legalerCertNumber;

    private String legalerCertFrontFileUrl;

    private String legalerCertBackFileUrl;

    private String legalerCertAllFileUrl;

    private String ownType;

    private Long ownId;

    private String ownNumber;

    private byte[] bankAccountNumber;

    private byte[] ownName;

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

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType == null ? null : accountType.trim();
    }

    public String getBankAccountType() {
        return bankAccountType;
    }

    public void setBankAccountType(String bankAccountType) {
        this.bankAccountType = bankAccountType == null ? null : bankAccountType.trim();
    }

    public String getBankAccountName() {
        return bankAccountName;
    }

    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName == null ? null : bankAccountName.trim();
    }

    public String getBankCardFrontFileUrl() {
        return bankCardFrontFileUrl;
    }

    public void setBankCardFrontFileUrl(String bankCardFrontFileUrl) {
        this.bankCardFrontFileUrl = bankCardFrontFileUrl == null ? null : bankCardFrontFileUrl.trim();
    }

    public String getBankCardBackFileUrl() {
        return bankCardBackFileUrl;
    }

    public void setBankCardBackFileUrl(String bankCardBackFileUrl) {
        this.bankCardBackFileUrl = bankCardBackFileUrl == null ? null : bankCardBackFileUrl.trim();
    }

    public String getBankCardAllFileUrl() {
        return bankCardAllFileUrl;
    }

    public void setBankCardAllFileUrl(String bankCardAllFileUrl) {
        this.bankCardAllFileUrl = bankCardAllFileUrl == null ? null : bankCardAllFileUrl.trim();
    }

    public String getBankMobile() {
        return bankMobile;
    }

    public void setBankMobile(String bankMobile) {
        this.bankMobile = bankMobile == null ? null : bankMobile.trim();
    }

    public String getAliAccountType() {
        return aliAccountType;
    }

    public void setAliAccountType(String aliAccountType) {
        this.aliAccountType = aliAccountType == null ? null : aliAccountType.trim();
    }

    public String getAliAccount() {
        return aliAccount;
    }

    public void setAliAccount(String aliAccount) {
        this.aliAccount = aliAccount == null ? null : aliAccount.trim();
    }

    public String getLegalerCertType() {
        return legalerCertType;
    }

    public void setLegalerCertType(String legalerCertType) {
        this.legalerCertType = legalerCertType == null ? null : legalerCertType.trim();
    }

    public String getLegalerCertName() {
        return legalerCertName;
    }

    public void setLegalerCertName(String legalerCertName) {
        this.legalerCertName = legalerCertName == null ? null : legalerCertName.trim();
    }

    public String getLegalerCertNumber() {
        return legalerCertNumber;
    }

    public void setLegalerCertNumber(String legalerCertNumber) {
        this.legalerCertNumber = legalerCertNumber == null ? null : legalerCertNumber.trim();
    }

    public String getLegalerCertFrontFileUrl() {
        return legalerCertFrontFileUrl;
    }

    public void setLegalerCertFrontFileUrl(String legalerCertFrontFileUrl) {
        this.legalerCertFrontFileUrl = legalerCertFrontFileUrl == null ? null : legalerCertFrontFileUrl.trim();
    }

    public String getLegalerCertBackFileUrl() {
        return legalerCertBackFileUrl;
    }

    public void setLegalerCertBackFileUrl(String legalerCertBackFileUrl) {
        this.legalerCertBackFileUrl = legalerCertBackFileUrl == null ? null : legalerCertBackFileUrl.trim();
    }

    public String getLegalerCertAllFileUrl() {
        return legalerCertAllFileUrl;
    }

    public void setLegalerCertAllFileUrl(String legalerCertAllFileUrl) {
        this.legalerCertAllFileUrl = legalerCertAllFileUrl == null ? null : legalerCertAllFileUrl.trim();
    }

    public String getOwnType() {
        return ownType;
    }

    public void setOwnType(String ownType) {
        this.ownType = ownType == null ? null : ownType.trim();
    }

    public Long getOwnId() {
        return ownId;
    }

    public void setOwnId(Long ownId) {
        this.ownId = ownId;
    }

    public String getOwnNumber() {
        return ownNumber;
    }

    public void setOwnNumber(String ownNumber) {
        this.ownNumber = ownNumber == null ? null : ownNumber.trim();
    }

    public byte[] getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(byte[] bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public byte[] getOwnName() {
        return ownName;
    }

    public void setOwnName(byte[] ownName) {
        this.ownName = ownName;
    }
}