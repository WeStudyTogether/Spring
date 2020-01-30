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
* @date 2020年1月30日 下午4:56:01
* @ClassName Commit
* @Description
*/

public class Commit {

    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement prestmt = null;
        
        try {
            DriverManager.registerDriver(new Driver());
            conn = DriverManager.getConnection("jdbc:mysql://" + InetAddress.getLocalHost().getHostAddress() + 
                    ":3306/daodemodb?useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC&useSSL=false", "root", "zxc123__");
            conn.setAutoCommit(false);
            String sql = "update t_user set money = money - ? where id = ?";
            prestmt = conn.prepareStatement(sql);
            prestmt.setDouble(1, 111.11);
            prestmt.setInt(2, 2);
            prestmt.addBatch();
            prestmt.setDouble(1, -111.11);
            prestmt.setInt(2, 1);
            prestmt.addBatch();
            prestmt.executeBatch();
            conn.commit();
        } catch (SQLException e) {
            conn.rollback();
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
