package com.company.Example3;

public class UserTest {
    public static void main(String[] args) {
        User user = new User();
        // System.out.println(user.age);  age属性私有化 外部不能访问
        // 非常安全 但是太过安全
        user.setAge(10);
        int a = user.getAge();
        System.out.println(a);
    }
}
