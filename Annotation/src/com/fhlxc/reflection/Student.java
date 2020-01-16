package com.fhlxc.reflection;

import com.fhlxc.cus_annotation.CustomDescription;

/**
* @author Xingchao Long
* @date 2020/51/16 22:51:30
* @ClassName Student
* @Description 类描述
*/

@CustomDescription(description = "学生")
@CustomDescription(description = "人")
public class Student extends Person {
    public String studentId;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    
    public String studentPublicMethod(String str) {
        return str;
    }
    
    @SuppressWarnings("unused")
    private String studentPrivateMethod(String str) {
        return str;
    }
    
    public Student() {
    }
    
    public Student(String name, String studentId) {
        super(name);
        this.studentId = studentId;
    }
    
    public Student(String name) {
        super(name);
        this.studentId = "123456";
    }
}
