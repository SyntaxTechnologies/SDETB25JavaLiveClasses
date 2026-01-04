package org.example.class11;

import java.util.Map;
import java.util.TreeMap;

public class E18Maps {
    public static void main(String[] args) {
       TreeMap<Integer,String> names=new TreeMap<>();
       names.put(5,"John");
       names.put(2,"Adam");
       names.put(1,"Larry");
       names.put(7,"Roman");
       names.put(4,"Mirwais");

       for (Map.Entry<Integer,String> e:names.entrySet()){
           System.out.println(e.getKey()+"   "+e.getValue());
       }
    }
}
