package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fhlxc.demo.HelloSender;

/**
* @author Xingchao Long
* @date 2020年3月13日 下午8:32:29
* @ClassName SpringBootRabbitMqSenderApplicationTests
* @Description
*/

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootRabbitMqSenderApplicationTests {
    
    @Autowired
    private HelloSender helloSender;
    
    @Test
    public void hello() {
        for (int i = 0; i < 10; i++) {
            helloSender.send(i);
        }
    }
}
