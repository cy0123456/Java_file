package com.company;

public class MethodTest1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int d = sum(a,b);
        System.out.println(d);
    }
    public static int sum(int a ,int b){
        int c;
        c = a + b;
        doSome();
        return c;
    }
    public static void doSome(){
        System.out.println("You are the bitch");
    }
}
