package com.fhlxc.spring.dao;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

/**
* @author Xingchao Long
* @date 2020年1月30日 下午4:12:37
* @ClassName BatchTry
* @Description
*/

public class BatchTry {

    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        ResultSet rs = null;
        Statement stmt = null;
        
        try {
            DriverManager.registerDriver(new Driver());
            conn = DriverManager.getConnection("jdbc:mysql://" + InetAddress.getLocalHost().getHostAddress() + 
                    ":3306/daodemodb?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false", "root", "zxc123__");
            stmt = conn.createStatement();
            for (int i = 0; i < 2; i++) {
                String sql = "insert into t_user (name, age, money) values ('StatementTest" + i + "'," + 25 + i + ",222.2)";
                stmt.addBatch(sql);
            }
            int[] result = stmt.executeBatch();
            System.out.println("影响的行数分别为：");
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (rs != null) {
                rs.close();
            }
        }
    }

}
