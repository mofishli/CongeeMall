package com.congee.mall.constants;

import java.io.Serializable;

/**
 * Created by zhouli on 17/5/1.
 */
public class RequestResult implements Serializable {

    public static final RequestResult SUCCESS_RESULT=new RequestResult(SystemCode.ok);
    public static final RequestResult FAULT_RESULT=new RequestResult(SystemCode.ok);

    private String msg=SystemCode.ok.getMsg();

    private boolean success=true;

    private Object data;

    private int code=SystemCode.ok.getCode();

    public RequestResult(boolean success,int code,String msg){
        setSuccess(success);
        setCode(code);
        setMsg(msg);
    }
    public RequestResult(BaseCode baseCode){
        setSuccess(baseCode.getSuccess());
        setCode(baseCode.getCode());
        setMsg(baseCode.getMsg());
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Object getData() {
        return data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
