package com.fhlxc.chapter01;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
* @author Xingchao Long
* @date 2020年3月30日 下午2:53:45
* @classname Users
* @description 
*/

@Component
@ConfigurationProperties(prefix = "my")
public class Users {

    @Autowired
    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
    
    @Override
    public String toString() {
        String result = "";
        for(User u: users) {
            result = result + "\n" + u.toString();
        }
        return result;
    }
    
}
