package com.company.Example21;

import java.util.*;

public class CollectionTest05 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(1);
        c.add(2);
        c.add(3);
        Iterator itr = c.iterator();
        while (itr.hasNext()){
/*            itr.next();
            itr.remove();*/
            Object element = itr.next();
            c.remove(element);
            itr = c.iterator();
        }
        System.out.println(c.size());
    }
}
