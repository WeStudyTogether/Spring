package com.fhlxc.spring.beanfactorydemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
* @author Xingchao Long
* @date 2020/20/24 16:20:46
* @ClassName AnnontationInstanceTest
* @Description
*/

public class AnnontationInstanceTest {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        AnnontationInstance annontationInstance = (AnnontationInstance) applicationContext.getBean("annontationInstance");
        annontationInstance.breath();
    }

}
