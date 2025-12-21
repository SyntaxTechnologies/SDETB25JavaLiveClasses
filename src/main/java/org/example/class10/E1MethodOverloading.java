package org.example.class10;

public class E1MethodOverloading {


    void print(){
        System.out.println("Hello");
    }

    void print(String word){
        System.out.println();
    }

    void print(String word1,String word2){
        System.out.println();
    }

    void print(String word1,String word2,String word){
        System.out.println();
    }

    void print(char letter){
        System.out.println();
    }

    void print(int number){
        System.out.println();
    }

    void print(String word,double number){
        System.out.println(word+" "+number);
    }

    void print(double number, String word){
        System.out.println(word+" "+number);
    }

}
