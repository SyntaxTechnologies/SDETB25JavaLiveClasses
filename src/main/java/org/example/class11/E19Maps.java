package org.example.class11;

import java.util.Map;
import java.util.TreeMap;

public class E19Maps {
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
    }
}
