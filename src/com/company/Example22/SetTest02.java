package com.company.Example22;

import java.util.*;
public class SetTest02 {
    public static void main(String[] args) {
        Set sc = new HashSet();
        Employee c1  = new Employee("1000","Jack");
        Employee c2  = new Employee("1000","Jack");
        Employee c3  = new Employee("1000","Scout");
        Employee c4  = new Employee("2001","Love");
        Employee c5  = new Employee("3000","Lang");
        Employee c6  = new Employee("3001","Cook");
        sc.add(c1);
        sc.add(c2);
        sc.add(c3);
        sc.add(c4);
        sc.add(c5);
        sc.add(c6);
        System.out.println(sc.size());
    }
}

class Employee{
    String no;
    String name;
    Employee(){

    }
    Employee(String no,String name){
        this.name = name;
        this.no = no;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj instanceof Employee){
            Employee obj1 = (Employee)obj;
            if (obj1.name.equals(this.name) && obj1.no.equals(this.no)){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return no.hashCode();
    }
}
