package com.fhlxc.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fhlxc.mapper.UserMapper;
import com.fhlxc.mapper.UserMapper1;

/**
* @author Xingchao Long
* @date 2020年3月8日 下午8:11:04
* @ClassName HelloWorldController
* @Description
*/

@Controller
@RequestMapping("helloworld")
public class HelloWorldController {


    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserMapper1 userMapper1;
    
    @RequestMapping(value = "hello4")
    public String hello(Model model) {
        model.addAttribute("users", User.getUsers());
        return "hello";
    }
    
    @RequestMapping("hello6")
    public String hello6(Model model) {
        model.addAttribute("users", userMapper.getAll());
        return "hello";
    }
    
    @RequestMapping("hello7")
    public String hello7(Model model) {
        User user = new User();
        user.setName("fhlxc");
        user.setAge(22);
        userMapper1.insert(user);
        model.addAttribute("users", userMapper1.getAll());
        return "hello";
    }
    
}
