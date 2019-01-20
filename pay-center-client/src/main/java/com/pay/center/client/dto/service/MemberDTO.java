package com.pay.center.client.dto.service;

/**
 * @author chenwei
 * @date 2019/1/15 17:32
 */
public class MemberDTO {

    private String memberNumber;
    private String memberName;
    private String memberPubKey;
    private String sysPubKey;
    private String sysPriKey;

    public String getMemberNumber() {
        return memberNumber;
    }

    public void setMemberNumber(String memberNumber) {
        this.memberNumber = memberNumber;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberPubKey() {
        return memberPubKey;
    }

    public void setMemberPubKey(String memberPubKey) {
        this.memberPubKey = memberPubKey;
    }

    public String getSysPubKey() {
        return sysPubKey;
    }

    public void setSysPubKey(String sysPubKey) {
        this.sysPubKey = sysPubKey;
    }

    public String getSysPriKey() {
        return sysPriKey;
    }

    public void setSysPriKey(String sysPriKey) {
        this.sysPriKey = sysPriKey;
    }



}
