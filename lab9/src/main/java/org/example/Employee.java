package org.example;

public class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public void work() {
        System.out.println(name + " работает.");
    }

    @Override
    public String toString() {
        return "Сотрудник: " + name;
    }

}
