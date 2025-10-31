package org.example;

public class Engineer extends Employee {
    public Engineer(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(name + " разрабатывает систему.");
    }
}
