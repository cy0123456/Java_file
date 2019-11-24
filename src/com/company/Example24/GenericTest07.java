package com.company.Example24;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class GenericTest07 {
    public static void main(String[] args) {
        Shoppingcart sp = new Shoppingcart();
        sp.productMaps = new HashMap<Product,Integer>();
        Product apple = new Product("苹果","1001",5.20);
        Product apple1 = new Product("苹果","1002",6.20);
        Product banana = new Product("香蕉","2001",3.20);
        Product group = new Product("葡萄","3001",4.20);
        Product pear = new Product("梨","4001",6.20);
        sp.add(apple,5);
        sp.add(apple1,6);
        sp.add(banana,7);
        sp.add(group,4);
        sp.add(pear,3);
        sp.remove(apple,4);
        sp.print();
        sp.clear();
        System.out.println("------------------------------------------------");

    }
}

class Shoppingcart{

    Map<Product, Integer> productMaps;

    void add(Product p){
    //  添加一个商品
        add(p,1);
    }
    void add(Product p , int i){
        //  添加n个商品
        if (!productMaps.containsKey(p)){
            productMaps.put(p,i);
        }else {
            int u = productMaps.get(p) + i;
            productMaps.put(p,u);
        }

    }
    void remove(Product p){
        //  删除一个商品
        remove(p,1);
    }
    void remove(Product p, int i) {
        //  删除n个商品
        if (!productMaps.containsKey(p)){
            productMaps.put(p,i);
        }else {
            int u = productMaps.get(p) - i;
            productMaps.put(p,u);
        }
    }
    void clear(){
        //  清空购物车
        productMaps.clear();
    }
    void print() {
        //  输出购物清单
        Set<Product> pro = productMaps.keySet();
        for (Product u : pro){
            System.out.println("[" + u.name + "编号：" + u.no + "]" + "  单价：" + u.price + "  个数：" + productMaps.get(u) + "  总计：" + u.price * productMaps.get(u));
        }
    }
}



class Product{
    String name;
    String no;
    double price;

    public Product() {
        System.out.println("请输入您要的水果名字，编号及价格");
    }

    public Product(String name, String no, double price) {
        this.name = name;
        this.no = no;
        this.price = price;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if(obj instanceof Product){
            Product obj1 = (Product)obj;
            if (obj1.name == this.name && obj1.no == this.no){
                return true;
            }
        }
        return false;
    }
}
