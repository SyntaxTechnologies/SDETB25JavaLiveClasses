package org.example.project2;
/*
Count the Number of Words in a String: Write a function to count the number of words
in a given string. Words are separated by spaces or punctuation. For example, the input
"Hello, world!" should return 2.
 */
public class Q7 {
    public static void main(String[] args) {

        String s="Hello, world!";
        int noOfWords=countWords(s);
        System.out.println(noOfWords);


    }

    public static int countWords(String inputStr){
        String[] wordsArray=inputStr.split("[.,?/s]");
        return wordsArray.length;
    }
}
