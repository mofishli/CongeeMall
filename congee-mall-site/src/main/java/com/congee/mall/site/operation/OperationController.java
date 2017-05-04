package com.congee.mall.site.operation;

import com.alibaba.fastjson.JSONObject;
import com.congee.mall.pojo.RequestResult;
import com.congee.mall.service.operation.OpService;
import com.congee.mall.site.constants.OpUrl;
import com.congee.mall.site.constants.ProductUrl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created by zhouli on 17/4/30.
 */
@CrossOrigin("http://127.0.0.1")
@RestController
@RequestMapping(OpUrl.OUT_PATH)
public class OperationController {

    @Autowired
    OpService opService;

    @RequestMapping(value = OpUrl.NAVIGATOR)
    public RequestResult insertProductList(HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        return  opService.getNavigator();
    }

}
