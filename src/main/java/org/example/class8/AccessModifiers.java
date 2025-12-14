package org.example.class8;

public class AccessModifiers {
    private static int a = 10;
    static int b = 10;
    public static int c = 30;


  public static void print() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    private void printHello(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {

       print();
    }
}


