package com.fhlxc.demo;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fhlxc.mapper.UserMapper;
import com.fhlxc.mapper.UserMapper1;
import com.fhlxc.model.User;

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
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private RedisTemplate<String, Serializable> redisCacheTemplate;
    
    @RequestMapping(value = "hello4")
    public String hello(Model model) {
        model.addAttribute("users", com.fhlxc.demo.User.getUsers());
        return "hello";
    }
    
    @RequestMapping("hello6")
    public String hello6(Model model) {
        model.addAttribute("users", userMapper.getAll());
        return "hello";
    }
    
    @RequestMapping("hello7")
    public String hello7(Model model) {
        com.fhlxc.demo.User user = new com.fhlxc.demo.User();
        user.setName("fhlxc");
        user.setAge(22);
        userMapper1.insert(user);
        model.addAttribute("users", userMapper1.getAll());
        return "hello";
    }
    
    @RequestMapping(value = "redistest.do")
    public String getallusers(Model model) {
        User user = new User(1, "小明", 27);
        String strkey = "stringuser";
        stringRedisTemplate.opsForValue().set(strkey, user.toString());
        final String valueStr = stringRedisTemplate.opsForValue().get(strkey);
        model.addAttribute(strkey, valueStr);
        String objkey = "objuser";
        redisCacheTemplate.opsForValue().set(objkey, user);
        User u = (User) redisCacheTemplate.opsForValue().get(objkey);
        model.addAttribute(objkey, u);
        return "index";
    }
    
}
