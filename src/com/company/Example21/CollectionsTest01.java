package com.company.Example21;

import java.util.*;

public class CollectionsTest01 {
    public static void main(String[] args) {
        List l = new ArrayList();
        Collections.synchronizedList(l);
        l.add(10);
        l.add(5);
        l.add(9);
        l.add(20);
        l.add(30);
//        for (int i = 0;i<l.size();i++){
//            System.out.println(l.get(i));
//        }
//        Iterator itr = l.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }
        Collections.sort(l);
        Iterator itr = l.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        Set s = new HashSet();
        s.add(1);
        s.add(5);
        s.add(2);
        s.add(10);
        s.add(9);
        List lists = new ArrayList(s);
        Collections.sort(lists);
        for (Object m : lists){
            System.out.println(m);
        }

    }
}
class Person{
    int age;

}