package com.company.Example13;


public interface Interface {
    /**
     * 接口就是一种类
     */
    public static final String SUCCESS = "success";
    public static final double PI = 3.14;
    byte maxu = 127;

    public abstract void m1();

    void m2();

    void m3();

    public static void main(String[] args) {

    }
}
interface B{
    void m1();
}
interface C{
    void m2();
}
interface D{
    void m3();
}
interface E extends B,C,D{
    void m4();
}

class MyClass implements B,C{
        public void m1(){};
        public void m2(){};

}
class F implements E{
    public void m1(){};
    public void m2(){};
    public void m3(){};
    public void m4(){};

}

