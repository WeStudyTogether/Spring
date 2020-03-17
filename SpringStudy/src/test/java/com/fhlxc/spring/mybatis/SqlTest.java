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
* @date 2020年2月8日 下午3:46:10
* @ClassName SqlTest
* @Description 
*/

public class SqlTest {

    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        Reader reader = Resources.getResourceAsReader(resource);
        SqlSessionFactory factory = (SqlSessionFactory) new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = factory.openSession();
        String statement = "getUserList2";
        List<User> users = session.selectList(statement);
        for (User user: users) {
            System.out.println(user.toString());
        }
    }

}
