package org.example.class8;

public class E4LocalVariables {
    public static void main(String[] args) {

       // System.out.println(a);

        int a=1;
        System.out.println(a);
        switch (a){
            case 1:
                String name="John";
                System.out.println(name);
                System.out.println(a);
            case 2:
                System.out.println(a);
               // System.out.println(name);
        }

    }
}
