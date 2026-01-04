package org.example.class11;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class E11Sets {
    public static void main(String[] args) {

        LinkedHashSet<Integer> ages=new LinkedHashSet<>();
        ages.add(10);
        ages.add(40);
        ages.add(55);
        ages.add(5);
        ages.add(65);
        ages.add(65);
        System.out.println(ages);


    }
}
