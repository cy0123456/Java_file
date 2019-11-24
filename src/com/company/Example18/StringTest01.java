package com.company.Example18;

public class StringTest01 {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();
        String[] ins = {"音乐","体育","没事","睡觉"};
        for (int i = 0;i<ins.length;i++){
            if (i != ins.length-1){
                sb.append(ins[i]);
                sb.append(",");
            }else {
                sb.append(ins[i]);
            }

        }
        System.out.println(sb);
    }
}
