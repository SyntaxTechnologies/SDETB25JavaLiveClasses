package org.example.class4;

import java.util.Scanner;

public class E9WileLoop {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter true or false");
        boolean condition=scanner.nextBoolean();
        while (condition) {
            System.out.println("Nasir");
            System.out.println("Enter true or false");
            condition=scanner.nextBoolean();

        }
    }
}
