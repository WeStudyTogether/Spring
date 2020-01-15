package com.fhlxc.cus_annotation;

/**
* @author Xingchao Long
* @date 2020/30/15 19:30:29
* @ClassName Person.java
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
}
