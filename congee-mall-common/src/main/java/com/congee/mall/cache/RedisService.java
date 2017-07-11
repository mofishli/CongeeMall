package com.congee.mall.cache;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.*;
import org.springframework.stereotype.Service;

/**
 * Created by zhouli on 17/5/31.
 */

@Service
public class RedisService {

    @Autowired
    StringRedisTemplate redisTemplate;

    public void setValue(String key,Object obj){
       BoundValueOperations bo= redisTemplate.boundValueOps(key);
       bo.set(JSON.toJSONString(obj));
    }

    public Object getValue(String key){
        BoundValueOperations bo= redisTemplate.boundValueOps(key);
        return bo.get();
    }

}
