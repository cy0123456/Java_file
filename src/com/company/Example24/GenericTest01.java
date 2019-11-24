package com.company.Example24;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericTest01 {
    public static void main(String[] args) {
        List<String> strs = new ArrayList<String>();
        strs.add("Jack");
        strs.add("Cook");
        strs.add("King");
        strs.add("Smith");
        Iterator<String> itr = strs.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
