package com.fhlxc.spring.beanfactorydemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
* @author Xingchao Long
* @date 2020/27/23 20:27:09
* @ClassName UserBeanTest
* @Description
*/

public class UserBeanTest {

    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BeanFactory factory = context;
        UserBean user = (UserBean) factory.getBean("user");
        user.destroy();
    }

}
