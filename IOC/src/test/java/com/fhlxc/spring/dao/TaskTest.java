package com.fhlxc.spring.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
* @author Xingchao Long
* @date 2020年2月3日 上午11:05:17
* @ClassName TaskTest
* @Description
*/

public class TaskTest {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springDAODemo.xml");
        IUserDAO userDAO = (IUserDAO) context.getBean("userDaoProxy");
        System.out.println(userDAO.transfer(1, 2, 100));
    }

}
