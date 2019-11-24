package com.company.Example21;

import java.util.*;

public class CollectionTest06 {
    public static void main(String[] args) {
        List c = new LinkedList();
//        List c = new ArrayList();
        c.add(11);
        c.add(12);
        c.add(250);
        c.add(1,130);
//        for (Object u : c){
//            System.out.println(u);
//        }
        for (int i = 0;i<c.size();i++){
            System.out.println(c.get(i));
        }

        Iterator u = c.iterator();
        while (u.hasNext()){
            System.out.println(u.next());
        }
    }
}
