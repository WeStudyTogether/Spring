package com.fhlxc.spring.mybatis;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.fhlxc.spring.dao.User;

/**
* @author Xingchao Long
* @date 2020年2月11日 下午8:48:05
* @ClassName ResultMapTest
* @Description
*/

public class ResultMapTest {

    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        Reader reader = Resources.getResourceAsReader(resource);
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();
        String statement = "UserMapper.getUser1";
        User user = session.selectOne(statement, 1);
        System.out.println(user.toString());
    }

}
