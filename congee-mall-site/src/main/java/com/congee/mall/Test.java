package com.congee.mall;

import java.util.Objects;

/**
 * Created by zhouli on 17/7/6.
 */
public class Test {

    private Object lock=new Object();

    public synchronized static void  test(){
        System.out.println("开始了");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("结束了");
    }

    public void  testBlock(){

        synchronized (lock){
            test();
        }
    }
}
