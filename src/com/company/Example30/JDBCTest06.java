package com.company.Example30;
import java.sql.*;
public class JDBCTest06 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stat = null;
        try{
//            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode","root","528924");
            System.out.println(conn);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
