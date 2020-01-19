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
            System.out.println("--------getDeclaredFields--------");
            java.lang.reflect.Field[] fields = clazz.getDeclaredFields();
            for (java.lang.reflect.Field field: fields) {
                System.out.print(field.getName() + " ");
            }
            System.out.println();
            System.out.println("--------getFields--------");
            fields = clazz.getFields();
            for (java.lang.reflect.Field field: fields) {
                System.out.print(field.getName() + " ");
            }
            System.out.println();
            
            System.out.println("--------getDeclaredField--------");
            java.lang.reflect.Field field = clazz.getDeclaredField("studentId");
            field.setAccessible(true);
            System.out.println(field.getName());
            
            System.out.println("--------getField--------");
            
            field = clazz.getField("studentId");
            System.out.println(field.getName());
            
            System.out.println("---------------");
            clazz = Class.forName("com.fhlxc.reflection.Person");
            Person person = new Person("CYW");
            field = clazz.getDeclaredField("name");
            field.setAccessible(true);
            Object val = field.get(person);
            System.out.println(val);
            field.set(person, "ivan");
            System.out.println(person.getName());
        } catch (ClassNotFoundException | NoSuchFieldException | SecurityException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

}
