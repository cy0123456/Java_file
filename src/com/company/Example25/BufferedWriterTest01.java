package com.company.Example25;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterTest01 {
    public static void main(String[] args) throws Exception{
        BufferedWriter bw = new BufferedWriter(new FileWriter("src\\com\\company\\Example25\\temp04.txt",true));

        bw.write("奥运会！！！");
        bw.newLine();
        bw.write("开幕式一点都没意思");
        bw.flush();
        bw.close();
    }
}
