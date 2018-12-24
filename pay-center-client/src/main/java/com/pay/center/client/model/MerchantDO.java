package com.pay.center.client.model;

import java.util.Date;

public class MerchantDO extends Entity {
    private Long id;

    private Date gmtCreate;

    private Date gmtUpdate;

    private Boolean isDeleted;

    private String merchantNumber;

    private String merchantName;

    private String merchantType;

    private String merchantProvince;

    private Long merchantProvinceId;

    private String merchantCity;

    private Long merchantCityId;

    private String merchantCounty;

    private Long merchantCountyId;

    private Boolean merchantStatus;

    private String licenceNumber;

    private String licenceName;

    private String licenceAddress;

    private Date licenceEffectiveStartDate;

    private Date licenceEffectiveEndDate;

    private Boolean licenceEffectiveLong;

    private String licenceBusinessScope;

    private Date licenceEstablishDate;

    private String licenceFileUrl;

    private String legalerName;

    private String legalerCertType;

    private String legalerCertNumber;

    private Date legalerEffectiveStartDate;

    private Date legalerEffectiveEndDate;

    private Boolean legalerEffectiveLong;

    private String legalerCertFrontFileUrl;

    private String legalerCertBackFileUrl;

    private String legalerCertAllFileUrl;

    private String nonLegalerName;

    private String nonLegalerCertType;

    private String nonLegalerCertNumber;

    private Date nonLegalerEffectiveStartDate;

    private Date nonLegalerEffectiveEndDate;

    private Boolean nonLegalerEffectiveLong;

    private String nonLegalerCertFrontFileUrl;

    private String nonLegalerCertBackFileUrl;

    private String nonLegalerCertAllFileUrl;

    private String wxIndustryCode;

    private String wxIndustryName;

    private String wxIndustryId;

    private String aliIndustryCode;

    private String aliIndustryName;

    private String aliIndustryId;

    private String signEmail;

    private String signMobile;

    private String signIp;

    private String agreementFileUrl;

    private String orgFileUrl;

    private String applyFileUrl;

    private String sysAuthStatus;

    private Date sysAuthTime;

    private String channelAuthStatus;

    private Date channelAuthTime;

    private Long memberId;

    private String memberNumber;

    private String memberName;

    private Long channelId;

    private String channelNumber;

    private String channelName;

    private Long agentId;

    private String agentNumber;

    private String agentName;

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

    public String getMerchantNumber() {
        return merchantNumber;
    }

    public void setMerchantNumber(String merchantNumber) {
        this.merchantNumber = merchantNumber == null ? null : merchantNumber.trim();
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName == null ? null : merchantName.trim();
    }

    public String getMerchantType() {
        return merchantType;
    }

    public void setMerchantType(String merchantType) {
        this.merchantType = merchantType == null ? null : merchantType.trim();
    }

    public String getMerchantProvince() {
        return merchantProvince;
    }

    public void setMerchantProvince(String merchantProvince) {
        this.merchantProvince = merchantProvince == null ? null : merchantProvince.trim();
    }

    public Long getMerchantProvinceId() {
        return merchantProvinceId;
    }

    public void setMerchantProvinceId(Long merchantProvinceId) {
        this.merchantProvinceId = merchantProvinceId;
    }

    public String getMerchantCity() {
        return merchantCity;
    }

    public void setMerchantCity(String merchantCity) {
        this.merchantCity = merchantCity == null ? null : merchantCity.trim();
    }

    public Long getMerchantCityId() {
        return merchantCityId;
    }

    public void setMerchantCityId(Long merchantCityId) {
        this.merchantCityId = merchantCityId;
    }

    public String getMerchantCounty() {
        return merchantCounty;
    }

    public void setMerchantCounty(String merchantCounty) {
        this.merchantCounty = merchantCounty == null ? null : merchantCounty.trim();
    }

    public Long getMerchantCountyId() {
        return merchantCountyId;
    }

    public void setMerchantCountyId(Long merchantCountyId) {
        this.merchantCountyId = merchantCountyId;
    }

    public Boolean getMerchantStatus() {
        return merchantStatus;
    }

    public void setMerchantStatus(Boolean merchantStatus) {
        this.merchantStatus = merchantStatus;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber == null ? null : licenceNumber.trim();
    }

    public String getLicenceName() {
        return licenceName;
    }

    public void setLicenceName(String licenceName) {
        this.licenceName = licenceName == null ? null : licenceName.trim();
    }

    public String getLicenceAddress() {
        return licenceAddress;
    }

    public void setLicenceAddress(String licenceAddress) {
        this.licenceAddress = licenceAddress == null ? null : licenceAddress.trim();
    }

