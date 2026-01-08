package org.example.class13;

import java.util.Map;
import java.util.TreeMap;

public class E3Maps {
    public static void main(String[] args) {
       TreeMap<Integer,String> studentMap=new TreeMap<>();
        studentMap.put(5,"John");
        studentMap.put(2,"Adam");
        studentMap.put(1,"Larry");
        studentMap.put(7,"Roman");
        studentMap.put(4,"Mirwais");


       for(int key:studentMap.keySet()){
           System.out.println(key);
       }

       for(String value:studentMap.values()){
           System.out.println(value);
       }

        for(int key:studentMap.keySet()){
            System.out.println(key+" "+studentMap.get(key));
        }

    }
}
