package com.company.Example22;


import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetTest04 {
    public static void main(String[] args){
        SortedSet c1 = new TreeSet();
        User u1 = new User(12);
        User u2 = new User(13);
        User u3 = new User(16);
        User u4 = new User(11);
        User u5 = new User(9);
        c1.add(u1);
        c1.add(u2);
        c1.add(u3);
        c1.add(u4);
        c1.add(u5);
        Iterator itr = c1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
class User implements Comparable{
    private int age;
    User(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "User[age = " + age + "]";
    }
    @Override
    public int compareTo(Object o) {
        User o1 = (User) o;
        return o1.age - this.age;
    }
}
