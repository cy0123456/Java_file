package com.company.Example29;

import java.lang.reflect.Method;

public class Reflec05 {
    public static void main(String[] args) throws Exception{
        Class c = CustomerService.class;
        Method m = c.getDeclaredMethod("login",String.class,String.class);
        Object o = c.newInstance();
        Object retValue = m.invoke(o,"admin","123");
        System.out.println(retValue);

    }
}
