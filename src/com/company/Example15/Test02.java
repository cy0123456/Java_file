package com.company.Example15;

public class Test02 {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();

        boolean b1 = o1.equals(o2);
        System.out.println(b1);

        Star s1 = new Star(100,"huang");
        Star s2 = new Star(100,"huang");
        Star s3 = new Star(100,"ads");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        String n1 = new String("A");
        String n2 = new String("A");
        System.out.println(n1 == n2);
        //==在比较字符串时，n1n2存的是内存地址，而equals已经重写过了地址；
        System.out.println(n1.equals(n2));


    }
}
class Star{
    int id;
    String name;

    public Star(int id , String name){
        this.id = id;
        this.name = name;

    }

    @Override
    public boolean equals(Object obj) {
        int id1 = this.id;
        if(this == obj){return true;}
        if (obj instanceof Star) {
            Star s = (Star) obj;
            if (s.id == id && s.name.equals(name)){
                return true;
            }
        }
        return false;
    }
}
