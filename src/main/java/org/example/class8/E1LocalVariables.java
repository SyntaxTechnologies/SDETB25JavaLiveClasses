package org.example.class8;

public class E1LocalVariables {
    public static void main(String[] args) {


        {
            // number here is a local
            // variable which can only be accessed in this block of code.
           int number=10;
        }

        {
            //can't access number variable here will get an error
            // as it is a local variable which is defined in other block.
           // System.out.println(number);
        }

    }
}
