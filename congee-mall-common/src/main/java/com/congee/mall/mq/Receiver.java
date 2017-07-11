package com.congee.mall.mq;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by zhouli on 17/6/26.
 */

@Component

public class Receiver {


//    @RabbitListener(queues = "hello")
//    public void receiveMsg(String hello){
//
//           System.out.println("收到消息－－－－－－"+hello);
//        }
}
