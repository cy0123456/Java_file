package com.company.Example21;

import java.util.*;

public class CollectionTest02 {
    public static void main(String[] args) {
        Collection c = new HashSet();
        c.add(100);
        c.add(3.14);
        c.add(false);
        //获取迭代器，不用关心底层的具体类型
        Iterator itr = c.iterator();  //迭代器全部面向接口编程
        //开始迭代
        while (itr.hasNext()){
            Object element = itr.next();
            System.out.println(element);
        }

        for (Iterator it = c.iterator(); it.hasNext();){
            Object element = it.next();
            System.out.println(element);
        }

    }
}
