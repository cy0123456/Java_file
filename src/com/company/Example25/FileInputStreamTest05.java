package com.company.Example25;

import java.io.FileInputStream;

public class FileInputStreamTest05 {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("src\\com\\company\\Example25\\temp01.txt");
        System.out.println(fis.available());
        fis.read();
        System.out.println(fis.available());
        fis.skip(2);
        System.out.println(fis.read());
        fis.close();
    }
}
