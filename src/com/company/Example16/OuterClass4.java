package com.company.Example16;

public class OuterClass4 {
    public static void test(CustomerService cs){
        cs.logout();
    }
    public static void main(String[] args) {
        /**
         * 传统方法，下面是使用匿名内部类方法
         * CustomerService c1 = new Customer();
         *         test(c1);*/
        test(new CustomerService() {
            @Override
            public void logout() {
                System.out.println("退出程序");
            }
        });
        /**
         * 优点：少定义了类
         * 缺点：不能重复使用*/
    }
}
interface CustomerService{
    public abstract void logout();
}
/**class Customer implements CustomerService{
    public void logout(){
        System.out.println("退出程序");
    }
}*/
