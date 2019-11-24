package com.company.Example1;

public class OOTest02 {
    public static void main(String[] args) {

        //创建user对象
        User u = new User();

        System.out.println(u.name);
        System.out.println(u.no);
        System.out.println(u.addr);

        //修改变量值
        u.no = 100;
        u.name = "张三"; //属于一个字符串对象
        u.addr = new Address();  //此时是将Address的地址赋予了u.addr
        u.addr.city = "beijing";
        System.out.println(u.name);
        System.out.println(u.no);
        System.out.println(u.addr.city);
        System.out.println(u.addr.street);
        System.out.println(u.addr.zipcode);

    }
}
