package org.example.class5;

public class E8NestedLoops {
    public static void main(String[] args) {

      int [] numbers={10,20,30};
      int [][] matrix={
              {10,20,30},
              {45,55,60},
              {99,56,33},
      };


      for (int row = 0; row < matrix.length ; row++) {

        for (int col = 0; col < matrix[row].length; col++) {
          System.out.print(matrix[row][col]+" ");
        }
        System.out.println();
      }


    }

}
