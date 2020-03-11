package com.fhlxc.model;

import java.io.Serializable;

/**
* @author Xingchao Long
* @date 2020年3月11日 下午7:50:44
* @ClassName User
* @Description
*/

public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private int id;
    private String name;
    private int age;
    
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
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    
    public User(int id, String name, int age) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
    }
    
    public User() {
        super();
    }
    
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
    }

}
