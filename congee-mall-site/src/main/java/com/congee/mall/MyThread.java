package com.congee.mall;

/**
 * Created by zhouli on 17/7/6.
 */
public class MyThread extends Thread {

    private Test mytest;
    @Override
    public void run() {

        Test test=new Test();
        test.test();
    }

    public MyThread(Test test){
        this.mytest=test;
    }
}
