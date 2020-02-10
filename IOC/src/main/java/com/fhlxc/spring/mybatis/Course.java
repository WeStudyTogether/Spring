package com.fhlxc.spring.mybatis;

/**
* @author Xingchao Long
* @date 2020年2月10日 下午5:50:22
* @ClassName Course
* @Description 
*/

public class Course {

    private int id;
    private String name;
    private int userid;
    
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
    
    public int getUserid() {
        return userid;
    }
    
    public void setUserid(int userid) {
        this.userid = userid;
    }
    
    @Override
    public String toString() {
        return "Course [id=" + id + ", name=" + name + ", userid=" + userid + "]";
    }
    
}
