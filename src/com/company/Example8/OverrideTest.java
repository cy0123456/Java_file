package com.company.Example8;

public class OverrideTest {
    public static void main(String[] args) {
        //创造动物类
        Animal a = new Animal();
        a.move();

        //创造猫科类动物
        Cat c = new Cat();
        c.move();
        c.catchMouse();

        //创造飞禽类动物
        Bird d = new Bird();
        d.move();

        //创造了布谷鸟
        BuguBird b = new BuguBird();
        b.move();
        /**
         * 多态语法  Cat is a Animal
         * 此处进行了类型转换，子类型转换为了父类型，向上转形 upcasting 自动类型转换
         */
        Animal a2 = new Cat();
        a2.move();
        /**
         * a2.CatchMouse 无法执行，因为在编译阶段a2的类型为Animal， 无CatchMouse这个方法  编译无法通过
         */
        Cat c2 = (Cat) a2 ;
        c2.catchMouse();

        Animal a3 = new Bird();
        Animal a4 = new Cat();
//        Cat c3 = (Cat)a3; 此处编译能通过 但是运行无法通过  会出现ClassCastException  类型转换异常
        if((a4 instanceof Cat)){
            Cat c4 = (Cat)a4;
            c4.catchMouse();
        }
        if ((a3 instanceof Bird)){
            Bird c3 = (Bird)a3;
            c3.fly();
        }
        if ((a3 instanceof BuguBird)){
            BuguBird c3 = (BuguBird)a3;
            c3.fly();
        }
        System.out.println(a3 instanceof BuguBird);

    }
}
