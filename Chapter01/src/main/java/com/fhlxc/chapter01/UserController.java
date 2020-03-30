package com.fhlxc.chapter01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* @author Xingchao Long
* @date 2020年3月30日 下午2:59:00
* @classname UserController
* @description 
*/

@RestController
public class UserController {

    @Autowired
    User user;
    @Autowired
    Users users;
    
    @RequestMapping("user")
    public String user() {
        return user.toString();
    }
    
    @RequestMapping("users")
    public String users() {
        return users.toString();
    }
    
}
