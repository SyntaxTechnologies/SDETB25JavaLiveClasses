package org.example.class9;

public class Animal {
    String name;
    String color;
    String breed;
    int age;
    double weight;
    char gender;
    void printName(){
        System.out.println(name);
    }
    void printInfo(){
        System.out.println("Name: "+name+", Color: "+color+", Breed: "+breed+", Age: "+age+", Weight: "+weight);
    }
}

class Cat extends Animal {
    void meow(){
        System.out.println("Meowww!");
    }
}
class Dog extends Animal {
    void bark(){
        System.out.println("Woof Woof!");
    }
}

class Camel extends Animal{

    void grunt(){
        System.out.println("Grunt Grunt!");
    }
}