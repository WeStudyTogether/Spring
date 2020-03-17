package com.fhlxc.spring.mybatis;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.fhlxc.spring.dao.User;

/**
* @author Xingchao Long
* @date 2020年2月4日 下午5:37:37
* @ClassName BasicMybatisDemo
* @Description 
*/

public class BasicMybatisDemo {

    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        Reader reader = Resources.getResourceAsReader(resource);
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();
        String statement = "getUserList";
        List<User> users = session.selectList(statement);
        for (User u: users) {
            System.out.println(u.toString());
        }
    }

}
