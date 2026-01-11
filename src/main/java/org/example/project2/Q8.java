package org.example.project2;

/*
You have a list of strings and you want to keep only those that start with “A” and you
want to return them in lower case"
 */


import java.util.ArrayList;

public class Q8 {
    public static void main(String[] args) {

        ArrayList<String> stringList=new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Orange");
        stringList.add("Cat");
        stringList.add("angry");
        stringList.add("Awesome");
        stringList.add("avacado");

        ArrayList<String> processed=new ArrayList<>();

        for(String str:stringList){
            if(str.startsWith("A")||str.startsWith("a")){
                processed.add(str.toLowerCase());
            }
        }
        System.out.println(processed);

    }
}
