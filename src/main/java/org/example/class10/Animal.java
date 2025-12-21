package org.example.class10;

public class Animal {
    String name;
    String color;
    int age;
    void printName(){
        System.out.println(name);
    }
    void printInfo(){
        System.out.println(name+" "+color+" "+age);
    }
}

class Dog extends Animal{

    void bark(){
        System.out.println("Wuff Wuff");
    }
}

class Cat extends Animal{

    void meow(){
        System.out.println("meow meow.....");
    }
}
