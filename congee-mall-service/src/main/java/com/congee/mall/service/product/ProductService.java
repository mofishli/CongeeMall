package com.congee.mall.service.product;

import com.alibaba.fastjson.JSONObject;
import com.congee.mall.dao.ProductListDao;
import com.congee.mall.impl.ProductListDaoImpl;
import com.congee.mall.pojo.ProductList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by zhouli on 17/4/20.
 */

@Service
public class ProductService {

    @Autowired
    ProductListDao productListDao;



    public  ProductList selectProductListId(Integer id){

        return  productListDao.selectByIdDao(id);
    }

    public int insertProductList(ProductList productList){
        return productListDao.insertProductDao(productList);
    }

    public int updateProductList(ProductList productList){
        return productListDao.updateProductDao(productList);
    }

    public int deleteProductList(Integer id){
        return productListDao.deleteByIdDao(id);
    }

    public ProductList creteProductList(Map map){

        ProductList productList=new ProductList();


        productList.setId( (Integer) map.get("id"));
        productList.setName(map.get("name").toString());
        productList.setBuynum((Integer) map.get("buynum"));
        productList.setPrice((Integer) map.get("price"));
        productList.setFreepost((Boolean) map.get("freepost"));
        productList.setPic((String) map.get("pic"));

        return productList;
    }



}
