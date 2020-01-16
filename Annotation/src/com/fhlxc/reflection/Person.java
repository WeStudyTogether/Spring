package com.fhlxc.reflection;

import com.fhlxc.cus_annotation.CustomDescription;

/**
* @author Xingchao Long
* @date 2020/44/16 22:44:11
* @ClassName Person
* @Description 类描述
*/

@CustomDescription(description = "基类")
@CustomDescription(description = "人")
public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String personPublicMethod(String str) {
        return str;
    }
    
    public Person(String name) {
        this.name = name;
    }
    
    @SuppressWarnings("unused")
    private String personPrivateMethod(String str) {
        return str;
    }
    
    public Person() {
        super();
    }
}
