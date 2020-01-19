package com.fhlxc.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.fhlxc.cus_annotation.CustomDescription;
import com.fhlxc.cus_annotation.CustomDescriptions;

/**
* @author Xingchao Long
* @date 2020/39/19 16:39:03
* @ClassName ReflectConstructor
* @Description 类描述
*/

public class ReflectConstructor {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        String className = "com.fhlxc.reflection.Student";
        try {
            Class<Student> clazz = (Class<Student>) Class.forName(className);
            Constructor<Person>[] constructors = (Constructor<Person>[]) Class.forName(className).getConstructors();
            for (Constructor<Person> constructor: constructors) {
                System.out.println("getConstructors: " + constructor);
            }
            Constructor<Student>[] constructors2 = (Constructor<Student>[]) Class.forName(className).getDeclaredConstructors();
            for (Constructor<Student> constructor: constructors2) {
                System.out.println("getConstructors: " + constructor);
            }
            
            Constructor<Student> constructor = clazz.getConstructor(String.class, String.class);
            System.out.println("getConstructor: " + constructor);
            Student obj = constructor.newInstance("cyw", "123456");
            System.out.println(obj.getName());
            
            constructor = clazz.getDeclaredConstructor(String.class);
            System.out.println("getDeclaredConstructor: " + constructor);
            constructor.setAccessible(true);
            obj = constructor.newInstance("cyw");
            System.out.println(obj.getName());
            
            CustomDescriptions customDescriptions = (CustomDescriptions) clazz.getAnnotation(CustomDescriptions.class);
            for (CustomDescription h: customDescriptions.value()) {
                System.out.println("description: " + h.description());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

}
