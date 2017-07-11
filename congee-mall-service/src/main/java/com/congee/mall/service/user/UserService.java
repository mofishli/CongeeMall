package com.congee.mall.service.user;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.congee.mall.dao.UserDao;
import com.congee.mall.dto.UserInfoRequest;
import com.congee.mall.dto.UserInfoResponse;
import com.congee.mall.constants.*;
import com.congee.mall.pojo.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by zhouli on 17/5/4.
 */

@Service
public class UserService {

    @Autowired
    UserDao userDao;


    public RequestResult loginService(JSONObject map) throws ApiException {

        String acctId = CheckUtil.keyParamString(map, "acctId");
        String password = CheckUtil.keyParamString(map, "password");

        UserBean userBean = userDao.selectByAcctIdDao(acctId);
        //  System.out.println("userBean........"+ JSON.toJSONString(userBean));

        JSONObject resultMap = new JSONObject();
        RequestResult result = RequestResult.SUCCESS_RESULT;

        if (userBean != null && acctId.equals(userBean.getAcct_id())) {
            if (password.equals(userBean.getAcct_password())) {
                resultMap.put("status", true);
                resultMap.put("tips", "登陆成功！");
            } else {
                resultMap.put("status", false);
                resultMap.put("tips", "密码错误");
            }
        } else {
            resultMap.put("status", false);
            resultMap.put("tips", "账号不存在");
        }

        result.setData(resultMap);
        return result;
    }


    public RequestResult register(JSONObject jsonObj) throws ApiException {
        RequestResult result = RequestResult.SUCCESS_RESULT;
        JSONObject jsonObject = new JSONObject();

        String acctId = CheckUtil.keyParamString(jsonObj, "acctId");
        String password = CheckUtil.keyParamString(jsonObj, "password");

        UserBean userBean = userDao.selectByAcctIdDao(acctId);

        if (userBean != null) {
            jsonObject.put("status", false);
            jsonObject.put("tips", "用户名已注册");
        } else {
            UserBean newUserBean = new UserBean();
            newUserBean.setAcct_id(acctId);
            newUserBean.setAcct_password(password);
            int resultFlag = userDao.insertDao(newUserBean);
            System.out.println("插入userbean......." + resultFlag);
            if (resultFlag != 0) {
                jsonObject.put("status", true);
                jsonObject.put("tips", "注册成功");
            } else {
                jsonObject.put("status", false);
                jsonObject.put("tips", "注册失败");
            }
        }
        result.setData(jsonObject);
        return result;
    }

    public RequestResult updateService(JSONObject jsonObj) throws ApiException{

        Integer userId = CheckUtil.keyParamInteger(jsonObj, "userId");
        String acctId = CheckUtil.keyParamString(jsonObj, "acctId");
        String password = CheckUtil.keyParamString(jsonObj, "password");

        RequestResult result=RequestResult.SUCCESS_RESULT;

        JSONObject jsonObject=new JSONObject();

        UserBean userBean=userDao.selectByAcctIdDao(acctId);
        System.out.println("userBean=====before"+JSON.toJSONString(userBean));
        if(!userBean.getAcct_password().equals(password)){
            jsonObject.put("status",false);
            jsonObject.put("tips","密码错误");
            result.setData(jsonObject);
            return  result;
        }

        String newpassword=CheckUtil.normalParamString(jsonObj,"newpassword");
        String acctName=CheckUtil.normalParamString(jsonObj,"acctName");
        String acctPhone=CheckUtil.normalParamString(jsonObj,"acctPhone");
        String acctMail=CheckUtil.normalParamString(jsonObj,"acctMail");
        String headUrl=CheckUtil.normalParamString(jsonObj,"headUrl");
        Boolean isAdmin=CheckUtil.normalParamBoolean(jsonObj,"isAdmin");
        Boolean isVip=CheckUtil.normalParamBoolean(jsonObj,"isVip");
        String instruction=CheckUtil.normalParamString(jsonObj,"instruction");


        if(newpassword!=null) {
            userBean.setAcct_password(newpassword);
        }
        if(acctName!=null){
            userBean.setAcct_name(acctName);
        }
        if(acctPhone!=null){
            userBean.setAcct_phone(acctPhone);
        }
        if(acctMail!=null){
            userBean.setAcct_mail(acctMail);
        }
        if(headUrl!=null){
            userBean.setHead_url(headUrl);
        }
        if(isAdmin!=null){
            userBean.setIs_admin(isAdmin);
        }
        if(isVip!=null){
            userBean.setIs_vip(isVip);
        }
        if(instruction!=null){
            userBean.setInstruction(instruction);
        }

        userBean.setUpdate_time(new Date());

       Integer resultFlag= userDao.updateByAcctIdDao(userBean);

        if (resultFlag != 0) {
            jsonObject.put("status", true);
            jsonObject.put("tips", "更新成功");
        } else {
            jsonObject.put("status", false);
            jsonObject.put("tips", "更新失败");
        }

        result.setData(jsonObject);
        return result;
    }


    public RequestResult queryList(JSONObject jsonObj) throws ApiException{


        String acctName=CheckUtil.normalParamString(jsonObj,"acctName");
        String acctPhone=CheckUtil.normalParamString(jsonObj,"acctPhone");
        String acctMail=CheckUtil.normalParamString(jsonObj,"acctMail");
        Boolean isAdmin=CheckUtil.normalParamBoolean(jsonObj,"isAdmin");
        Boolean isVip=CheckUtil.normalParamBoolean(jsonObj,"isVip");
        Integer start=CheckUtil.normalParamInteger(jsonObj,"start");
        Integer limit=CheckUtil.normalParamInteger(jsonObj,"limit");

        if(start==null){
            start=0;
        }
        if(limit==null){
            limit=10;
        }
        UserInfoRequest request=new UserInfoRequest();
        request.setAcctName(acctName);
        request.setAcctPhone(acctPhone);
        request.setAcctMail(acctMail);
        request.setAdmin(isAdmin);
        request.setVip(isVip);
        request.setStart(start);
        request.setLimit(limit);

        List<UserBean>  userList=userDao.selectUserList(request);
        List<UserInfoResponse> userInfos=new ArrayList<UserInfoResponse>();
        for(UserBean userBean:userList){
            UserInfoResponse userInfo=new UserInfoResponse();
            userInfo.setUserId(userBean.getUser_id());
            userInfo.setAcctId(userBean.getAcct_id());
            userInfo.setAcctName(userBean.getAcct_name());
            userInfo.setAcctPassword(userBean.getAcct_password());
            userInfo.setAcctPhone(userBean.getAcct_phone());
            userInfo.setAcctMail(userBean.getAcct_mail());
            userInfo.setAdmin(userBean.isIs_admin());
            userInfo.setVip(userBean.isIs_vip());
            userInfo.setUpdateTime(DateUtil.getFormatDateAndTime(userBean.getUpdate_time()));
            userInfo.setCreateTime(DateUtil.getFormatDateAndTime(userBean.getCreate_time()));
            userInfo.setInstruction(userBean.getInstruction());
            userInfos.add(userInfo);
        }
        new SimpleDateFormat("yyyy-mm-dd hh-mm");
        RequestResult result=RequestResult.SUCCESS_RESULT;
        result.setData(userInfos);
        return result;
    }
}
