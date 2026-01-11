package org.example.project2;
/*
Write a program to swap 2 String without a temporary variable?
 */
public class Q1 {
    public static void main(String[] args) {

        String s1="Roman";
        String s2="Musa";

        s1=s1+s2; //RomanMusa  s2="Musa"
        s2=s1.substring(0,s1.length()-s2.length());
        s1=s1.substring(s2.length());


        System.out.println("s1 "+s1);
        System.out.println("s2 "+s2);
    }
}
