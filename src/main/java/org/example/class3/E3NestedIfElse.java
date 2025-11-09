package org.example.class3;

public class E3NestedIfElse {
    public static void main(String[] args) {


        // for Mac Cmd+options+l
        // for Windows Ctrl+alt+l
        int age = 10;
        boolean voterRegistered = false;
        System.out.print(1+" ");
        if (age >= 18) {
            System.out.print(2+" ");
            if (voterRegistered) {
                System.out.print(3+" ");
            } else {
                System.out.print(4+" ");
            }
            System.out.print(5+" ");
        } else {
            System.out.print(6+" ");
        }
        System.out.print(7+" ");

    }
}
