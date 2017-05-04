package com.congee.mall.mapper;

import com.congee.mall.pojo.UserBean;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by zhouli on 17/5/4.
 */
@Mapper
public interface UserMapper {
    UserBean login(int acct_id);
}
