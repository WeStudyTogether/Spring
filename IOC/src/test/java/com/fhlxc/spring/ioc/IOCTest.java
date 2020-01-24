package com.fhlxc.spring.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
* @author Xingchao Long
* @date 2020/56/24 14:56:26
* @ClassName IOCTest
* @Description
*/

public class IOCTest {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        BeanFactory factory = context;
        Person person = (Person) factory.getBean("person");
        person.Breath();
    }

}
