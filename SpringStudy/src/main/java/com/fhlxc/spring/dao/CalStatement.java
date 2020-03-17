package com.fhlxc.spring.dao;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import com.mysql.cj.jdbc.Driver;

/**
* @author Xingchao Long
* @date 2020年1月29日 下午9:27:07
* @ClassName CalStatement
* @Description 类描述
*/

public class CalStatement {

    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        CallableStatement callstmt = null;
        ResultSet rs = null;
        try {
            DriverManager.registerDriver(new Driver());
            conn = DriverManager.getConnection("jdbc:mysql://" + InetAddress.getLocalHost().getHostAddress() + 
                    ":3306/daodemodb?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false", "root", "zxc123__");
            callstmt = conn.prepareCall("{call p_selectUserByAge(?, ?)}");
            callstmt.setInt(1, 25);
            callstmt.registerOutParameter(2, Types.INTEGER);
            rs = callstmt.executeQuery();
            while (rs.next()) {
                System.out.println("姓名：" +  rs.getString("name") + "    年龄：" + rs.getString("age") + "    余额：" + rs.getString("money"));
            }
            System.out.println("存储过程的返回值：" + callstmt.getInt(2));
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
            if (callstmt != null) {
                callstmt.close();
            }
            if (rs != null) {
                rs.close();
            }
        }
    }

}
