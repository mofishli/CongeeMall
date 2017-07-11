package com.congee.mall.service.wallpaper;

import com.alibaba.fastjson.JSONObject;
import com.congee.mall.constants.CommonUtil;
import com.congee.mall.constants.DateUtil;
import com.congee.mall.constants.RequestResult;
import com.congee.mall.dao.WallPaperDao;
import com.congee.mall.pojo.WallPaperBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.List;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by zhouli on 17/6/7.
 */

@Service
public class WallPaperService {



    @Autowired
    WallPaperDao wallPaperDao;

    public RequestResult everydayPaper(){
        RequestResult result=RequestResult.SUCCESS_RESULT;
        List<WallPaperBean> wallPaperList=wallPaperDao.selectPaperList();

        if(wallPaperList.size()>0){
            WallPaperBean todayWallPaper=wallPaperList.get(wallPaperList.size()-1);

            if(todayWallPaper.getShowDate()!=DateUtil.getFormatDate(new Date())){
                todayWallPaper=wallPaperList.get(CommonUtil.getRandomNum(0,wallPaperList.size()-1));
            }

            JSONObject  jsonObject=new JSONObject();
            jsonObject.put("picUrl",todayWallPaper.getPic());
            jsonObject.put("tips",todayWallPaper.getTips());
            jsonObject.put("date",DateUtil.getFormatDateString(todayWallPaper.getShowDate()));

            result.setData(jsonObject);
        }

        return result;
    }

    public RequestResult upLoadFile(MultipartFile file){
        String picUrl="http://www.zozosc.com/picUrl/";
        if(!file.isEmpty()){

            String originalFileName=file.getOriginalFilename();
            String typeName=originalFileName.substring(originalFileName.lastIndexOf("."));
            String newFileName=originalFileName.substring(originalFileName.lastIndexOf("."),originalFileName.length()) +new Date();

             String path="/home/picServer/picUrl";
            //String path="/Users/zhouli/Documents/picserver";

            File pathFile=new File(path);
            if(!pathFile.exists()){
                pathFile.mkdirs();
            }
            try{
                byte[] bytes=Base64.encodeBase64(newFileName.getBytes("UTF-8"));
                String newFileNameBase64=new String(bytes)+typeName;
                File fileSave=new File( pathFile.getPath()+File.separator+ newFileNameBase64);
                FileOutputStream fs=new FileOutputStream(fileSave);
                fs.write(file.getBytes());
                fs.flush();
                fs.close();
                picUrl+=newFileNameBase64;
            }catch (Exception e){
                picUrl+="citynight.jpg";
            }
        }
        return   addWallPaper(picUrl);
    }



    public RequestResult addWallPaper(String picUrl){
        WallPaperBean wallPaperBean=new WallPaperBean();
        wallPaperBean.setPic(picUrl);
        wallPaperBean.setShowDate(DateUtil.getFormatDate(new Date()));
        return insertPaper(wallPaperBean);
    }



    public RequestResult insertPaper(WallPaperBean wallPaperBean){
        RequestResult result=RequestResult.SUCCESS_RESULT;
        result.setData(wallPaperDao.insertPaper(wallPaperBean));
        return result;
    }




}
