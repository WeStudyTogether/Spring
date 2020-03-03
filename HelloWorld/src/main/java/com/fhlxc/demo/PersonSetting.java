package com.fhlxc.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
* @author Xingchao Long
* @date 2020年3月3日 下午5:34:29
* @ClassName PersonSetting
* @Description 
*/

@Component
@PropertySource(value = "test.properties")
@ConfigurationProperties(prefix = "person")
public class PersonSetting {

    private String name;
    private int age;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
}
