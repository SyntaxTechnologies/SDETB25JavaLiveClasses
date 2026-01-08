package org.example.class13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E2Exception {
    public static void main(String[] args) throws FileNotFoundException {


           FileInputStream fis = new FileInputStream("C:\\Users\\freek\\IdeaProjects\\SDETB25JavaLiveClasses\\Files\\Config.properties");


           int age=10;
           if(age<18){
           throw new RuntimeException("Vote cast exception");}
           else {
               System.out.println("All loooks good");
           }


    }
}
