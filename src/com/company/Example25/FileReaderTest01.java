package com.company.Example25;

import java.io.FileReader;

public class FileReaderTest01 {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
             fr = new FileReader("src\\com\\company\\Example25\\FileReaderTest01.java");

             char[] chars = new char[512];
//             以字符方式，一个字符两个字节
             int temp = 0;
             while((temp = fr.read(chars)) != -1){
                 System.out.println(new String(chars,0,temp));
             }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (fr != null){
                try {
                    fr.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
