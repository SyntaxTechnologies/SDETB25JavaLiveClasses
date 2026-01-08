package org.example.class13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowVsThrows {

    void m1() throws FileNotFoundException,NullPointerException {
        FileInputStream fis=new FileInputStream("sdsd");
    }

    void m2(){
        System.out.println("Hello");
    }


    public static void main(String[] args) {

        ThrowVsThrows t=new ThrowVsThrows();
       try{
           t.m1();
       }catch (FileNotFoundException f){
           System.out.println("File not found");
       }

    }
}
