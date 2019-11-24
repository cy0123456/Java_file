package com.company.Example22;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {

        Set s = new HashSet();
        s.add(1);
        s.add(1);

        s.add(12);
        s.add(88);
        s.add(85);
        Iterator itr = s.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
