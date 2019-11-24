package com.company.Example21;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest04 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        Integer i1 = 10;
        c.add(i1);
        Integer i2 = 10;
        c.remove(i2);
        System.out.println(c.size());
        Manager m1 = new Manager(18,"smith");
        c.add(m1);
        Manager m2 = new Manager(18,"smith");
        c.remove(m2);
        System.out.println(c.size());
    }
}
