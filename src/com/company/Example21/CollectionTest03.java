package com.company.Example21;

import java.util.*;

public class CollectionTest03 {
    public static void main(String[] args) {
        Collection c = new ArrayList();

        Integer i1 = 8;
        c.add(i1);
        System.out.println(c.contains(i1));
        Integer i2 = 8;
        //contains方法底层调用的是equals
        System.out.println(c.contains(i2));

        Manager m1 = new Manager(100,"Jack");
        c.add(m1);
        System.out.println(c.contains(m1));
        Manager m2 = new Manager(100,"Jack");
        System.out.println(c.contains(m2));
    }
}
class Manager{
    int no;
    String name;
    Manager(int no , String name){
        this.no = no;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj instanceof Manager){
            Manager obj1 = (Manager)obj;
            if (this.name.equals(obj1.name) && this.no == obj1.no){
                return true;
            }
        }
        return false;
    }
}
