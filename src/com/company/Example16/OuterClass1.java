package com.company.Example16;

public class OuterClass1 {
    private static String s = "A";
    //    可用访问控制权限控制
    private String s1 = "B";
    //  静态方法
    private static void m1(){
        System.out.println("m1执行");
    }
    //  成员方法
    private void m2(){
        System.out.println("m2执行");
    }

    class Innerclass1{
/**        public static void m3(){
            System.out.println(s);
            m1();
        }
    成员内部类中，不能有静态方法
 **/
        /**
         * 此为内部成员方法，故需要创建对象
         * */
        public void m4(){
            System.out.println(s);
//            System.out.println(s1);
            m1();
        }
    }

    public static void main(String[] args) {
        OuterClass1 c = new OuterClass1();
        Innerclass1 inner = c.new Innerclass1();
        inner.m4();
    }
}
