package com.congee.mall.impl;

import com.congee.mall.dao.ProductListDao;
import com.congee.mall.mapper.ProductListMapper;
import com.congee.mall.pojo.ProductList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhouli on 17/4/23.
 */

@Service
public class ProductListDaoImpl implements ProductListDao{

    @Autowired
    ProductListMapper productListMapper;

    public ProductList selectByIdDao(Integer id) {
        return productListMapper.selectById(id);
    }

    public int insertProductDao(ProductList productList) {
        return productListMapper.insertProduct(productList);
    }

    public int deleteByIdDao(Integer id) {
        return productListMapper.deleteById(id);
    }

    public int updateProductDao(ProductList productList) {
        return productListMapper.updateProduct(productList);
    }
}
