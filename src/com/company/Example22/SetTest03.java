package com.company.Example22;

import java.text.*;
import java.util.*;
/**
 * treeSet是无序不可重复的
 * */
public class SetTest03 {
    public static void main(String[] args) throws ParseException {
        SortedSet ss = new TreeSet();
        ss.add(10);
        ss.add(15);
        ss.add(5);
        ss.add(25);
        ss.add(12);
        ss.add(11);
        ss.add(12);
        Iterator itr = ss.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        SortedSet s1 = new TreeSet();
        s1.add("Jack");
        s1.add("Love");
        s1.add("Cook");
        s1.add("Lucy");
        s1.add("King");
        Iterator itr1 = s1.iterator();
        while (itr1.hasNext()){
            System.out.println(itr1.next());
        }

        SortedSet s2 = new TreeSet();
        String t1 = "2008-08-08";
        String t6 = "2008-08-09";
        String t2 = "2009-08-08";
        String t3 = "2010-08-08";
        String t4 = "2011-08-08";
        String t5 = "2012-08-08";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date time1 = sdf.parse(t1);
        Date time2 = sdf.parse(t2);
        Date time3 = sdf.parse(t3);
        Date time4 = sdf.parse(t4);
        Date time5 = sdf.parse(t5);
        Date time6 = sdf.parse(t6);
        s2.add(time1);
        s2.add(time2);
        s2.add(time3);
        s2.add(time4);
        s2.add(time5);
        s2.add(time6);
        for (Object c : s2){
            if (c instanceof Date){
                Date cc = (Date) c;
                System.out.println(sdf.format(cc));
            }
        }
    }
}
