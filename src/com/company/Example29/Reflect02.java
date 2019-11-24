package com.company.Example29;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Reflect02 {
    public static void main(String[] args) {
        Class c = User.class;
        Field[] fs = c.getDeclaredFields();
        StringBuffer sb = new StringBuffer();
        sb.append(Modifier.toString(c.getModifiers()) + " class " + c.getSimpleName() + "(\n" );
        for (Field f :fs){
            sb.append("\t");
            sb.append(Modifier.toString(f.getModifiers()) + " ");
            sb.append(f.getType().getSimpleName() + " ");
            sb.append(f.getName() + ";\n");
        }
        sb.append(")");
        System.out.println(sb);
    }
}
