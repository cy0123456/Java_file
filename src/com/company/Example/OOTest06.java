package com.company.Example;

public class OOTest06 {
    public static void main(String[] args) {
        Student User = new Student();  //此处为地址
        System.out.println(User);
        User.name = "小明";
        User.no = 201820984;
        /*User.com = new Compute();  //此处放的是实例变量的地址
        User.com.color = "绿色";
        User.com.pp = "联想";
        User.com.type = "GTX1060";
        User.com.pro = new Project();  //此处放的是地址  new出来后 变量存放的均为地址
        User.com.pro.game = "Wegame";
         */
        Compute diannao = new Compute();
        diannao.color = "绿色";
        diannao.pp = "联想";
        diannao.type = "GTX1060";
        diannao.pro = new Project();
        diannao.pro.game = "Weganme";
        //两种效果一样，一种是直接，另一种是简介

        User.com = diannao;
        System.out.println("姓名:" + User.name );
        System.out.println("学号:" + User.no );
        System.out.println("电脑颜色:" + User.com.color );
        System.out.println("品牌:" + User.com.pp );
        System.out.println("型号:" + User.com.type );
        System.out.println("游戏:" + User.com.pro.game);

        //此处定义一个新的电脑  重新买了个电脑
        System.out.println();
        User.com = new Compute();
        //当加入这个后 原来的diannao 将被当作垃圾进行回收 所以全为null
        System.out.println("姓名:" + User.name );
        System.out.println("学号:" + User.no );
        System.out.println("电脑颜色:" + User.com.color );
        System.out.println("品牌:" + User.com.pp );
        System.out.println("型号:" + User.com.type );
        //System.out.println("游戏:" + User.com.pro.game);
    }
}
