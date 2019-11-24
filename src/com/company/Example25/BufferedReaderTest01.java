package com.company.Example25;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderTest01 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("src\\com\\company\\Example25\\BufferedReaderTest01.java"));
//        包装为带缓冲区的输入流

//        开始读
        String temp = null;
        while ((temp = br.readLine()) != null){
            System.out.println(temp);
        }
        br.close();
    }
}
