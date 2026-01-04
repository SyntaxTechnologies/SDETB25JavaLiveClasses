package org.example.class11;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class E16Maps {
    public static void main(String[] args) {
        TreeMap<String,Double> items=new TreeMap<>();
        items.put("Apple",12.5);
        items.put("Banana",5.5);
        items.put("Orange",3.5);
        items.put("Kiwi",8.5);
        items.put("Mango",12.5);
        System.out.println(items);
        System.out.println(items.replace("Mango",5.56));
        System.out.println(items);
    }
}
