package com.congee.mall.dto;

import java.util.Date;

/**
 * Created by zhouli on 17/5/9.
 */
public class UserInfoResponse {
    private int userId;
    private String acctId;
    private String acctName;
    private String acctPassword;
    private String acctPhone;
    private String acctMail;
    private String headUrl;
    private boolean isAdmin;
    private boolean isVip;
    private String createTime;
    private String updateTime;
    private String instruction;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getAcctId() {
        return acctId;
    }

    public void setAcctId(String acctId) {
        this.acctId = acctId;
    }

    public String getAcctName() {
        return acctName;
    }

    public void setAcctName(String acctName) {
        this.acctName = acctName;
    }

    public String getAcctPassword() {
        return acctPassword;
    }

    public void setAcctPassword(String acctPassword) {
        this.acctPassword = acctPassword;
    }

    public String getAcctPhone() {
        return acctPhone;
    }

    public void setAcctPhone(String acctPhone) {
        this.acctPhone = acctPhone;
    }

    public String getAcctMail() {
        return acctMail;
    }

    public void setAcctMail(String acctMail) {
        this.acctMail = acctMail;
    }

    public String getHeadUrl() {
        return headUrl;
    }

    public void setHeadUrl(String headUrl) {
        this.headUrl = headUrl;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public boolean isVip() {
        return isVip;
    }

    public void setVip(boolean vip) {
        isVip = vip;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }
}
