package com.company.Example25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Copy03 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("src\\com\\company\\Example25\\Copy03.java"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("src\\com\\company\\Example24\\Copy03.txt"));
        String temp = null;
        while ((temp = br.readLine())!=null){
            bw.write(temp);
            bw.newLine();
        }
        bw.flush();
        br.close();
        bw.close();

    }
}
