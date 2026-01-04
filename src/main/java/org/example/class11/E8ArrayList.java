package org.example.class11;

import java.util.ArrayList;
import java.util.LinkedList;

public class E8ArrayList {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();
        names.add("Larry");
        names.add("Muse");
        names.add("Roman");
        names.add("Princewill");
        System.out.println(names);
        names.set(1, "Clara");
        System.out.println(names);


    }
}
