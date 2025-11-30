package org.example.class5;

public class E2LoopsAndArrays {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 45, 66, 12, 88, 95, 1, 5, 1, 4};

        for (int i = numbers.length-1; i>=0 ; i--) {
            System.out.print(numbers[i]+" ");
        }
        for (int n:numbers){
            System.out.println(n);
        }

    }

}
