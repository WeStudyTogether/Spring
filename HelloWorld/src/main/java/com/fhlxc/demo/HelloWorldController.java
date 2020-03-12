package com.fhlxc.demo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fhlxc.mapper.UserMapper;
import com.fhlxc.mapper.UserMapper1;
import com.fhlxc.model.User;
import com.fhlxc.services.UserService;

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
    @Autowired
    private UserService UserService;
    
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
    
    @RequestMapping(value = "alluser.do")
    public String getall(Model model) {
        List<com.fhlxc.demo.User> users = UserService.getAll();
        model.addAttribute("users", users);
        return "hello";
    }
    
    @RequestMapping(value = "insert.do")
    public String adduser(Model model) {
        com.fhlxc.demo.User user = new com.fhlxc.demo.User();
        user.setName("cuiyw");
        user.setAge(27);
        UserService.insert(user);
        return "forward:/helloworld/alluser.do";
    }
    
    @RequestMapping(value = "getuserbyid.do/{id}")
    public ModelAndView getUserById(@PathVariable("id") int id) {
        System.out.println(id);
        com.fhlxc.demo.User user = UserService.getOne(id);
        System.out.println(user.toString());
        ModelAndView modelAndView = new ModelAndView("hello");
        List<com.fhlxc.demo.User> users = new ArrayList<com.fhlxc.demo.User>();
        users.add(user);
        modelAndView.addObject("users", users);
        return modelAndView;
    }
    
    @RequestMapping(value = "deleteuserbyid.do/{id}")
    public String deleteUserById(@PathVariable("id") int id) {
        UserService.delete(id);
        return "forward:/helloworld/alluser.do";
    }
    
    @RequestMapping(value = "updateuserbyid.do/{id}")
    public String updateUserById(@PathVariable("id") int id) {
        com.fhlxc.demo.User user = UserService.getOne(id);
        System.out.println(user.toString());
        user.setAge(28);
        System.out.println(user.toString());
        UserService.update(user);
        System.out.println(user.toString());
        return "forward:/helloworld/alluser.do";
    }
    
}
