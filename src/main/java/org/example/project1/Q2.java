package org.example.project1;
/*
Create an array of five integer values. After the array is created,
use a loop to calculate and print the average of all the elements.
 */
public class Q2 {
    public static void main(String[] args) {

        int [] values={10,20,30,40,51};
        double sum=0;
        for(int value:values)
        {
            sum=sum+value;
        }
        System.out.println(sum/ values.length);

    }
}
