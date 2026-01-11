package org.example.project2;

/*
Find out how many alpha characters are present in a string?
 */


public class Q2 {
    public static void main(String[] args) {

        String s = "sdfsneu2dfd32#dfd$%#dfe"; //"sdfsneudfddfddfe".length()
        s = s.replaceAll("[^a-zA-Z]","");
        System.out.println(s);
        System.out.println(s.length());

    }
}
