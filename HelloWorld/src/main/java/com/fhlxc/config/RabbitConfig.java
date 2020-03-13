package com.fhlxc.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
* @author Xingchao Long
* @date 2020年3月13日 下午8:04:18
* @ClassName RabbitConfig
* @Description
*/

@Configuration
public class RabbitConfig {

    @Bean
    public Queue queue() {
        return new Queue("hello");
    }
    
}
