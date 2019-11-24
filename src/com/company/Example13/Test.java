package com.company.Example13;

public class Test {
    public static void main(String[] args) {
        CustomerService cs = new CustomerServiceImpl(); //多态 父类型指向子类型

        cs.logout();

    }
}
