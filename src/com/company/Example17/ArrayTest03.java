package com.company.Example17;

import com.company.Example10.User;

import java.util.Scanner;

public class ArrayTest03 {
    public static void main(String[] args) {
        String[] u = new String[2];
        for (int i = 0;i < u.length;i++){
            Scanner n = new Scanner(System.in);
            if (i == 0){
                System.out.print("Username:");
            }else if (i==1){
                System.out.print("id:");
            }
            String n1 = n.next();
            u[i] = n1;
        }
        String Username = u[0];
        String id = u[1];
        /**
         * 此处尽量使用"admin".
         * 这种方式可以避免空指针异常*/
        if ("admin".equals(Username) && "123456".equals(id)){
            System.out.println("登陆成功");
        }else{
            System.out.println("登陆失败，您的帐户名密码不正确");
        }

    }
}
