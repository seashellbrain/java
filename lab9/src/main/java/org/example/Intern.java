package org.example;

public class Intern extends Employee {
    public Intern(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(name + " учится и помогает инженерам.");
    }
}
