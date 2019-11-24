package com.company.Example22;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetTest05 {
    public static void main(String[] args) {
        SortedSet<Product> products = new TreeSet<Product>(new ProductComparator());
        Product c1 = new Product(1.4);
        Product c2 = new Product(1.8);
        Product c3 = new Product(3.4);
        Product c4 = new Product(69.4);
        Product c5 = new Product(2.4);
        products.add(c1);
        products.add(c2);
        products.add(c3);
        products.add(c4);
        products.add(c5);
        Iterator<Product> itr = products.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
class Product{
    double price;

    Product(double price){
        this.price = price;
    }

    @Override
    public String toString() {
        return price + "";
    }
}
class ProductComparator implements Comparator{

    @Override
    public int compare(Object o, Object t1) {
        double price1 = ((Product)o).price;
        double price2 = ((Product)t1).price;
        if (price1 == price2){
            return 0;
        }else if (price1 > price2){
            return 1;
        }else {
            return -1;
        }
    }
}
