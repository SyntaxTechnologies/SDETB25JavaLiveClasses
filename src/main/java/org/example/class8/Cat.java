package org.example.class8;

public class Cat {
    private String name;
    private String color;
    private int age;
    private double weight;

    Cat(String name,String color,int age,double weight){
    this.name=name;
    this.color=color;
    this.age=age;
    this.weight=weight;
    }

    void printName(){
        System.out.println(name);
    }

    void printInfo(){
        System.out.println(name);
        System.out.println(color);
        System.out.println(age);
        System.out.println(weight);
    }
}
