package com.congee.mall.pojo;

import java.io.Serializable;

/**
 * Created by zhouli on 17/5/1.
 */
public class RequestResult implements Serializable {

    public String msg="成功";

    public boolean success=true;

    public Object data;


    public void setData(Object data) {
        this.data = data;
    }
}
