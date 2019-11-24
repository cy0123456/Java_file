package com.company.Example30;
import java.sql.*;
import java.util.ResourceBundle;

public class JDBCTest07 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stat = null;
        try{
            ResourceBundle bundle = ResourceBundle.getBundle("com.company.Example30.jdbc");
            String driver = bundle.getString("driver");
            String url = bundle.getString("url");
            String user = bundle.getString("user");
            String password = bundle.getString("password");
            Class.forName(driver);
            conn = DriverManager.getConnection(url,user,password);
            stat = conn.createStatement();
            String sql = "insert into dept(deptno,dname,loc) values (40,'商店','北京')";
            int u = stat.executeUpdate(sql);
            System.out.println((u == 1)?"添加成功":"添加失败");
        }catch (SQLException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
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
