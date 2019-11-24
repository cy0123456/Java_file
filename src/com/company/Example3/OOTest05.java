package com.company.Example3;

public class OOTest05 {
    public static void main(String[] args) {

        Customer c = new Customer();
        c.setId(100);
        c.setAddress("西安");
        c.setAge(15);
        c.setName("张三");
        System.out.println(c.getId());
        System.out.println(c.getAddress());
        System.out.println(c.getAge());
        System.out.println(c.getName());
    }
}
