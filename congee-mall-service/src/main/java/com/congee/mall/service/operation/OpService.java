package com.congee.mall.service.operation;

import com.congee.mall.dao.NavigatorDao;
import com.congee.mall.pojo.NavigatorBean;
import constants.RequestResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhouli on 17/5/1.
 */

@Service
public class OpService {

    @Autowired
    NavigatorDao navigatorDao;

    public RequestResult getNavigator(){
        RequestResult result=RequestResult.SUCCESS_RESULT;

        List navigatorList=navigatorDao.selectByParentIdDao(0);

    //System.out.println("输出navigatorList"+JSONObject.toJSONString(navigatorList));

        result.setData( getResultList(navigatorList));

        return result;
    }


      List<Map> getResultList(List<NavigatorBean> navigatorList){

          List<Map> resultList=new ArrayList<Map>();

          for(int i=0;i<navigatorList.size();i++){
              NavigatorBean nb= navigatorList.get(i);

              Map map=new HashMap();
              map.put("id",nb.getId());
              map.put("name",nb.getName());
              map.put("isparent",nb.isIsparent());
              List itemList=navigatorDao.selectByParentIdDao(nb.getId());
              if(nb.isIsparent()&&itemList.size()>0){
                  map.put("row",getResultList(itemList));
              }
              resultList.add(map);
          }
        return resultList;
      }

}
