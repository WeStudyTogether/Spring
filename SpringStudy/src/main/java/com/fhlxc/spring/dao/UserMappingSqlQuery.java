package com.fhlxc.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.object.MappingSqlQuery;

/**
* @author Xingchao Long
* @date 2020年2月1日 下午6:42:19
* @ClassName UserMappingSqlQuery.java
* @Description 类描述
*/

public class UserMappingSqlQuery extends MappingSqlQuery<User> {

    @Override
    protected User mapRow(ResultSet arg0, int arg1) throws SQLException {
        User user = new User();
        user.setId((Integer) arg0.getInt("id"));
        user.setName((String) arg0.getString("name"));
        user.setAge((Integer) arg0.getInt("age"));
        user.setMoney((Double) arg0.getDouble("money"));
        return user;
    }

}
