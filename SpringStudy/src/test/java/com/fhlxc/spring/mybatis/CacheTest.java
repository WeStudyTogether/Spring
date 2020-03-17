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
* @date 2020年2月13日 下午4:02:32
* @ClassName CacheTest
* @Description 
*/

public class CacheTest {

    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        Reader reader = Resources.getResourceAsReader(resource);
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();
        String statement = "UserMapper.getUser";
        User user = session.selectOne(statement, 1);
        user = session.selectOne(statement, 1);
        System.out.println(user.toString());
        session.commit();
        SqlSession session2 = sessionFactory.openSession();
        user = session2.selectOne(statement, 1);
        System.out.println(user.toString());
        session2.commit();
    }

}
