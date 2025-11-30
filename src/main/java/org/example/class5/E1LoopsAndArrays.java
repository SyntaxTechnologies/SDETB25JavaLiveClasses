package org.example.class5;

public class E1LoopsAndArrays {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 45, 66, 12, 88, 95, 1, 5, 1, 4};

        System.out.println(numbers.length);

       /* for (int i = 0; i<numbers.length; i=i+2) {
            System.out.print(numbers[i]+" ");
        }*/

        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }

    }

}
