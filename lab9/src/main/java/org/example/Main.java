package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Employee> employees = new HashMap<>();

        employees.put("Алексей", new Manager("Алексей"));
        employees.put("Мария", new Engineer("Мария"));
        employees.put("Иван", new Intern("Иван"));

        System.out.println("Список сотрудников:");
        for (String name : employees.keySet()) {
            System.out.println(name);
        }

        System.out.println("Список сотрудников:");
        for (Employee employee: employees.values()) {
            System.out.println(employee);
        }
    }
}
