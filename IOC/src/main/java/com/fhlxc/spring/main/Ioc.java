package com.fhlxc.spring.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fhlxc.spring.ioc.Person;

/**
* @author Xingchao Long
* @date 2020/58/20 15:58:22
* @ClassName Ioc
* @Description
*/

public class Ioc {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        BeanFactory factory = context;
        Person person = (Person) factory.getBean("person");
        person.Breath();
    }

}
