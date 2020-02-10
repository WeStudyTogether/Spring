package com.fhlxc.spring.mybatis;

import java.util.List;

import com.fhlxc.spring.dao.User;

/**
* @author Xingchao Long
* @date 2020年2月10日 下午5:53:15
* @ClassName Role
* @Description 
*/

public class Role {
    
    private int id;
    private String name;
    private String desp;
    private List<User> users;
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDesp() {
        return desp;
    }
    
    public void setDesp(String desp) {
        this.desp = desp;
    }
    
    public List<User> getUsers() {
        return users;
    }
    
    public void setUsers(List<User> users) {
        this.users = users;
    }
    
}
