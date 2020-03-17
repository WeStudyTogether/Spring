package com.fhlxc.spring.mybatis;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.fhlxc.spring.dao.User;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
* @author Xingchao Long
* @date 2020年2月16日 下午5:38:00
* @ClassName PageTest
* @Description 
*/

public class PageTest {

    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        Reader config = Resources.getResourceAsReader(resource);
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(config);
        SqlSession session = sessionFactory.openSession();
        String statement = "UserMapper.getUserList";
        PageHelper.startPage(1, 5, true);
        List<User> users = session.selectList(statement);
        PageInfo<User> pageInfo = new PageInfo<User>(users);
        System.out.println("数据总数：" + pageInfo.getTotal());
        System.out.println("数据总页数：" + pageInfo.getPages());
        for (User u: users) {
            System.out.println(u.toString());
        }
    }

}
