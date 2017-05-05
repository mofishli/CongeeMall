package com.congee.mall.dao;

import com.congee.mall.pojo.UserBean;

/**
 * Created by zhouli on 17/5/4.
 */
public interface UserDao {

    UserBean loginDao(String acctId);
}
