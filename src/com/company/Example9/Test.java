package com.company.Example9;

/**
 * 多态在实际应用中的使用
 * 类型抽象：
 *      主人类： 主人喂养宠物
 *      宠物类： 宠物吃东西
 */
public class Test {
    public static void main(String[] args) {
        Master xiaoming = new Master();
        Cat tom = new Cat();
        Dog erHa = new Dog();
        Snake bsz = new Snake();
        /**
         * 此处为多态的使用， 子类自动转换为父类，编译阶段不会出错，而运行阶段真正运行的是Cat 和Dog 中的方法
         */
        xiaoming.feed(new Cat());
        xiaoming.feed(tom);
        xiaoming.feed(erHa);
        xiaoming.feed(bsz);
        String newString = "asd".replace('a','b');
        System.out.println(newString);
    }
}
