package com.company.Practice;

public class Exercise09 {
    public static void main(String[] args) {

    }
    public static String replaceSpace(StringBuffer str) {
        StringBuffer copyStr = null;
        for(int i = 0;i<str.length();i++){
            char u = str.charAt(i);
            if(u != ' '){
                copyStr.append(u);
            }else{
                copyStr.append("%20");
            }
        }
        return copyStr.substring(0,copyStr.length());
    }
}
