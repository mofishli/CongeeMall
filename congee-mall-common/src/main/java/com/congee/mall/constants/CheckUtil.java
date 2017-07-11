package com.congee.mall.constants;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by zhouli on 17/5/5.
 */
public class CheckUtil {

    public static JSONObject checkParseJsonObject(String data) throws ApiException{
        JSONObject jsonObject;
        try{
            jsonObject= JSONObject.parseObject(data);
        }catch (Exception e){
            throw new ApiException(SystemCode.paramsParseError);
        }
        return jsonObject;
    }

    public static String keyParamString(JSONObject jsonmap,String key) throws ApiException{
        String param;
        try{
               param = jsonmap.get(key).toString();
        }catch (Exception e){
            throw new ApiException(SystemCode.paramsMissError);
        }
        return param;
    }

    public static String normalParamString(JSONObject jsonmap,String key){
        String  param=null;

        if(jsonmap.get(key)!=null){
           param=jsonmap.get(key).toString();
        }
        return param;
    }

    public static Boolean normalParamBoolean(JSONObject jsonmap,String key) throws ApiException{

        Boolean  param=null;

        if(jsonmap.get(key)!=null){
            try{
                param = (Boolean)jsonmap.get(key);
            }catch (Exception e){
                throw new ApiException(SystemCode.paramsTypeError);
            }
        }

        return param;
    }
    public static Integer normalParamInteger(JSONObject jsonmap,String key) throws ApiException{
        Integer  param=null;

        if(jsonmap.get(key)!=null){
            try{
                param = (Integer)jsonmap.get(key);
            }catch (Exception e){
                throw new ApiException(SystemCode.paramsTypeError);
            }
        }

        return param;
    }

    public static Integer keyParamInteger(JSONObject jsonmap,String key) throws ApiException{
        Integer param;
        String paramString;
        try{
            paramString = jsonmap.get(key).toString();
        }catch (Exception e){
            throw new ApiException(SystemCode.paramsMissError);
        }
        try{
            param = Integer.parseInt(paramString);
        }catch (Exception e){
            throw new ApiException(SystemCode.paramsParseError);
        }

        return param;
    }
}
