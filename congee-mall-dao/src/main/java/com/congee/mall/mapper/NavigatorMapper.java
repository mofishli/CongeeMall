package com.congee.mall.mapper;

import com.congee.mall.pojo.NavigatorBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by zhouli on 17/5/1.
 */
@Mapper
public interface NavigatorMapper {
   List  selectByParentId(int parentId);
}
