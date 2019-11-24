package com.company.Example25;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Copy01 {
    public static void main(String[] args) throws Exception {
//        输入流
        FileInputStream fis = new FileInputStream("src\\com\\company\\Example25\\FIleInputStreamTest04.java");
//        输出流
        FileOutputStream fos = new FileOutputStream("F:\\Java_file\\src\\com\\company\\Example24\\FIleInputStreamTest04.txt");

//        一边读一边写即可
        byte[] bytes = new byte[1024];
        int temp = 0;
        while((temp = fis.read(bytes)) != -1){
            fos.write(bytes,0,temp);
        }
//        刷新
        fos.flush();
//        关闭
        fis.close();
        fos.close();
    }
}
