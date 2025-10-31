package org.example;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Гав");
        Animal cat = new Cat("Мяу");

        dog.makeSound();
        cat.makeSound();
    }
}
