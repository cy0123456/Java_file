package com.company.Example25;

import java.io.FileInputStream;

public class FIleInputStreamTest03 {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("src\\com\\company\\Example25\\temp01.txt");
        byte[] bytes = new byte[3];
//      最多读三个

        int i1 = fis.read(bytes);
        System.out.println(new String(bytes));
        int i2 = fis.read(bytes);
        System.out.println(new String(bytes));
        int i3 = fis.read(bytes);
        System.out.println(new String(bytes,0,i3));
        int i4 = fis.read(bytes);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);

    }
}
