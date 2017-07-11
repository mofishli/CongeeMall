package com.congee.mall.mapper;

import com.congee.mall.dto.UserInfoRequest;
import com.congee.mall.pojo.UserBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by zhouli on 17/5/4.
 */
@Mapper
public interface UserMapper {
    UserBean selectById(String acctId);
    int insert(UserBean userBean);
    int update(UserBean userBean);
    List<UserBean> selectList(UserInfoRequest request);
}
