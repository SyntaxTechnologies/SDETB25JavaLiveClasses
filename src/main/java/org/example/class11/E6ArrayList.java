package org.example.class11;

import java.util.ArrayList;

public class E6ArrayList {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Larry");
        names.add("Muse");
        names.add("Roman");
        names.add("Princewill");
        System.out.println(names);
        names.add(1, "Clara");
        System.out.println(names);


    }
}
