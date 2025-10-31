package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Department {
    private String name;
    private int employeeCount;
    private final List<Employee> employees = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getEmployeeCount() { return employeeCount; }
    public void setEmployeeCount(int employeeCount) { this.employeeCount = Math.max(0, employeeCount); }

    public void addEmployee(Employee e) {
        if (e != null) {
            employees.add(e);
            employeeCount = employees.size();
        }
    }

    public List<Employee> getEmployees() {
        return Collections.unmodifiableList(employees);
    }
}
