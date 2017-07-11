package com.congee.mall.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by zhouli on 17/6/26.
 */

@Component
@EnableScheduling
public class Sender {

//    @Autowired
//    private AmqpTemplate rabbitTemplate;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Scheduled(fixedDelay=300)
    public void sendMsg(){
        System.out.println("发送信息");
        rabbitTemplate.convertAndSend("hello","hello your mother");
    }

}
