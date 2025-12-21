package org.example.class9;

public class AnimalTester {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.name = "Whiskers";
        cat.color = "Gray";
        cat.breed = "Siamese";
        cat.age = 3;
        cat.weight = 8.5;
        cat.printName();
        cat.printInfo();
        cat.meow();

        Dog dog = new Dog();
        dog.name = "Buddy";
        dog.color = "Brown";
        dog.breed = "Labrador";
        dog.age = 5;
        dog.weight = 30.0;
        dog.gender='M';
        dog.printName();
        dog.printInfo();
        dog.bark();

    }
}
