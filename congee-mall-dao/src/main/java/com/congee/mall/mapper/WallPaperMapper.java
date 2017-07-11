package com.congee.mall.mapper;

import com.congee.mall.pojo.WallPaperBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by zhouli on 17/6/7.
 */
@Mapper
public interface WallPaperMapper {
    List<WallPaperBean> selectList();
    int insert(WallPaperBean wallPaperBean);
    int update(WallPaperBean wallPaperBean);
}
