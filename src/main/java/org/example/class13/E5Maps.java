package org.example.class13;

import java.util.TreeMap;

public class E5Maps {
    public static void main(String[] args) {
       TreeMap<Integer,String> names=new TreeMap<>();
       names.put(5,"John");
       names.put(2,"Adam");
       names.put(1,"Larry");
       names.put(7,"Roman");
       names.put(4,"Mirwais");


      names.forEach(( key,  value)->{
          System.out.println(key+"   "+value);

      });

      for (String value:names.values()){
          System.out.println(value);

      }
    }
}
