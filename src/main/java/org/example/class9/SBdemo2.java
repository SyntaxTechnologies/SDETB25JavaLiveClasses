package org.example.class9;

public class SBdemo2 {
    public static void main(String[] args) {
        //3050
        // sb 13ms
        long startTime = System.currentTimeMillis();
       //StringBuilder sb = new StringBuilder("Hello");
        String s = "Hello";
        for (int i = 0; i < 100000; i++) {

           // sb.append(i);
            s=s+i;

        }
        System.out.println(s);
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken by String: " + (endTime - startTime) + " ms");
    }
}
