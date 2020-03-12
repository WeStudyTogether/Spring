package com.fhlxc.demo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
* @author Xingchao Long
* @date 2020年3月8日 下午8:07:02
* @ClassName User
* @Description 
*/

public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    private int id;
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
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User() {
    }
    
    public User(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    
    public String toString() {
        return id + " " + name + " " + age;
    }
    
    public static List<User> getUsers() {
        List<User> users = new ArrayList<User>();
        for (int i = 0; i < 5; i++) {
            User user = new User("小明" + i, 25 + i);
            users.add(user);
        }
        return users;
    }
    
}
