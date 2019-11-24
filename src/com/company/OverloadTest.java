package com.company;

public class OverloadTest {
    public static void main(String[] args) {
        U.prt(1);
        U.prt("you are the bitch");
        U.prt(1.0);
        U.prt(32659872);
    }
}
class U{
    public static void prt(byte b){
        System.out.println(b);
    }
    public static void prt(String b){
        System.out.println(b);
    }
    public static void prt(short b){
        System.out.println(b);
    }
    public static void prt(int b){
        System.out.println(b);
    }
    public static void prt(long b){
        System.out.println(b);
    }
    public static void prt(double b){
        System.out.println(b);

    }
    public static void prt(float b){
        System.out.println(b);
    }
}
