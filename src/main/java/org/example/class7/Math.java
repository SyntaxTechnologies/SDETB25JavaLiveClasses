package org.example.class7;

public class Math {

    void add(int num1, int num2){
        System.out.println(num1+num2);
    }

    void multiply(int num1,int num2,int num3){
        System.out.println(num1*num2*num3);
    }

    void getAvg(double num1,double num2){
        double sum=num1+num2;
        double avg=sum/2;
        System.out.println("The Average is "+avg);

    }

    void print(int freq,String word){

        for (int i = 0; i < freq; i++) {
            System.out.println(word);
        }
    }



  void printArray(int [] arr){
        for (int a:arr){
            System.out.println(a);
        }
  }

  int addArray(int [] arr){
      int sum=0;
      int num1;
      int num3;
      for(int a:arr){
          sum=sum+a;
      }

      return sum;
  }



}
