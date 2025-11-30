package org.example.project1;
/*
Create a program that uses an array to store the names of five fruits,
and then uses a loop to print each fruit name on a new line.
 */
public class Q1 {
    public static void main(String[] args) {

        String [] fruits= {"Orange","Mango","Kiwi","Banana","Apple"};

        for(String fruit:fruits)
        {
            System.out.println(fruit);
        }
    }
}
