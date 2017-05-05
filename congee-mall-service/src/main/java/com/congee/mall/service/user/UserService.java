package com.congee.mall.service.user;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.congee.mall.dao.UserDao;
import constants.RequestResult;
import com.congee.mall.pojo.UserBean;
import constants.SystemCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by zhouli on 17/5/4.
 */

@Service
public class UserService {

    @Autowired
    UserDao userDao;


    public RequestResult loginService(Map map) {

        String acctId=  map.get("acctId").toString();
        String password= map.get("password").toString();

        UserBean userBean= userDao.loginDao(acctId);
     //  System.out.println("userBean........"+ JSON.toJSONString(userBean));

        JSONObject resultMap=new JSONObject();
        RequestResult result=new RequestResult(SystemCode.ok);

        if(userBean!=null&&acctId.equals(userBean.getAcct_id())){
                if(password.equals(userBean.getAcct_password())){
                    resultMap.put("status",true);
                    resultMap.put("tips","登陆成功！");
                }else {
                    resultMap.put("status",false);
                    resultMap.put("tips","密码错误");
                }
        }else {
            resultMap.put("status",false);
            resultMap.put("tips","账号不存在");
        }

        result.setData(resultMap);
        return  result;
    }
}
