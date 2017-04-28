package com.congee.mall.mapper;

import com.congee.mall.pojo.ProductList;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by zhouli on 17/4/23.
 */

@Mapper
public interface ProductListMapper {

  //  @Select("select*from productlist where id = #{id}")

    ProductList selectById(Integer id);

    int insertProduct(ProductList productList);

    int deleteById(Integer id);

    int updateProduct(ProductList productList);
}
