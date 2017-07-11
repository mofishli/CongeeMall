package com.congee.mall.constants;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zhouli on 17/5/9.
 */
public class DateUtil  {

    public static final String FORMAT_YYYY_MM_DD="yyyy-MM-dd";
    public static final String FORMAT_YYYY_MM_DD_HH_MM_SS="yyyy-MM-dd HH:mm:ss";


    public static String getFormatDateString(Date date){
        return new SimpleDateFormat(FORMAT_YYYY_MM_DD).format(date);
    }

    public static Date getFormatDate(Date date){

        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(FORMAT_YYYY_MM_DD);

        try {
            date = simpleDateFormat.parse(simpleDateFormat.format(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return date;
    }

    public static String getFormatDateAndTime(Date date){
        return new SimpleDateFormat(FORMAT_YYYY_MM_DD_HH_MM_SS).format(date);
    }









}