    public Date getLicenceEffectiveStartDate() {
        return licenceEffectiveStartDate;
    }

    public void setLicenceEffectiveStartDate(Date licenceEffectiveStartDate) {
        this.licenceEffectiveStartDate = licenceEffectiveStartDate;
    }

    public Date getLicenceEffectiveEndDate() {
        return licenceEffectiveEndDate;
    }

    public void setLicenceEffectiveEndDate(Date licenceEffectiveEndDate) {
        this.licenceEffectiveEndDate = licenceEffectiveEndDate;
    }

    public Boolean getLicenceEffectiveLong() {
        return licenceEffectiveLong;
    }

    public void setLicenceEffectiveLong(Boolean licenceEffectiveLong) {
        this.licenceEffectiveLong = licenceEffectiveLong;
    }

    public String getLicenceBusinessScope() {
        return licenceBusinessScope;
    }

    public void setLicenceBusinessScope(String licenceBusinessScope) {
        this.licenceBusinessScope = licenceBusinessScope == null ? null : licenceBusinessScope.trim();
    }

    public Date getLicenceEstablishDate() {
        return licenceEstablishDate;
    }

    public void setLicenceEstablishDate(Date licenceEstablishDate) {
        this.licenceEstablishDate = licenceEstablishDate;
    }

    public String getLicenceFileUrl() {
        return licenceFileUrl;
    }

    public void setLicenceFileUrl(String licenceFileUrl) {
        this.licenceFileUrl = licenceFileUrl == null ? null : licenceFileUrl.trim();
    }

    public String getLegalerName() {
        return legalerName;
    }

    public void setLegalerName(String legalerName) {
        this.legalerName = legalerName == null ? null : legalerName.trim();
    }

    public String getLegalerCertType() {
        return legalerCertType;
    }

    public void setLegalerCertType(String legalerCertType) {
        this.legalerCertType = legalerCertType == null ? null : legalerCertType.trim();
    }

    public String getLegalerCertNumber() {
        return legalerCertNumber;
    }

    public void setLegalerCertNumber(String legalerCertNumber) {
        this.legalerCertNumber = legalerCertNumber == null ? null : legalerCertNumber.trim();
    }

    public Date getLegalerEffectiveStartDate() {
        return legalerEffectiveStartDate;
    }

    public void setLegalerEffectiveStartDate(Date legalerEffectiveStartDate) {
        this.legalerEffectiveStartDate = legalerEffectiveStartDate;
    }

    public Date getLegalerEffectiveEndDate() {
        return legalerEffectiveEndDate;
    }

    public void setLegalerEffectiveEndDate(Date legalerEffectiveEndDate) {
        this.legalerEffectiveEndDate = legalerEffectiveEndDate;
    }

    public Boolean getLegalerEffectiveLong() {
        return legalerEffectiveLong;
    }

