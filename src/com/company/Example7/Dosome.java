package com.company.Example7;

public class Dosome {
    public static void main(String[] args) {
        C c = new C();
        c.doSome();
    }
}
class A{
    public void doSome(){
        System.out.println("doSome");
    }
}
class B extends A{

}
class C extends B{

}
