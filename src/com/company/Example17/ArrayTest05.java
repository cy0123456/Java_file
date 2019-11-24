package com.company.Example17;

public class ArrayTest05 {
    public static void main(String[] args) throws StackException {
        Object[] k = {1,2,3,63,4,9,7,4,5,6};
        Stack n = new Stack();
        for (int i = 0;i< n.elements.length;i++){
            n.push(k[i]);
        }
        for (int i = 0;i< n.elements.length;i++){
            System.out.print(n.elements[i]+ "\t");
        }
        System.out.println("");
        for (int i = 0;i< n.elements.length;i++){
            System.out.print(n.pop() + "\t");
        }
        System.out.println("");
        Stack z = new Stack(5);
        User k1 = new User(16,"张三");
        User k2 = new User(17,"李四");
        User k3 = new User(18,"王麻子");
        User k4 = new User(19,"江青");
        User k5 = new User(20,"王八");
        try {        //压栈
            z.push(k1);
            z.push(k2);
            z.push(k3);
            z.push(k4);
            z.push(k5);
            z.push(k5);
        }catch (StackException e){
            e.printStackTrace();
        }

        for (int i = 0;i< z.elements.length;i++){
            System.out.println(z.elements[i]+ "\t");
        }
        System.out.println("");


        try{    //弹栈
            for (int i = 0;i<= z.elements.length;i++){
            System.out.println(z.pop());
            }
        }catch (StackException e){
            e.printStackTrace();
        }



    }
}
class User{
    int age;
    String name;
    User(){

    }
    User(int age,String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User: [name:" + name + "age:" + age + "]";
    }
}
class Stack{
    Object[] elements;
    int n;
    Stack(){
        this(10);
    }
    Stack(int max){
        elements = new Object[max];
        n = 0;
    }
    public void push(Object element) throws StackException{
        if (n == elements.length){
            throw new StackException("栈已满");
        }
        elements[n++] = element;
    }
    public Object pop() throws StackException{
        if (n == 0){
            throw new StackException("栈已空");
        }
        return elements[--n];
    }
}

