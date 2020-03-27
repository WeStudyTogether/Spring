package com.fhlxc.chapter01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* @author Xingchao Long
* @date 2020年3月27日 下午5:24:26
* @classname HelloController
* @description 
*/

@RestController
public class HelloController {
    
    @GetMapping("hello")
    public String hello() {
        return "hello spring boot!";
    }
    
}
