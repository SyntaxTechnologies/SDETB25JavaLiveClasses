package org.example.class9;

public class Furniture {
    String color="Brown";
}
class Chair extends Furniture{
    String color="Black";

    void printColors(){
        String color="White";
        System.out.println(this.color);
    }
}

class FurnitureTester{
    public static void main(String[] args) {
        Chair c=new Chair();
        c.printColors();
    }
}