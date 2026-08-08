package com.adelbrx.iterator.exercice;

public class Demo {
    public static  void show() {
        ProductCollection collection = new ProductCollection();

        collection.add(new Product(1,"product 1"));
        collection.add(new Product(2,"product 2"));
        collection.add(new Product(3,"product 3"));

        var iterator = collection.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
