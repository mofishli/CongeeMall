package com.congee.mall.impl;

import com.congee.mall.dao.UserDao;
import com.congee.mall.dto.UserInfoRequest;
import com.congee.mall.mapper.UserMapper;
import com.congee.mall.pojo.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhouli on 17/5/4.
 */
@Service
public class UserDaoImpl implements UserDao{

    @Autowired
    UserMapper userMapper;

    public UserBean selectByAcctIdDao(String acctId) {
        return userMapper.selectById(acctId);
    }

    public int insertDao(UserBean userBean) {
        return userMapper.insert(userBean);
    }

    public int updateByAcctIdDao(UserBean userBean) {
        return userMapper.update(userBean);
    }

    public List<UserBean> selectUserList(UserInfoRequest request) {
        return userMapper.selectList(request);
    }
}
