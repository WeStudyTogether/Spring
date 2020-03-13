package com.fhlxc.demo;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
* @author Xingchao Long
* @date 2020年3月13日 下午8:23:29
* @ClassName HelloReceiver2
* @Description
*/

@Component
@RabbitListener(queues = "hello")
public class HelloReceiver2 {

    @RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver2 : " + hello);
    }
    
}
