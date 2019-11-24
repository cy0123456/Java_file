package com.company.Example24;

public class GenericTest04 {
    public static void main(String[] args) {
        Myclass<String> mc = new Myclass<String>();
        mc.m1("SSSS");
    }
}
class Myclass<T>{
    public void m1(T t){
        System.out.println(t);
    }
}