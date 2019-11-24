package com.company.Example14;

public class Car {
    //属性
    Engine e;//此为引擎
    //Constructor

    Car(Engine e) {
        this.e = e;
    }
    public void testEngine(){
        e.start();
    }
}
