package com.company.Example31;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 实现登陆功能
 */
public class JDBCTest01 {
    public static void main(String[] args) {
        //初始化一个界面
        Map<String,String> userLoginInfo = initUI();
        //验证用户名和密码
        boolean loginSuccess = login(userLoginInfo);
        System.out.println(loginSuccess ? "登陆成功":"登陆失败");
    }

    /**
     * 初始化用户界面
     * @param userLoginInfo 用户登陆信息
     * @return 用户名输入的用户名和密码等登陆信息
     */
    private static boolean login(Map<String, String> userLoginInfo) {
//      JDBC代码
        boolean loginSuccess = false;
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode","root","528924");
            stmt = conn.createStatement();
            String sql = "select * from t_user where loginName = '" + userLoginInfo.get("loginName")
                    +  "'" +  "and loginPwd = '" + userLoginInfo.get("loginPwd") + "'";
            rs = stmt.executeQuery(sql);
            if (rs.next()){
                loginSuccess = true;
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
                if (stmt != null){
                    stmt.close();
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
        return loginSuccess;
    }
    private static Map<String,String> initUI() {
        Scanner s = new Scanner(System.in);
        System.out.print("用户名：");
        String loginName = s.nextLine();
        System.out.print("密码:");
        String loginPwd = s.nextLine();
        Map<String,String> userLoginInto = new HashMap<>();
        userLoginInto.put("loginName",loginName);
        userLoginInto.put("loginPwd",loginPwd);
        return userLoginInto;
    }
}
