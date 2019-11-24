package com.company.Example10;

public class FinalTest1 {
    public static void main(String[] args) {
        User u = new User();
        //此处上面的程序将变成垃圾程序；
        u = new User(200);

        final User user = new User(30);
//        user = new User(30)   一旦引用指向一个对象，那么这个引用不能指向其余对象
        user.id = 50;
    }
}
