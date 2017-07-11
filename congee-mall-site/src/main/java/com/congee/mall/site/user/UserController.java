package com.congee.mall.site.user;

import com.congee.mall.cache.CacheHelper;
import com.alibaba.fastjson.JSONObject;
import com.congee.mall.constants.*;
import com.congee.mall.service.user.UserService;
import com.congee.mall.site.constants.UserUrl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by zhouli on 17/4/30.
 */
@CrossOrigin("http://127.0.0.1")
@RestController
@RequestMapping(UserUrl.OUT_PATH)
public class UserController extends BaseController{

    @Autowired
    UserService userService;

    @Autowired
    CacheHelper cacheHelper;

    @RequestMapping(value = UserUrl.LOGIN)
    public RequestResult login(HttpServletRequest request, @RequestParam("data") String data,
                               @RequestBody(required = false) String json) {
        try {
            JSONObject map= checkParseJsonObject(data);
            return  userService.loginService(map);
        }catch (ApiException e){
            return new RequestResult(e.getSystemCode());
        }

    }

    @RequestMapping(value = UserUrl.REGISTER)
    public RequestResult register(HttpServletRequest request, @RequestParam("data") String data,
                               @RequestBody(required = false) String json) {
        try {
            JSONObject map= checkParseJsonObject(data);
            return  userService.register(map);
        }catch (ApiException e){
            return new RequestResult(e.getSystemCode());
        }

    }
    @RequestMapping(value = UserUrl.UPDATE)
    public RequestResult update(HttpServletRequest request, @RequestParam("data") String data,
                                @RequestBody(required = false) String json) {
        try {
            JSONObject map= checkParseJsonObject(data);
            return  userService.updateService(map);
        }catch (ApiException e){
            return new RequestResult(e.getSystemCode());
        }

    }
    @RequestMapping(value = UserUrl.USER_LIST)
    public RequestResult updateUser(HttpServletRequest request, @RequestParam("data") String data,
                                  @RequestBody(required = false) String json) {
        try {
            JSONObject map= checkParseJsonObject(data);
         // PageHelper.startPage(0,2);

            RequestResult requestResult = userService.queryList(map);

//            cacheHelper.setValue("shabi",requestResult);
//
//
//            System.out.println("取出缓存"+cacheHelper.getValue("shabi"));


            return   requestResult;
        }catch (ApiException e){
            return new RequestResult(e.getSystemCode());
        }

    }

    @Autowired
    RedisTemplate redisTemplate;

    @RequestMapping(value = "hello")
    public String test(HttpServletRequest request, @RequestParam("data") String data,
                                    @RequestBody(required = false) String json) {


      //String ssss=redisTemplate.boundValueOps("aaa").get();

        System.out.println();



        return  "success!!!!";
    }

}
