package org.example;

public abstract class Animal {
    String name;
    public abstract void makeSound();

    public Animal(String name) {
        this.name = name;
    }
}
