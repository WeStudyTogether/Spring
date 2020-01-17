package com.fhlxc.reflection;

import java.lang.reflect.InvocationTargetException;

/**
* @author Xingchao Long
* @date 2020/20/17 17:20:38
* @ClassName Method
* @Description 类描述
*/

public class Method {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        try {
            @SuppressWarnings("rawtypes")
            Class clazz = Class.forName("com.fhlxc.reflection.Student");
            java.lang.reflect.Method method = null;
            java.lang.reflect.Method[] methods = null;
            
            methods = clazz.getMethods();
            for (java.lang.reflect.Method mth: methods) {
                System.out.print(mth.getName() + " ");
            }
            System.out.println();
            
            method = clazz.getMethod("studentPublicMethod", String.class);
            System.out.println(method.getName() + "");
            System.out.println();
            
            methods = clazz.getDeclaredMethods();
            for (java.lang.reflect.Method mth: methods) {
                System.out.print(mth.getName() + " ");
            }
            System.out.println();
            
            method = clazz.getDeclaredMethod("studentPrivateMethod", String.class);
            System.out.println(method.getName() + "");
            System.out.println();
            
            Object obje = clazz.getDeclaredConstructor().newInstance();
            method.setAccessible(true);
            String result = (String) method.invoke(obje, "inputParams");
            System.out.println(result);
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
        };
    }

}
