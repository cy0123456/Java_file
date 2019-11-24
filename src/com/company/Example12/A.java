package com.company.Example12;

public abstract class A {
    A(){
        System.out.println("A.....");
    }
    public abstract void m1();
    public static void main(String[] args) {
        A a = new B();

    }
}

class B extends A{

    B(){
        //此处省略了super()；
        System.out.println("B....");
    }
    public void m1(){

    }
}