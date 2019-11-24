package com.company.Example28;

import java.util.Date;
public class ReflectTest01 {
    public static void main(String[] args) throws Exception {
//        Employee e = new Employee();
//        Class c4 = e.getClass();
        Class c4 = Employee.class;
        System.out.println(c4);



        Class c1 = Date.class;
        Class c2 = Class.forName("java.util.Date");
        Date d = new Date();
        Class c3 = d.getClass();
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c1==c2);
        System.out.println(c1==c3);
        System.out.println(c2==c3);
    }
}
