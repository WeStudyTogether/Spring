package com.fhlxc.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fhlxc.services.HelloService;

/**
* @author Xingchao Long
* @date 2020年3月3日 下午4:33:27
* @ClassName IndexController
* @Description 
*/

@RestController
@RequestMapping("index")
public class IndexController {
    
    @Autowired
    HelloService helloService;
    @Value("${Test.name}")
    private String name;
    @Autowired
    private Environment env;
    @Autowired
    PersonSetting personSetting;

    @RequestMapping("hello")
    public String Hello() {
        return "Hello World!" + name;
    }
    
    @RequestMapping("hello2")
    public String Hello2() {
        return "Hello World, " + env.getProperty("Test.name");
    }
    
    @RequestMapping("hello3")
    public String Hello3() {
        return "Hello World, Name: "  + personSetting.getName() + ", Age: " + personSetting.getAge();
    }

}
