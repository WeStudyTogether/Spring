package com.fhlxc.spring.dao;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

/**
* @author Xingchao Long
* @date 2020年1月29日 下午5:39:42
* @ClassName PreStatement
* @Description 
*/

public class PreStatement {

    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        PreparedStatement prestmt = null;
        ResultSet rs = null;
        try {
            DriverManager.registerDriver(new Driver());
            conn = DriverManager.getConnection("jdbc:mysql://" + InetAddress.getLocalHost().getHostAddress() + 
                    ":3306/daodemodb?useUnicode=true&charecterEncoding=utf-8&serverTimezone=UTC&useSSL=false", "root", "zxc123__");
            String sql = "insert into t_user (name, age, money) values (?, ?, ?)";
            prestmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            prestmt.setString(1, "小wu");
            prestmt.setInt(2, 25);
            prestmt.setDouble(3, 222.22);
            int result = prestmt.executeUpdate();
            if (result > 0) {
                System.out.println("新增成功");
                rs = prestmt.getGeneratedKeys();
                while (rs.next()) {
                    System.out.println("生成的主键ID为：" + rs.getInt(1));
                }
            }
        } catch (SQLException | UnknownHostException e) {
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
