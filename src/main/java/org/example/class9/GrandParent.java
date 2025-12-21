package org.example.class9;

public class GrandParent {
    String name;
    void printName(){
        System.out.println("GrandParent Name: "+name);
    }
}

class Parent extends GrandParent{

}
class Child extends Parent{

}
class GrandChild extends Child{

}
class parentTester{
    public static void main(String[] args) {

        GrandChild gc=new GrandChild();
        gc.name="John";
        gc.printName();
    }
}