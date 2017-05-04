package com.congee.mall.dao;

import com.congee.mall.pojo.NavigatorBean;

import java.util.List;

/**
 * Created by zhouli on 17/5/1.
 */
public interface NavigatorDao {
    List selectByParentIdDao(int parentID);
}
