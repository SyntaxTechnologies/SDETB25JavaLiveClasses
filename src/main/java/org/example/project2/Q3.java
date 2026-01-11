package org.example.project2;
/*
Reverse a String: Write a function to reverse a given string.
For example, given the input "Hello", the output should be "olleH"
 */
public class Q3 {
    public static void main(String[] args) {

        String str="Hello";
        String reversedStr=reverseString(str);
        System.out.println(reversedStr);
    }


    public static String reverseString(String inputStr){

        String reversedStr="";
        for (int i = inputStr.length()-1; i>=0 ; i--) {

            reversedStr=reversedStr+inputStr.charAt(i);
        }
        return reversedStr;
    }

}
