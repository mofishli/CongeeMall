package com.congee.mall.dao;

import com.congee.mall.pojo.WallPaperBean;

import java.util.List;

/**
 * Created by zhouli on 17/6/7.
 */
public interface WallPaperDao {
    List<WallPaperBean> selectPaperList();
    int insertPaper(WallPaperBean wallPaperBean);
    int updatePaper(WallPaperBean wallPaperBean);
}
