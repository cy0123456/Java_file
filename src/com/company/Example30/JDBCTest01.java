package com.company.Example30;


import java.sql.*;

public class JDBCTest01 {
    public static void main(String[] args){
        Statement stat = null;
        Connection conn = null;
        try{
//          1、注册驱动
            Driver driver = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(driver);
//          2、建立连接
            String url = "jdbc:mysql://localhost:3306/bjpowernode";
            String user = "root";
            String password = "528924";
            conn = DriverManager.getConnection(url,user,password);
//          3、获取数据库操作对象
            stat = conn.createStatement();
//          4、执行sql语句
            String sql = "insert into dept(deptno,dname,loc) values (50,'人事部','北京')";
            stat.executeUpdate(sql);
//          5、处理查询结果
        }catch(Exception e){
            e.printStackTrace();
        }finally{
//          6、释放资源
            try{
                if(stat != null){
                    stat.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
            try{
                if(conn != null){
                    conn.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}
