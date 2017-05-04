package com.congee.mall.impl;

import com.congee.mall.dao.NavigatorDao;
import com.congee.mall.mapper.NavigatorMapper;
import com.congee.mall.pojo.NavigatorBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhouli on 17/5/1.
 */
@Service
public class NavigatorDaoImpl implements NavigatorDao{
    @Autowired
    NavigatorMapper navigatorMapper;




    public List selectByParentIdDao(int parentID) {

        return navigatorMapper.selectByParentId(parentID);
    }
}
