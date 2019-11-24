package com.company.Example30;

import java.io.FileReader;
import java.util.Properties;
import java.util.ResourceBundle;

public class User {
    public static void main(String[] args) throws Exception{
//        Properties p = new Properties();
//        FileReader re = new FileReader("F:\\Java_file\\src\\com\\company\\Example30\\jdbc.properties");
//        p.load(re);
//        re.close();
//        String classname = p.getProperty("className");
//        Class c = Class.forName("com.company.Example30." + classname);
//        JDBC jdbc = (JDBC) c.newInstance();
//        jdbc.getConnection();
        ResourceBundle bundle = ResourceBundle.getBundle("com.company.Example30.jdbc");
        String name = bundle.getString("className");
        Class c = Class.forName("com.company.Example30." + name);
        JDBC jdbc = (JDBC) c.newInstance();
        jdbc.getConnection();
    }
}
