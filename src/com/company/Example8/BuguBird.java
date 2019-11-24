package com.company.Example8;

public class BuguBird extends Bird{
    @Override
    public void move() {
        System.out.println("鹦鹉飞不起来");
    }

    public void fly(){
        System.out.println("布谷鸟在飞");
    }

    //此处覆盖的是Bird的方法  子类永远继承的是父类的东西，覆盖也是  只能直接继承一个 可间接继承多个
}
