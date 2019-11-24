package com.company.Example12;

public class Test02 {
    public static void main(String[] args) {
        final Customer c = new Customer("jack",26);
//        c = new Customer("lucy",20);  c是final无法重新赋值
        c.name = "lisi";
    }
}
class Customer{
    String name;
    int age;

    Customer(String name,int age){
        this.name = name;
        this.age = age;
    }
}