package com.company.Example23;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class MapTest03 {
    public static void main(String[] args) {
        SortedMap<Product, Double> products = new TreeMap<Product, Double>(new Comparator() {
            @Override
            public int compare(Object o, Object t1) {
                double price1 = ((Product)o).price;
                double price2 = ((Product)t1).price;
                if (price1 > price2){
                    return 1;
                }else if (price1 == price2){
                    return 0;
                }else {
                    return -1;
                }
            }
        });
//      Map key存储类型value存储重量
        Product p1 = new Product("西瓜",10.00);
        Product p2 = new Product("苹果",5.00);
        Product p3 = new Product("香蕉",8.00);
        Product p4 = new Product("黄瓜",1.00);
        products.put(p1,10.0);
        products.put(p2,8.0);
        products.put(p3,7.0);
        products.put(p4,6.0);
        Set<Product> u = products.keySet();
        for (Object m :u){
            System.out.println(m  + "--->" + products.get(m) + "kg");
        }
    }
}
class Product{
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product[name = " + name + ",price = " + price + "]";
    }

//    public int compareTo(Object o) {
//        double price1 = this.price;
//        double price2 = ((Product)o).price;
//        if (price1 > price2){
//            return 1;
//        }else if (price1 == price2){
//            return 0;
//        }else {
//            return -1;
//        }
//    }
}
