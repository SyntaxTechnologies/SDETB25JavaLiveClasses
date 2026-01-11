package org.example.project2;
/*
Create a method to count how many vowels are present
in a string “documentation”
 */
public class Q6 {
    public static void main(String[] args) {

        String s="computer";
        String vowels=s.replaceAll("[^aeiouAEIOU]","");
        System.out.println(vowels);
        System.out.println(vowels.length());
    }
}
