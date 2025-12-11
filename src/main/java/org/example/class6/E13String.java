package org.example.class6;

public class E13String {
    public static void main(String[] args) {

        // String s = new String("Batch25");
        String s = "Batch 25 is good%#$R^#%^@";
        String newStr=s.replaceAll("[a-z]","*");
        System.out.println(newStr);
        System.out.println(s.replaceAll("[A-Z]","*"));
        System.out.println(s.replaceAll("[0-9]","*"));
        System.out.println(s.replaceAll("[a-z0-9]","*"));
        System.out.println(s.replaceAll("[a-zA-Z0-9]","*"));
        System.out.println(s.replaceAll("[^a-zA-Z0-9]","*"));
        System.out.println(s.replaceAll("[^a-zA-Z0-9]",""));

    }
}
