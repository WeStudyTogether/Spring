package com.fhlxc.spring.dao;

import com.fhlxc.spring.mybatis.UserStatus;

/**
* @author Xingchao Long
* @date 2020年1月30日 下午5:14:30
* @ClassName User
* @Description 
*/

public class User {
    
    private int id;
    private String name;
    private int age;
    private double money;
    private UserStatus status;
    
    public User() {
    }
    
    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }

    public User(String name, int age, double money) {
        this.name = name;
        this.age = age;
        this.money = money;
    }
    
    public User(String name, double money, UserStatus status) {
        this.name = name;
        this.status = status;
        this.money = money;
    }
    
    @Override
    public String toString() {
        return "Id:" + getId() + " Name:" + getName() + " Age:" + getAge() + " Money:" + getMoney() + " Status:" + getStatus();
    }

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

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
    
}
