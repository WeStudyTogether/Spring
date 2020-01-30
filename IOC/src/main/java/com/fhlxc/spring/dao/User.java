package com.fhlxc.spring.dao;

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
    
    public User() {
    }
    
    public User(String name, int age, double money) {
        this.name = name;
        this.age = age;
        this.money = money;
    }
    
    @Override
    public String toString() {
        return "Id:" + getId() + " Name:" + getName() + " Age:" + getAge() + " Money:" + getMoney();
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
