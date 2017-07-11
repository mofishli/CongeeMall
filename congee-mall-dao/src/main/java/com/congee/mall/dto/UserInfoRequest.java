package com.congee.mall.dto;

import com.congee.mall.constants.CheckUtil;

/**
 * Created by zhouli on 17/5/9.
 */
public class UserInfoRequest {
    private String newpassword;
    private String acctName;
    private String acctPhone;
    private String acctMail;
    private String headUrl;
    private Boolean isAdmin;
    private Boolean isVip;
    private String instruction;
    private Integer start;
    private Integer limit;

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getNewpassword() {
        return newpassword;
    }

    public void setNewpassword(String newpassword) {
        this.newpassword = newpassword;
    }

    public String getAcctName() {
        return acctName;
    }

    public void setAcctName(String acctName) {
        this.acctName = acctName;
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

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }

    public Boolean getVip() {
        return isVip;
    }

    public void setVip(Boolean vip) {
        isVip = vip;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }
}
