package org.example.project2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/*
How can you remove all duplicates from ArrayList?
 */
public class Q10 {
    public static void main(String[] args) {
        ArrayList<String> stringList=new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Orange");
        stringList.add("Apple");
        stringList.add("angry");
        stringList.add("Awesome");
        stringList.add("Orange");

        Set<String> uniqueStrings=new LinkedHashSet<>(stringList);
        System.out.println(uniqueStrings);
    }
}
