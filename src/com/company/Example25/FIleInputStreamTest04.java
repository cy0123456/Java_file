package com.company.Example25;

import java.io.FileInputStream;
import java.io.IOException;

public class FIleInputStreamTest04 {
    public static void main(String[] args) throws IOException {
        FileInputStream fls = new FileInputStream("src\\com\\company\\Example25\\FIleInputStreamTest04.java");
        byte[] bytes = new byte[1024];
//        while (true){
//            int temp = fls.read(bytes);
//            if (temp == -1 )break;
//            System.out.println(new String(bytes,0,temp));
//        }
//        System.out.println("----------------");
        int temp = 0;
        while((temp = fls.read(bytes)) != -1){
            System.out.print(new String(bytes,0,temp));
        }
        fls.close();
    }
}
