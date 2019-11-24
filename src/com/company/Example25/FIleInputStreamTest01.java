package com.company.Example25;
import java.io.*;
public class FIleInputStreamTest01 {
    public static void main(String[] args){
        /**要读某文件，先与文件创建流
         * */
        FileInputStream fis = null;
        try {
            String filepath = "F:\\Java_file\\src\\com\\company\\Example25\\temp01.txt";
//          绝对路径
            String filepath1 = "src\\com\\company\\Example25\\temp01.txt";
//          相对路径
            fis  = new FileInputStream(filepath1);
            int i1 = fis.read();
            int i2 = fis.read();
            int i3 = fis.read();
            int i4 = fis.read();
            int i5 = fis.read();
            int i6 = fis.read();
            System.out.println(i1);
            System.out.println(i2);
            System.out.println(i3);
            System.out.println(i4);
            System.out.println(i5);
            System.out.println(i6);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
//          为了保证流一定释放所以在finally语句执行
            if(fis != null){
                try {
                    fis.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
