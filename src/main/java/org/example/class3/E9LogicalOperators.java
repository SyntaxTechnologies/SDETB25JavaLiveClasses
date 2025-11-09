package org.example.class3;

public class E9LogicalOperators {
    public static void main(String[] args) {


        boolean isStudent=false;
        int totalPrice=50;
        /*
        true || true=> true
        true || false=> true
        false || true=> true
        false || false=> false
         */

        if(isStudent || totalPrice>200){
            System.out.println("You will get 20% discount");
        }



    }
}
