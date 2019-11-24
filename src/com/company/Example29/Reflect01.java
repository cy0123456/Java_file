package com.company.Example29;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Reflect01 {
    public static void main(String[] args) {
        Class c = User.class;
        Field[] fs = c.getDeclaredFields();
        for (Field f : fs){
            int i = f.getModifiers();
            String str = Modifier.toString(i);
            System.out.print(str + "\t");
            System.out.print(f.getType().getSimpleName() + "\t");
            System.out.print(f.getName());
            System.out.println();
        }

    }
}
