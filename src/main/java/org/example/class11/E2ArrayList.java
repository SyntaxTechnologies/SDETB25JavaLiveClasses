package org.example.class11;

import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Larry");
        names.add("Muse");
        names.add("Roman");
        names.add("Princewill");

        System.out.println(names);
        System.out.println(names.get(2));
        System.out.println(names.isEmpty());
        System.out.println(names.size());
        System.out.println(names.contains("Roman"));
        System.out.println(names.remove("Roman"));

    }
}
