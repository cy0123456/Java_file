package com.company.Example24;

import java.util.ArrayList;
import java.util.List;
import java.io.*;
public class GenericTest05 {
    public static void main(String[] args) {
        List<String> b = new ArrayList<String>();
        b.add("s");
        b.add("a");
        b.add("d");
        b.add("f");
        b.add("h");
        for (String a : b){
            System.out.println(a);
        }
    }
}
