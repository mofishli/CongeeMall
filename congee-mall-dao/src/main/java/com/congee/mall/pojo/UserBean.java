package com.congee.mall.pojo;

/**
 * Created by zhouli on 17/5/4.
 */
public class UserBean {
    private int acct_id;
    private String acct_name;
    private String acct_password;
    private String acct_phone;
    private String acct_mail;
    private String head_url;
    private boolean is_admin;
    private boolean is_vip;
    private String create_time;
    private String instruction;

    public int getAcct_id() {
        return acct_id;
    }

    public void setAcct_id(int acct_id) {
        this.acct_id = acct_id;
    }

    public String getAcct_name() {
        return acct_name;
    }

    public void setAcct_name(String acct_name) {
        this.acct_name = acct_name;
    }

    public String getAcct_password() {
        return acct_password;
    }

    public void setAcct_password(String acct_password) {
        this.acct_password = acct_password;
    }

    public String getAcct_phone() {
        return acct_phone;
    }

    public void setAcct_phone(String acct_phone) {
        this.acct_phone = acct_phone;
    }

    public String getAcct_mail() {
        return acct_mail;
    }

    public void setAcct_mail(String acct_mail) {
        this.acct_mail = acct_mail;
    }

    public String getHead_url() {
        return head_url;
    }

    public void setHead_url(String head_url) {
        this.head_url = head_url;
    }

    public boolean isIs_admin() {
        return is_admin;
    }

    public void setIs_admin(boolean is_admin) {
        this.is_admin = is_admin;
    }

    public boolean isIs_vip() {
        return is_vip;
    }

    public void setIs_vip(boolean is_vip) {
        this.is_vip = is_vip;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

}
