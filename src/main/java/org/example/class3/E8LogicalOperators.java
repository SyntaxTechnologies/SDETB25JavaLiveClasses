package org.example.class3;

import java.util.Scanner;

public class E8LogicalOperators {
    public static void main(String[] args) {

        boolean isRaining=false;
        boolean isWeekend=true;
        boolean hasMoney=true;
        // true and true => true
        // false and true => false
        // true and false => false
        // false and false => false

        if(isRaining && isWeekend&& hasMoney){
            System.out.println("Let's cook kababs");
        }else{
            System.out.println("Let's wait");
        }


    }
}
