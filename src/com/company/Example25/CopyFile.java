package com.company.Example25;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile {
    public static void main(String[] args) throws Exception {
        String path = "F:\\安装包";
        String path1 = "E:\\安装包";
        copys(path,path1);
    }

    public static void copys(String path,String path1) throws Exception {
       /**path为目标路径，path1为原始路径
        * 整体思路，
        * 1、建立目标文件夹；
        * 2、读取原始文件夹，获取原始文件夹中所有文件的名字；
        * 3、使用数据流递归进行复制，若是文件，则直接复制，若是文件夹，则进行递归；
        * */
//      创建文件夹
        File ofls = new File(path1);
        File ifls = new File(path);
        ifls.mkdir();
//      读取文件名称；
        File[] files = ofls.listFiles();
        for (File u : files){
            String name = u.getName();
            String orgpath = path1 + "\\" + name;
            String tagpath = path + "\\" + name;
            if (u.isFile()){
//          若是文件，则添加文件
                FileInputStream fis = new FileInputStream(orgpath);
                FileOutputStream fos = new FileOutputStream(tagpath);
                byte[] bytes = new byte[1024];
                int temp = 0;
                while((temp = fis.read(bytes)) != -1){
                    fos.write(bytes,0,temp);
                }
                fos.flush();
                fis.close();
                fos.close();
            } else if (u.isDirectory()){
                copys(tagpath,orgpath);
            }
        }
    }
}
