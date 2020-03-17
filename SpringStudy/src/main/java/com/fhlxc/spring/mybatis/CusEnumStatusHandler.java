package com.fhlxc.spring.mybatis;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

/**
* @author Xingchao Long
* @date 2020年2月6日 下午5:21:15
* @ClassName CusEnumStatusHandler
* @Description
*/

public class CusEnumStatusHandler extends BaseTypeHandler<UserStatus> {

    @Override
    public UserStatus getNullableResult(ResultSet arg0, String arg1) throws SQLException {
        if (arg0.getString(arg1).equals("AVAILABLE")) {
            return UserStatus.AVAILABLE;
        }
        return UserStatus.DISABLED;
    }

    @Override
    public UserStatus getNullableResult(ResultSet arg0, int arg1) throws SQLException {
        
        return UserStatus.fromValue(arg0.getInt(arg1));
    }

    @Override
    public UserStatus getNullableResult(CallableStatement arg0, int arg1) throws SQLException {
        return UserStatus.fromValue(arg0.getInt(arg1));
    }

    @Override
    public void setNonNullParameter(PreparedStatement arg0, int arg1, UserStatus arg2, JdbcType arg3) throws SQLException {
        arg0.setInt(arg1, arg2.getStatus());
    }

}
