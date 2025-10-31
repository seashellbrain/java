package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Firm {
    private String name;
    private final List<Department> departments = new ArrayList<>();

    public Firm(String name) {
        this.name = name;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public void addDepartment(Department d) {
        if (d != null) departments.add(d);
    }

    public List<Department> getDepartments() {
        return Collections.unmodifiableList(departments);
    }
}
