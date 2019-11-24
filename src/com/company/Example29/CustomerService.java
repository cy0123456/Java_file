package com.company.Example29;

public class CustomerService {
    public boolean login(String name,String pwd){
        if ("admin".equals(name) && "123".equals(pwd)){
            return true;
        }
        return false;
    }

    public void logout(){
        System.out.println("系统已安全退出");
    }
}
