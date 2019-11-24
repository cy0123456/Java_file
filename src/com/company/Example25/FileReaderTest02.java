package com.company.Example25;

import java.io.FileReader;

public class FileReaderTest02 {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("src\\com\\company\\Example25\\FileReaderTest01.java");

        char[] chars = new char[512];
//             以字符方式，一个字符两个字节
        int temp = 0;
        while((temp = fr.read(chars)) != -1){
            System.out.print(new String(chars,0,temp));
        }
    }
}