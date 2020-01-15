package com.fhlxc.cus_annotation;

/**
* @author Xingchao Long
* @date 2020/39/15 19:39:20
* @ClassName Student
* @Description 类描述
*/

@CustomDescription(description = "学生")
@CustomDescription(description = "人")
public class Student extends Person {
    private String studentId;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    
    public static void main(String ... args) {
        CustomDescriptions customDescriptions = new Student().getClass().getAnnotation(CustomDescriptions.class);
        for (CustomDescription customDescription: customDescriptions.value()) {
            System.out.println("description: " + customDescription.description());
        }
    }
}
