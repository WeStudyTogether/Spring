package com.fhlxc.spring.dao;

import javax.management.ConstructorParameters;
import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.SqlUpdate;
import org.springframework.stereotype.Component;

/**
* @author Xingchao Long
* @date 2020年2月2日 下午4:37:05
* @ClassName UserSqlUpdate
* @Description 
*/

@Component("userSqlUpdate")
public class UserSqlUpdate extends SqlUpdate {
    @ConstructorParameters("dataSource")
    public UserSqlUpdate(DataSource ds) {
        setDataSource(ds);
        setSql("update t_user set money = ? where name = ?");
        declareParameter(new SqlParameter(java.sql.Types.DOUBLE));
        declareParameter(new SqlParameter(java.sql.Types.VARBINARY));
        compile();
    }
    
    public Boolean updateUserMoney(String name, double money) {
        int row = update(new Object[] {money, name});
        if (row > 0) {
            System.out.println("数据修改成功！");
            return true;
        }
        return false;
    }
}
