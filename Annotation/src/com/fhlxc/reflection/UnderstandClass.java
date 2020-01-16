package com.fhlxc.reflection;

/**
* @author Xingchao Long
* @date 2020/58/15 19:58:48
* @ClassName UnderstandClass
* @Description 类描述
*/

public class UnderstandClass {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws ClassNotFoundException {
        Class<String> clazz = null;
        clazz = String.class;
        System.out.println(clazz);
        clazz = (Class<String>) "ReflectionTest".getClass();
        System.out.println(clazz);
        clazz = (Class<String>) Class.forName("java.lang.String");
        System.out.println(clazz);
    }

}
