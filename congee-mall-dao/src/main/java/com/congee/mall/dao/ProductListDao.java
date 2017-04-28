package com.congee.mall.dao;

import com.congee.mall.pojo.ProductList;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zhouli on 17/4/23.
 */
public interface ProductListDao {


     ProductList selectByIdDao(Integer id);

     int insertProductDao(ProductList productList);

     int deleteByIdDao(Integer id);

     int updateProductDao(ProductList productList);

}
