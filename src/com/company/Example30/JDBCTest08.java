package com.company.Example30;
import java.sql.*;
import java.util.*;

public class JDBCTest08 {
    public static void main(String[] args) {
        Connection conn  = null;
        Statement stat = null;
        ResultSet rs = null;
        try {
            ResourceBundle bundle = ResourceBundle.getBundle("com.company.Example30.jdbc");
            String driver = bundle.getString("driver");
            String url = bundle.getString("url");
            String user = bundle.getString("user");
            String password = bundle.getString("password");
            Class.forName(driver);
            conn = DriverManager.getConnection(url,user,password);
            stat = conn.createStatement();
            String sql = "select empno,ename,sal from emp";
            rs = stat.executeQuery(sql);
            while (rs.next()){
                String empno = rs.getString("empno");
                String ename = rs.getString("ename");
                String sal = rs.getString("sal");
                System.out.println(empno + "," + ename + "," + sal);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if (rs != null){
                    rs.close();
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
            try {
                if (stat != null){
                    stat.close();
                }
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
