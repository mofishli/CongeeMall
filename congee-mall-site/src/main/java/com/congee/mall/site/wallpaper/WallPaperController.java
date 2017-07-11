package com.congee.mall.site.wallpaper;

import com.congee.mall.constants.RequestResult;
import com.congee.mall.pojo.WallPaperBean;
import com.congee.mall.service.wallpaper.WallPaperService;
import com.congee.mall.site.constants.WallPaperUrl;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zhouli on 17/6/6.
 */

@RestController
@RequestMapping(WallPaperUrl.OUT_PATH)
public class WallPaperController {

    @Autowired
    WallPaperService wallPaperService;


    @RequestMapping(WallPaperUrl.UPLOAD_WALLPAPER)
    @ResponseBody
    public RequestResult upLoadWallPaper(@RequestParam("file") MultipartFile file ){

        return  wallPaperService.upLoadFile(file);
    }


    @RequestMapping(WallPaperUrl.EVERY_WALLPAPER)
    @ResponseBody
    public RequestResult everydaydWallPaper() {
        return  wallPaperService.everydayPaper();
    }


}
