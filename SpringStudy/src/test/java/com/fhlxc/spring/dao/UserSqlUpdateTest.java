package com.fhlxc.spring.dao;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.object.SqlFunction;

/**
* @author Xingchao Long
* @date 2020年2月2日 下午4:50:28
* @ClassName UserSqlUpdateTest
* @Description 类描述
*/

public class UserSqlUpdateTest {

    @SuppressWarnings({ "resource", "rawtypes" })
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springDAODemo.xml");
        UserSqlUpdate update = (UserSqlUpdate) context.getBean("userSqlUpdate");
        update.updateUserMoney("小李", 666.66);
        BasicDataSource dataSource = (BasicDataSource) context.getBean("dataSource");
        SqlFunction sf = new SqlFunction(dataSource, "select count(1) from t_user;");
        sf.compile();
        int count = sf.run();
        System.out.println("User Count: " + count);
    }

}
