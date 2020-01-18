package com.fhlxc.reflection;

/**
* @author Xingchao Long
* @date 2020/16/18 20:16:38
* @ClassName Field
* @Description 类描述
*/

public class Field {

    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("com.fhlxc.reflection.Student");
            java.lang.reflect.Field[] fields = clazz.getDeclaredFields();
            for (java.lang.reflect.Field field: fields) {
                System.out.print(field.getName() + " ");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
