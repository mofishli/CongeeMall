package com.congee.mall.impl;

import com.congee.mall.dao.UserDao;
import com.congee.mall.mapper.UserMapper;
import com.congee.mall.pojo.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhouli on 17/5/4.
 */
@Service
public class UserDaoImpl implements UserDao{

    @Autowired
    UserMapper userMapper;

    public UserBean loginDao(String acctId) {
        return userMapper.login(acctId);
    }
}
