package com.congee.mall.impl;

import com.congee.mall.dao.WallPaperDao;
import com.congee.mall.mapper.WallPaperMapper;
import com.congee.mall.pojo.WallPaperBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhouli on 17/6/7.
 */
@Service
public class WallPaperImpl implements WallPaperDao {

    @Autowired
    WallPaperMapper wallPaperMapper;

    public List<WallPaperBean> selectPaperList() {
        return wallPaperMapper.selectList();
    }

    public int insertPaper(WallPaperBean wallPaperBean) {
        return wallPaperMapper.insert(wallPaperBean);
    }

    public int updatePaper(WallPaperBean wallPaperBean) {
        return wallPaperMapper.update(wallPaperBean);
    }
}
