package com.company.Example29;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class Reflect05 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c = Class.forName("java.lang.String");
        Constructor[] cs = c.getConstructors();
        for (Constructor con:cs){
//            获取修饰符
            System.out.println(Modifier.toString(con.getModifiers()));
//            获取构造方法名
            System.out.println(c.getName());
//            获取形参
            Class[] pr = con.getParameterTypes();
            for (Class u : pr){
                System.out.println(u.getSimpleName());
            }
        }
    }
}
