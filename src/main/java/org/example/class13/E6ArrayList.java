package org.example.class13;

import java.util.ArrayList;
import java.util.TreeMap;

public class E6ArrayList {
    public static void main(String[] args) {
        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("coffee");
        drinks.add("tea");
        drinks.add("water");
        drinks.add("coke");
        drinks.add("milk");
        drinks.removeIf(x->x.endsWith("e")||x.startsWith("t"));
        System.out.println(drinks);


    }
}
