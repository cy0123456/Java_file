package com.company.Example29;

import java.lang.reflect.Field;

public class Reflect03 {
    public static void main(String[] args) throws Exception{
        Class c = User.class;
        Field idf = c.getDeclaredField("id");
        Object o = c.newInstance();
        idf.setAccessible(true);
        idf.set(o,"101");
        System.out.println(idf.get(o));

    }
}
