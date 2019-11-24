package com.company.Example29;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class ReflectTest04 {
    public static void main(String[] args) {
        Class c = CustomerService.class;

        Method[] ms = c.getDeclaredMethods();
        for (Method m : ms){
            System.out.println(Modifier.toString(m.getModifiers()));
            System.out.println(m.getReturnType().getSimpleName());
            System.out.println(m.getName());
            Class[] par = m.getParameterTypes();
            for (Class p : par){
                System.out.println(p.getSimpleName());
            }
        }
    }
}
