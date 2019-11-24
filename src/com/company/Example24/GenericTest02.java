package com.company.Example24;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GenericTest02 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("西瓜",10);
        map.put("香蕉",5);
        map.put("黄瓜",6);
        map.put("苹果",13);
        Set<String> keys = map.keySet();
        for (Object u : keys){
            System.out.println(u + "--->" + map.get(u));
        }
    }
}
