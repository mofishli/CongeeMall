package com.congee.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by zhouli on 17/4/20.
 */

@SpringBootApplication

public class Application extends SpringBootServletInitializer{


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);

//        Test test=new Test();
//        for(int i=0;i<3;i++){
//
//            MyThread myThread=new MyThread(test);
//            myThread.start();
//
//        }

    }





}
