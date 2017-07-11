package com.congee.mall.constants;

import java.util.Random;

/**
 * Created by zhouli on 17/6/7.
 */
public class CommonUtil {
    public static int getRandomNum(int min,int max){
        Random random=new Random();

      return   random.nextInt(max)%(max-min+1)+min;
    }

}
