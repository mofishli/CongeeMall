package com.congee.mall.dao;

import com.congee.mall.dto.UserInfoRequest;
import com.congee.mall.pojo.UserBean;

import java.util.List;

/**
 * Created by zhouli on 17/5/4.
 */
public interface UserDao {

    UserBean selectByAcctIdDao(String acctId);
    int insertDao(UserBean userBean);
    int updateByAcctIdDao(UserBean userBean);
    List<UserBean> selectUserList(UserInfoRequest request);
}
