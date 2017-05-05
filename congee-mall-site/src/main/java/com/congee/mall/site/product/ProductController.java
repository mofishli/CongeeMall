package com.congee.mall.site.product;

import com.alibaba.fastjson.JSONObject;
import constants.RequestResult;
import com.congee.mall.service.product.ProductService;
import com.congee.mall.site.constants.ProductUrl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Created by zhouli on 17/4/20.
 */

@RestController
@RequestMapping(ProductUrl.OUT_PATH)
public class ProductController {

    @Autowired
    ProductService productService;



    @RequestMapping(value = ProductUrl.SELECT_PRODUCT_LIST,method = RequestMethod.GET)
    public RequestResult selectProductList(){

        RequestResult result=RequestResult.SUCCESS_RESULT;
        result.setData(productService.selectProductListId(1));

        return result;
    }

    @RequestMapping(value = ProductUrl.INSERT_PRODUCT_LIST)
    public int insertProductList(@RequestParam("data") String data){

       Map map=JSONObject.parseObject(data);


       return  productService.insertProductList(productService.creteProductList(map));

      //  return 1;
    }


    @RequestMapping(ProductUrl.UPDATE_PRODUCT_LIST)
    public int updateProductList(@RequestParam("data") String data){

        Map map=JSONObject.parseObject(data);

        productService.updateProductList(productService.creteProductList(map));

        return  1;
    }
    @RequestMapping(ProductUrl.DELETE_PRODUCT_LIST)
    public int deleteProductList(@RequestParam("data") String data){

        Map map=JSONObject.parseObject(data);
        Integer id= (Integer) map.get("id");
        productService.deleteProductList(id);
        return  1;
    }




}
