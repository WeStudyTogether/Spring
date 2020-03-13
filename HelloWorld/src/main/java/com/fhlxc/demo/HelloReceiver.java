package com.fhlxc.demo;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
* @author Xingchao Long
* @date 2020年3月13日 下午8:14:01
* @ClassName HelloReceiver
* @Description
*/

@Component
@RabbitListener(queues = "hello")
public class HelloReceiver {
    
    @RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver1 : " + hello);
    }
    
}
