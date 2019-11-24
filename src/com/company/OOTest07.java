package com.company;

public class OOTest07 {
    public static void main(String[] args) {
        Student User = new Student();  //此处为地址
        System.out.println(User);
        User.name = "小明";
        User.no = 201820984;
        User.com = new Compute();  //此处放的是实例变量的地址
        User.com.color = "绿色";
        User.com.pp = "联想";
        User.com.type = "GTX1060";
        System.out.println("姓名:" + User.name );
        System.out.println("学号:" + User.no );
        System.out.println("电脑颜色:" + User.com.color );
        System.out.println("品牌:" + User.com.pp );
        System.out.println("型号:" + User.com.type );
    }
}
class Compute{
    String pp;
    //品牌
    String type;
    //类型
    String color;
    //颜色
}
class Student{
    int no;
    //学号   此为实例变量（未加static）  不创建对象则不存在
    String name;
    //姓名
    Compute com;
    //拥有电脑
}
