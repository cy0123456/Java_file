package com.company.Example24;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class GenericTest03 {
    public static void main(String[] args) {
        SortedSet<Manager> ss = new TreeSet<Manager>(new Comparator<Manager>(){
            @Override
            public int compare(Manager manager, Manager t1) {
                if (manager.sal>t1.sal){
                    return 1;
                }else if (manager.sal == t1.sal){
                    return 0;
                }else {
                    return -1;
                }
            }
        });

        Manager m1 = new Manager(1000.00);
        Manager m2 = new Manager(800.00);
        Manager m3 = new Manager(1500.00);
        ss.add(m1);
        ss.add(m2);
        ss.add(m3);
        for (Object u:ss){
            System.out.println(u);
        }
    }
}
class Manager{
    double sal;
    Manager(double sal){
        this.sal = sal;
    }

    @Override
    public String toString() {
        return sal + "";
    }
}