package com.company.Example14;

public class Test {
    public static void main(String[] args){
        //1.生产引擎
        Engine c = new YAMAHA(); //多态
        Car m = new Car(c);  //面向对象，生产汽车对象m
        m.testEngine();  //汽车测试

        m.e = new HONGDA();
        m.testEngine();

    }
}
