package com.fhlxc.spring.mybatis;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.fhlxc.spring.dao.User;

/**
* @author Xingchao Long
* @date 2020年2月13日 下午4:56:40
* @ClassName IfTest
* @Description
*/

public class IfTest {

    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        Reader reader = Resources.getResourceAsReader(resource);
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();
        
        String statement = "UserMapper.finduserbylikename1";
        List<User> users = session.selectList(statement, "%J%");
        System.out.println(users.size());
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).toString());
        }
        
        statement = "UserMapper.finduserbylikename2";
        Map<String, Object> map = new HashMap<>();
        map.put("name", "J");
        users = session.selectList(statement, map);
        System.out.println(users.size());
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).toString());
        }
    }

}
