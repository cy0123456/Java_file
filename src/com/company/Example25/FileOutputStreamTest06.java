package com.company.Example25;

import java.io.FileOutputStream;

public class FileOutputStreamTest06 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("src\\com\\company\\Example25\\temp02.txt",true);
//            若不存在 则自动创建
            String mas = " HelloWorld";
            byte[] bytes = mas.getBytes();
            fos.write(bytes,0,3);
            fos.flush();
//          强制写入
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            if (fos != null){
                try {
                    fos.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
