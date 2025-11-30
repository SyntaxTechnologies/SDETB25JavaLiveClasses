package org.example.project1;

import java.util.Scanner;

/*
Write a program that takes two numbers as input and prints their sum, difference, product,
and division without using any extra variables for calculations.
 */
public class Q4 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter the first number");
        double number1=scan.nextDouble();
        System.out.println("Please Enter the second number");
        double number2=scan.nextDouble();
        System.out.println(number1+number2);
        System.out.println(number1-number2);
        System.out.println(number1*number2);
        System.out.println(number1/number2);

    }
}
