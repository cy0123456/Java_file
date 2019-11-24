package com.company.Example30;
import java.sql.*;
public class JDBCTest03 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stat = null;
        try{
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bjpowernode","root","528924");
            stat = conn.createStatement();
            String sql = "insert into dept(deptno,dname,loc) values(40,'广电','北京')";
            int u = stat.executeUpdate(sql);
            System.out.println((u == 1)?"添加成功":"添加失败");
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            try{
                if(stat != null){
                    stat.close();
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
            try{
                if(conn != null){
                    conn.close();
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }
}
