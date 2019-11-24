package com.company.Example25;

import java.io.*;

public class ObjectInputStreamTest01 {
    public static void main(String[] args) throws Exception{
        User u1 = new User("Jack");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src\\com\\company\\Example25\\temp07.txt"));
        oos.writeObject(u1);
        oos.flush();
        oos.close();
        ObjectInputStream iis = new ObjectInputStream(new FileInputStream("src\\com\\company\\Example25\\temp07.txt"));
        System.out.println(iis.readObject());
        iis.close();
    }
}

class User implements Serializable {
//    该接口为标志接口，无任何方法
    String name;
    User(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "User[name = " + name + "]";
    }
}
