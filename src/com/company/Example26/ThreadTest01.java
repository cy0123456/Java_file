package com.company.Example26;

public class ThreadTest01 {
    public static void main(String[] args) {
        m1();
    }
    public static void m1(){
        m2();
    }

    private static void m2() {
        m3();
    }

    private static void m3() {
        System.out.println("-----------");
    }

}
