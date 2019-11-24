package com.company.Example28;

import java.util.Date;

public class ReflectTest03 {
    public static void main(String[] args) throws Exception {
        m1(1);
        m1(1,2,3,4);
        m1(1,2,3,4,5,6);
        m1(1,2,4);
        m2("体育","音乐","美食");
        m3(Date.class, Employee.class);
    }
    public static void m1(int ...a){
        System.out.println("Test");
    }
    public static void m1(int i ){
        System.out.println(i);
    }
    public static void m2(String ...args){
        for(int i = 0;i<args.length;i++){
            System.out.println(args[i]);
        }
    }
    public static void m3(Class...args) throws Exception{
        for (int i = 0;i<args.length;i++){
            Class c= args[i];
            System.out.println(c.newInstance());
        }
    }
}
