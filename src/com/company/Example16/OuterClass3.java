package com.company.Example16;

public class OuterClass3 {
    public void m1(){
        final int i = 10;

        class InnerClass3{
            public void m2(){
                System.out.println(i);
            }
        }


        InnerClass3 u = new InnerClass3();
        u.m2();
    }

    public static void main(String[] args) {
        OuterClass3 c = new OuterClass3();
        c.m1();

    }
}
