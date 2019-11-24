package com.company.Example15;

public class Test01 {
    public static void main(String[] args) {
        Object o1 = new Object();
        String oStr = o1.toString();
        System.out.println(oStr);
        Person p1 = new Person("刘德华",50);
        System.out.println(p1);
        String pStr = p1.toString();
        System.out.println(pStr);


    }
}
class Person{
    String name;
    int age;
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    Person(){

    }

    @Override
    //重写，根据需求重写
    public String toString() {
        return "Person[name =" + name + ",age = " + age + " ]";
    }
}