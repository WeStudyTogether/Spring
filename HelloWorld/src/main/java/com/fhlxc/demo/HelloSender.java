package com.fhlxc.demo;

import java.util.Date;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;

/**
* @author Xingchao Long
* @date 2020年3月13日 下午8:05:50
* @ClassName HelloSender
* @Description
*/

public class HelloSender {
    
    @Autowired
    private AmqpTemplate rabbiTemplate;
    
    public void send(int index) {
        String context = "hello Queue " + index + new Date();
        System.out.println("Sender : " + context);
        this.rabbiTemplate.convertAndSend("hello", context);
    }
    
}
