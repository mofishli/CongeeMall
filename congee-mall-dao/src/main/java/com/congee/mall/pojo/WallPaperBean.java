package com.congee.mall.pojo;

import java.util.Date;

/**
 * Created by zhouli on 17/6/7.
 */
public class WallPaperBean {
    private String pic;
    private String tips;
    private Date showDate;  //日期类型

    public Date getShowDate() {
        return showDate;
    }

    public void setShowDate(Date showDate) {
        this.showDate = showDate;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }
}
