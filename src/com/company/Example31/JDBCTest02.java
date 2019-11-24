package com.company.Example31;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JDBCTest02 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            String loginName = "zhangsan";
            String loginPwd = "234";
            String realName = "王麻子";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode","root","528924");
            String sql = "insert into t_user(loginName,loginPwd,realName) values(?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1,loginName);
            ps.setString(2,loginPwd);
            ps.setString(3,realName);
            ps.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if (ps != null){
                    ps.close();
                }
            }catch (SQLException e){
                e.printStackTrace();
            }
            try {
                if (conn != null){
                    conn.close();
                }
            }catch (SQLException e){
                e.printStackTrace();
            }

        }
    }
}

