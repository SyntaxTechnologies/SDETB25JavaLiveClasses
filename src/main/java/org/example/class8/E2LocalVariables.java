package org.example.class8;

public class E2LocalVariables {
    public static void main(String[] args) {


     if(10>20){
         int number=20;
     }

        //can't access number variable here will get an error
        // as it is a local variable which is defined in other block.
       // System.out.println(number);

        if(10>5){

            //System.out.println(name);

            if(true==true){
               // System.out.println(name);
                String name="Adam";
                System.out.println(name);
            }

           // System.out.println(name);

        }

    }
}
