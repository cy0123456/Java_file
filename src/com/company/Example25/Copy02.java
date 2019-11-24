package com.company.Example25;

import java.io.FileReader;
import java.io.FileWriter;

public class Copy02 {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("src\\com\\company\\Example25\\Copy02.java");
        FileWriter fw = new FileWriter("src\\com\\company\\Example24\\Copy02.txt");

        char[] chars = new char[512];
        int temp = 0;
        while((temp = fr.read(chars)) != -1){
            fw.write(chars,0,temp);
        }
        fw.flush();
        fr.close();
        fw.close();

    }
}
