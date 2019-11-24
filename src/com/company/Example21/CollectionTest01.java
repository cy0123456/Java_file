package com.company.Example21;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest01 {
    public static void main(String[] args) {
        //1. 创建集合
        Collection c = new ArrayList();
        //2.添加元素
        c.add(1);
        Customer c1 = new Customer("张三",16);
        c.add(c1);
        System.out.println(c);
        System.out.println(c.size());
        Object[] s = c.toArray();
        for (Object zx:s){
            System.out.println(zx);
        }
        System.out.println(c);
        System.out.println(c.isEmpty());

        c.clear();
        System.out.println(c.size());
        System.out.println(c.isEmpty());
    }
}
class Customer{
    String name ;
    int age;
    Customer(String name,int age){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer[name = " + name + ",age = "+age + "]";
    }
}