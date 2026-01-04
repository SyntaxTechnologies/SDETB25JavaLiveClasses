package org.example.class11;

import java.util.ArrayList;

public class E3ArrayList {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Larry");
        names.add("Muse");
        names.add("Roman");
        names.add("Princewill");

        names.remove("Roman");
        names.remove(2);
        System.out.println(names);

    }
}
