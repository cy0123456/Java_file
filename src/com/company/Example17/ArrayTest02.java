package com.company.Example17;

public class ArrayTest02 {
    public static void main(String[] args) {
        Animal[] cs = new Animal[4];

        Dog d1 = new Dog();
        Dog d2 = new Dog();
        Cat c1 = new Cat();
        Cat c2 = new Cat();
        cs[0] = d1;
        cs[1] = d2;
        cs[2] = c1;
        cs[3] = c2;
        for (int i = 0;i < cs.length;i++){
            if (cs[i] instanceof Cat){
                Cat u = (Cat) cs[i];
                u.move();
            }
            else if (cs[i] instanceof Dog){
                Dog d = (Dog) cs[i];
                d.eat();
            }
            else {
                System.out.println("您的宠物类型不存在");
            }
        }
    }
}
class Animal{

}
class Dog extends Animal{
    public void eat(){
        System.out.println("狗吃屎");
    }
}

class Cat extends Animal{
    public void move(){
        System.out.println("猫跑步");
    }
}
