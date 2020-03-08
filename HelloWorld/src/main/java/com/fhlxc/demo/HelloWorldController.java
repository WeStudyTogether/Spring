package com.fhlxc.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @author Xingchao Long
* @date 2020年3月8日 下午8:11:04
* @ClassName HelloWorldController
* @Description
*/

@Controller
@RequestMapping("helloworld")
public class HelloWorldController {

    @RequestMapping(value = "hello4")
    public String hello(Model model) {
        model.addAttribute("users", User.getUsers());
        return "hello";
    }
    
}
