package com.fhlxc.spring.dao;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

/**
* @author Xingchao Long
* @date 2020年1月30日 下午4:30:27
* @ClassName BatchTry1
* @Description
*/

public class BatchTry1 {

    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement prestmt = null;
        
        try {
            DriverManager.registerDriver(new Driver());
            conn = DriverManager.getConnection("jdbc:mysql://" + InetAddress.getLocalHost().getHostAddress() + 
                    ":3306/daodemodb?useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC&useSSL=false", "root", "zxc123__");
            String sql = "insert into t_user (name, age, money) values (?, ?, ?)";
            prestmt = conn.prepareStatement(sql);
            for (int i = 0; i < 2; i++) {
                prestmt.setString(1, "PreparedStatementTest" + i);
                prestmt.setInt(2, 25 + i);
                prestmt.setDouble(3, 222.22);
                prestmt.addBatch();
            }
            int[] result = prestmt.executeBatch();
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
            if (prestmt != null) {
                prestmt.close();
            }
            if (rs != null) {
                rs.close();
            }
        }
    }

}
