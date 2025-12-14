package org.example.class8;

public class E5LocalVariables {

    //int g=10; // not a local variable
    public static void main(String[] args) {

        String name="Joel";

        {
            int a=10;
            {
                int b=20;
                {
                    int c=30;
                    {
                        System.out.println(a);
                        System.out.println(b);
                        System.out.println(c);
                    }
                    System.out.println(a);
                    System.out.println(b);
                    System.out.println(c);
                }
                System.out.println(a);
                System.out.println(b);
                //System.out.println(c);
            }
            System.out.println(a);
           // System.out.println(b);
            //System.out.println(c);
        }



    }
}
