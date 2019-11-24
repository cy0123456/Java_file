package com.company.Example30;
import java.sql.*;
public class JDBCTest04 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stat = null;
        try{
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bjpowernode","root","528924");
            stat = conn.createStatement();
            String sql = "delete from dept where deptno = 40";
            int u = stat.executeUpdate(sql);

        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            try {
                if(stat != null){
                    stat.close();
                }
            }catch (SQLException e){
                e.printStackTrace();
            }
            try {
                if(conn != null){
                    conn.close();
                }
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
