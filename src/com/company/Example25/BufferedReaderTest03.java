package com.company.Example25;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferedReaderTest03 {
    public static void main(String[] args) throws Exception{

        Scanner p = new Scanner(System.in);
//        System.in为标准的输入流

        String str = p.next();
        System.out.println("您输入了：" + str);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        System.out.println("您输入了:" + str1);
    }
}
