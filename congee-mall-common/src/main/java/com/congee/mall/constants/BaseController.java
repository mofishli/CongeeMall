package com.congee.mall.constants;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by zhouli on 17/5/5.
 */
public class BaseController {

    public  JSONObject checkParseJsonObject(String data) throws ApiException{
        JSONObject jsonObject;
        try{
           jsonObject= CheckUtil.checkParseJsonObject(data);
        }catch (ApiException e){
           throw new ApiException(e.getSystemCode());
        }

        return jsonObject;
    }

}
