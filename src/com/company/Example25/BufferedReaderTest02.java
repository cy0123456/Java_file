package com.company.Example25;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class BufferedReaderTest02 {
    public static void main(String[] args) throws Exception{
        FileInputStream fl = new FileInputStream("src\\com\\company\\Example25\\BufferedReaderTest02.java");
//      转换流
        InputStreamReader isr = new InputStreamReader(fl);
        BufferedReader br = new BufferedReader(isr);
        String temp = null;
        while ((temp = br.readLine()) != null){
            System.out.println(temp);
        }

        br.close();
    }
}
