package org.example.project1;
/*
Write a program that declares two integer variables with values, and then swaps them using
a temporary variable. Print the values before and after the swap.
 */
public class Q5 {
    public static void main(String[] args) {

        int num1=10;
        int num2=20;
        int temp;
        System.out.println(num1);
        System.out.println(num2);
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println(num1);
        System.out.println(num2);


    }
}
