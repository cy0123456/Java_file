package com.company.Example25;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("src\\com\\company\\Example25\\temp03.txt",true);
        fw.write("李海波！！！");
        char[] chars = {'我','是','中','国','人'};
        fw.write(chars);
        fw.flush();
        fw.close();
    }
}
