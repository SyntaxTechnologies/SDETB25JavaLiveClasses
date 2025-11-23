package org.example.class4;

import java.util.Scanner;

public class E10WileLoop {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number the number 10 to stop");
        int number=scanner.nextInt();
        while (number!=10) {
            System.out.println("Enter a number the number 10 to stop");
             number=scanner.nextInt();

        }
    }
}
