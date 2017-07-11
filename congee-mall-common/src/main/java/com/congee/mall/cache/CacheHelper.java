package com.congee.mall.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhouli on 17/5/31.
 */


@Service
public class  CacheHelper {

    @Autowired
    private  RedisService redisService;


    public  void  setValue(String key,Object obj){
        redisService.setValue(key,obj);
    }

    public  Object getValue(String key){
        return redisService.getValue(key);
    }


}
