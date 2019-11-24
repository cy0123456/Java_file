package com.company.Example23;

import java.util.*;

public class MapTest01 {
    public static void main(String[] args) {
        Map persons = new HashMap();
        // 需要重写hashcode 和equal  由于k为String 已经重写过 故不需重写
        persons.put("10000","Jack");
        persons.put("10011","Sun");
        persons.put("10002","King");
        persons.put("10003","Cook");
        persons.put("10000","Lucy");
        System.out.println(persons.size());
        System.out.println(persons.containsKey("10000"));
        System.out.println(persons.containsValue("Jack"));
        Object c = persons.get("10000");
        System.out.println(c);
        persons.remove("10011");
        System.out.println(persons.size());
        Collection y = persons.values();
        for (Object m : y){
            System.out.println(m);
        }
        Set k = persons.keySet();
        Iterator itr = k.iterator();
        while (itr.hasNext()){
            Object mn = itr.next();
            System.out.println(mn + "--->" + persons.get(mn));
        }
        Set k1 = persons.entrySet();
        for (Object km : k1){
            System.out.println(km);
        }
    }
}
