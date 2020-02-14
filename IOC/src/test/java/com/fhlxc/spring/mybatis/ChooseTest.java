package com.fhlxc.spring.mybatis;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
* @author Xingchao Long
* @date 2020年2月14日 下午5:33:25
* @ClassName ChooseTest
* @Description 
*/

public class ChooseTest {

    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        Reader reader = Resources.getResourceAsReader(resource);
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();
        
        String statement = "UserMapper.findcard";
        Map<String, Object> parameter = new HashMap<String, Object>();
        
        parameter.put("value", "成");
        parameter.put("type", "city");
        
        Card card = session.selectOne(statement, parameter);
        
        System.out.println(card.toString());
        
        statement = "UserMapper.updatecard";
        
        parameter.put("cardNo", "21");
        parameter.put("city", "武汉");
        parameter.put("id", 2);
        
        
        session.update(statement, parameter);
        session.commit();
        session.close();
    }

}
