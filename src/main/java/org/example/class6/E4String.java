package org.example.class6;

public class E4String {
    public static void main(String[] args) {

        // String s = new String("Batch25");
        String s = "     ";

        boolean answer = s.isEmpty();
        boolean answer1 = s.isBlank();
        int len=s.length();
        System.out.println(answer);
        System.out.println(answer1);
        System.out.println(len);

        if(s.isEmpty()){
            System.out.println("The String is empty");
        }else{
            System.out.println("There is something in the String");
        }


    }
}
