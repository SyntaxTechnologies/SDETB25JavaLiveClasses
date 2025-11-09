package org.example.class3;

import java.util.Scanner;

public class E4Scanner {
    public static void main(String[] args) {

        // Object creation
        // It is the most common way of using a piece of code from other files.
        Scanner scan = new Scanner(System.in);
        int input=scan.nextInt();
        System.out.println("This is what i entered "+input);


    }
}
