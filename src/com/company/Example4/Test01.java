package com.company.Example4;

public class Test01 {
    public static void main(String[] args) {
        User1 u = new User1(20);
        add(u);
        System.out.println(u.age);
    }

    private static void add(User1 u) {
//        for(;u.age >= 0 ; u.age--){
//            System.out.println(u.age);
//        }
        u.age++;
        System.out.println("add" + u.age);
    }
}

class User1{
    int age;

    public User1(int age){
        this.age = age;

    }
}
