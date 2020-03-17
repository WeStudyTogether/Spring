package com.fhlxc.spring.dao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
* @author Xingchao Long
* @date 2020年1月30日 下午5:30:36
* @ClassName SpringDAODemoTest
* @Description
*/

public class SpringDAODemoTest {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springDAODemo.xml");
        IUserDAO userDAO = (IUserDAO) context.getBean("userDao");
        User user = new User("JdbcDaoSupportTest", 26, 333.33);
        userDAO.addUser(user);
        List<User> list = userDAO.queryAllUser();
        for (User u: list) {
            System.out.println(u.toString());
        }
        list = userDAO.queryAll();
        for (User u: list) {
            System.out.println(u.toString());
        }
    }

}
