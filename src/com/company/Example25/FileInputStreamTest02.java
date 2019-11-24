package com.company.Example25;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest02 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src\\com\\company\\Example25\\temp01.txt");
//        while(true){
//            int temp = fis.read();
//            if (temp == -1) break;;
//            System.out.println(temp);
//        }
        int temp = 0;
        while ((temp = fis.read()) != -1){
            System.out.println(temp);
        }
        fis.close();
    }
}
