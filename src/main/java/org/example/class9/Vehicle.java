package org.example.class9;

public class Vehicle {
    String color;
    String model;
    int year;
    void startEngine() {
        System.out.println("Vehicle engine started");
    }
    void printInfo() {
        System.out.println("Model: " + model + ", Year: " + year + ", Color: " + color);
    }
}

class Car extends Vehicle{
    int numberOfDoors;
    int maxSpeed;
}