    public void setLegalerEffectiveLong(Boolean legalerEffectiveLong) {
        this.legalerEffectiveLong = legalerEffectiveLong;
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

    public String getNonLegalerName() {
        return nonLegalerName;
    }

    public void setNonLegalerName(String nonLegalerName) {
        this.nonLegalerName = nonLegalerName == null ? null : nonLegalerName.trim();
    }

    public String getNonLegalerCertType() {
        return nonLegalerCertType;
    }

    public void setNonLegalerCertType(String nonLegalerCertType) {
        this.nonLegalerCertType = nonLegalerCertType == null ? null : nonLegalerCertType.trim();
    }

    public String getNonLegalerCertNumber() {
        return nonLegalerCertNumber;
    }

    public void setNonLegalerCertNumber(String nonLegalerCertNumber) {
        this.nonLegalerCertNumber = nonLegalerCertNumber == null ? null : nonLegalerCertNumber.trim();
    }

    public Date getNonLegalerEffectiveStartDate() {
        return nonLegalerEffectiveStartDate;
    }

    public void setNonLegalerEffectiveStartDate(Date nonLegalerEffectiveStartDate) {
        this.nonLegalerEffectiveStartDate = nonLegalerEffectiveStartDate;
    }

    public Date getNonLegalerEffectiveEndDate() {
        return nonLegalerEffectiveEndDate;
    }

    public void setNonLegalerEffectiveEndDate(Date nonLegalerEffectiveEndDate) {
        this.nonLegalerEffectiveEndDate = nonLegalerEffectiveEndDate;
    }

    public Boolean getNonLegalerEffectiveLong() {
        return nonLegalerEffectiveLong;
    }

    public void setNonLegalerEffectiveLong(Boolean nonLegalerEffectiveLong) {
        this.nonLegalerEffectiveLong = nonLegalerEffectiveLong;
    }

    public String getNonLegalerCertFrontFileUrl() {
        return nonLegalerCertFrontFileUrl;
    }

    public void setNonLegalerCertFrontFileUrl(String nonLegalerCertFrontFileUrl) {
        this.nonLegalerCertFrontFileUrl = nonLegalerCertFrontFileUrl == null ? null : nonLegalerCertFrontFileUrl.trim();
    }

    public String getNonLegalerCertBackFileUrl() {
        return nonLegalerCertBackFileUrl;
    }

    public void setNonLegalerCertBackFileUrl(String nonLegalerCertBackFileUrl) {
        this.nonLegalerCertBackFileUrl = nonLegalerCertBackFileUrl == null ? null : nonLegalerCertBackFileUrl.trim();
    }

    public String getNonLegalerCertAllFileUrl() {
        return nonLegalerCertAllFileUrl;
    }

    public void setNonLegalerCertAllFileUrl(String nonLegalerCertAllFileUrl) {
        this.nonLegalerCertAllFileUrl = nonLegalerCertAllFileUrl == null ? null : nonLegalerCertAllFileUrl.trim();
    }

    public String getWxIndustryCode() {
        return wxIndustryCode;
    }

    public void setWxIndustryCode(String wxIndustryCode) {
        this.wxIndustryCode = wxIndustryCode == null ? null : wxIndustryCode.trim();
    }

    public String getWxIndustryName() {
        return wxIndustryName;
    }

    public void setWxIndustryName(String wxIndustryName) {
        this.wxIndustryName = wxIndustryName == null ? null : wxIndustryName.trim();
    }

    public String getWxIndustryId() {
        return wxIndustryId;
    }

    public void setWxIndustryId(String wxIndustryId) {
        this.wxIndustryId = wxIndustryId == null ? null : wxIndustryId.trim();
    }

    public String getAliIndustryCode() {
        return aliIndustryCode;
    }

    public void setAliIndustryCode(String aliIndustryCode) {
        this.aliIndustryCode = aliIndustryCode == null ? null : aliIndustryCode.trim();
    }

    public String getAliIndustryName() {
        return aliIndustryName;
    }

    public void setAliIndustryName(String aliIndustryName) {
        this.aliIndustryName = aliIndustryName == null ? null : aliIndustryName.trim();
    }

    public String getAliIndustryId() {
        return aliIndustryId;
    }

    public void setAliIndustryId(String aliIndustryId) {
        this.aliIndustryId = aliIndustryId == null ? null : aliIndustryId.trim();
    }

    public String getSignEmail() {
        return signEmail;
    }

    public void setSignEmail(String signEmail) {
        this.signEmail = signEmail == null ? null : signEmail.trim();
    }

    public String getSignMobile() {
        return signMobile;
    }

    public void setSignMobile(String signMobile) {
        this.signMobile = signMobile == null ? null : signMobile.trim();
    }

    public String getSignIp() {
        return signIp;
    }

    public void setSignIp(String signIp) {
        this.signIp = signIp == null ? null : signIp.trim();
    }

    public String getAgreementFileUrl() {
        return agreementFileUrl;
    }

    public void setAgreementFileUrl(String agreementFileUrl) {
        this.agreementFileUrl = agreementFileUrl == null ? null : agreementFileUrl.trim();
    }

    public String getOrgFileUrl() {
        return orgFileUrl;
    }

    public void setOrgFileUrl(String orgFileUrl) {
        this.orgFileUrl = orgFileUrl == null ? null : orgFileUrl.trim();
    }

    public String getApplyFileUrl() {
        return applyFileUrl;
    }

    public void setApplyFileUrl(String applyFileUrl) {
        this.applyFileUrl = applyFileUrl == null ? null : applyFileUrl.trim();
    }

    public String getSysAuthStatus() {
        return sysAuthStatus;
    }

    public void setSysAuthStatus(String sysAuthStatus) {
        this.sysAuthStatus = sysAuthStatus == null ? null : sysAuthStatus.trim();
    }

    public Date getSysAuthTime() {
        return sysAuthTime;
    }

    public void setSysAuthTime(Date sysAuthTime) {
        this.sysAuthTime = sysAuthTime;
    }

    public String getChannelAuthStatus() {
        return channelAuthStatus;
    }

    public void setChannelAuthStatus(String channelAuthStatus) {
        this.channelAuthStatus = channelAuthStatus == null ? null : channelAuthStatus.trim();
    }

    public Date getChannelAuthTime() {
        return channelAuthTime;
    }

    public void setChannelAuthTime(Date channelAuthTime) {
        this.channelAuthTime = channelAuthTime;
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

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
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

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
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
}