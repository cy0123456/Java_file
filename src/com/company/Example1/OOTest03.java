package com.company.Example1;

public class OOTest03 {
    public static void main(String[] args){

        User u = new User();
        Address a = new Address(); //a中存储的是地址
        u.addr = a;
        System.out.println(u.addr);
        //堆内存中的实例变量 只有一份，  变量改变后 地址不变 故u.addr.city 地址指向的是a的地址 所以也随之改变
        a.city = "tian jing ";
        System.out.println(u.addr.city);
    }
}
