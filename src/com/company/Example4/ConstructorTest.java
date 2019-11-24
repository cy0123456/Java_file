package com.company.Example4;

public class ConstructorTest {
    public static void main(String[] args) {
        User a = new User();
        User u = new User("zhangsan",5);
        System.out.println(u.getName() + "的年龄是" + u.getAge());
        u.age1();
    }
}
