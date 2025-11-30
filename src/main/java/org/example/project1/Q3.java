package org.example.project1;

/*
Create an array to store the scores of six students in a class.
Use a loop to count and print how many scores are above 80.
 */


public class Q3 {
    public static void main(String[] args) {

        double [] scores={10,50,95,90.5,85.5,45};
        int count=0;
        for(double score:scores){

            if(score>80){
                count++; // count=count+1
            }
        }

        System.out.println(count);
    }
}
