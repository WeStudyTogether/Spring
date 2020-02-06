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
* @date 2020年2月6日 下午4:57:58
* @ClassName EnumTest
* @Description 
*/

public class EnumTest {

    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        Reader reader = Resources.getResourceAsReader(resource);
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();
        String statement = "UserMapper.addUser";
        User user = new User("usermode2", 2222.22, UserStatus.AVAILABLE);
        session.insert(statement, user);
        session.commit();
        System.out.println(user.getId());
        statement = "UserMapper.getUser";
        user = session.selectOne(statement, user.getId());
        System.out.println(user.toString());
    }

}
