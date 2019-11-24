package com.company.Example30;
import java.sql.*;
public class JDBCTest02 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stat = null;
        try{
            Driver driver = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(driver);
            String url = "jdbc:mysql://localhost:3306/bjpowernode";
            String user = "root";
            String password = "528924";
            conn = DriverManager.getConnection(url,user,password);
            stat = conn.createStatement();
            String sql = "update dept set dname = '销售部', loc = '天津' where deptno = 20";
            int u = stat.executeUpdate(sql);
            System.out.println((u == 1)?"删除成功":"删除失败");
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
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
