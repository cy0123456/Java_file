package com.company;

public class MethodTest {
    public static void main(String[] args) {
        test.sumInt(6, 10);
        test.sumInt(11, 36);
        dother();
    }
    public static void dother(){
        System.out.println("You are the bitch");
    }
}
class test{
    public static void sumInt(int a , int b){
        int c;
        c = a + b;
        System.out.println( a + "+" + b + "=" + c);
    }
}

