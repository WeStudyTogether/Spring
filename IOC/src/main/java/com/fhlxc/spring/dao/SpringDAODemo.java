package com.fhlxc.spring.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
* @author Xingchao Long
* @date 2020年1月30日 下午5:30:02
* @ClassName SpringDAODemo
* @Description 类描述
*/

public class SpringDAODemo extends JdbcDaoSupport implements IUserDAO {

    @Override
    public List<User> queryAllUser() {
        String sql = "select id, name, age, money from t_user order by id desc";
        List<Map<String, Object>> list = getJdbcTemplate().queryForList(sql);
        List<User> users = new ArrayList<>();
        
        for (Map<String, Object> row: list) {
            User user = new User();
            user.setId((Integer) row.get("id"));
            user.setName((String) row.get("name"));
            user.setAge((int) row.get("age"));
            user.setMoney(Double.parseDouble(row.get("money").toString()));
            users.add(user);
        }
        return users;
    }
    
    @Override
    public List<User> queryAll() {
        String sql ="select id, name, age, money from t_user where ?";
        UserMappingSqlQuery userMappingSqlQuery = new UserMappingSqlQuery();
        userMappingSqlQuery.setDataSource(getDataSource());
        userMappingSqlQuery.setSql(sql);
        userMappingSqlQuery.setParameters(new SqlParameter(java.sql.Types.VARCHAR));
        userMappingSqlQuery.compile();
        return userMappingSqlQuery.execute(new Object[] {new String("1 = 1")});
    }

    @Override
    public Boolean addUser(User user) {
        String sql = "insert into t_user (name, age, money) values (?, ?, ?)";
        int row = getJdbcTemplate().update(sql, new Object[] {user.getName(), user.getAge(), user.getMoney()});
        if (row > 0) {
            System.out.println("数据新增成功！");
            return true;
        }
        return false;
    }

    private Boolean outInMoney(int toUserId, float money) {
        String sql = "update t_user set money = money + ? where id = ?";
        int row = getJdbcTemplate().update(sql, new Object[] {money, toUserId});
        if (row > 0) {
            return true;
        }
        return false;
    }
    
    @Override
    public Boolean transfer(int fromUserId, int toUserId, float transferMoney) {
        Boolean out = outInMoney(fromUserId, -transferMoney);
        Boolean in = outInMoney(toUserId, transferMoney);
        return out && in;
    }

}
