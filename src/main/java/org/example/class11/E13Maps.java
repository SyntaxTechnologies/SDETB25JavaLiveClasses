package org.example.class11;

import java.util.HashMap;

public class E13Maps {
    public static void main(String[] args) {
        HashMap<String,Double> items=new HashMap<>();
        items.put("Apple",12.5);
        items.put("Banana",5.5);
        items.put("Orange",3.5);
        items.put("Kiwi",8.5);
        items.put("Mango",12.5);
        System.out.println(items);
        System.out.println(items.isEmpty());
        System.out.println(items.containsKey("Kiwi"));
        System.out.println(items.containsValue(5.5));
        System.out.println(items.size());
        System.out.println(items.get("Banana"));
        System.out.println(items.remove("Kiwi"));
        System.out.println(items);
    }
}
