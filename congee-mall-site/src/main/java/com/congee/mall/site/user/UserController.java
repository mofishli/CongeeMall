package com.congee.mall.site.user;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import constants.RequestResult;
import com.congee.mall.service.user.UserService;
import com.congee.mall.site.constants.UserUrl;
import constants.SystemCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created by zhouli on 17/4/30.
 */
@CrossOrigin("http://127.0.0.1")
@RestController
@RequestMapping(UserUrl.OUT_PATH)
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = UserUrl.LOGIN)
    public RequestResult login(HttpServletRequest request, @RequestParam("data") String data,
                               @RequestBody(required = false) String json) {
        System.out.println("RequestBody......."+ json);
        System.out.println("getParameterNames......."+ JSON.toJSONString(request.getParameterNames()));
        System.out.println("getCookies......."+ JSON.toJSONString(request.getCookies()));
        System.out.println("getAuthType......."+ JSON.toJSONString(request.getAuthType()));
        System.out.println("getSession......."+ JSON.toJSONString(request.getSession()));
        System.out.println("getHeaderNames......."+ JSON.toJSONString(request.getHeaderNames()));
        System.out.println("getMethod......."+ JSON.toJSONString(request.getMethod()));
        System.out.println("getAttributeNames......."+ JSON.toJSONString(request.getAttributeNames()));
        System.out.println("getContextPath......."+ JSON.toJSONString(request.getContextPath()));




        try {
            Map map= JSONObject.parseObject(data);
            return  userService.loginService(map);
        }catch (Exception e){
            return new RequestResult(SystemCode.interNotExist);
        }

    }

}
