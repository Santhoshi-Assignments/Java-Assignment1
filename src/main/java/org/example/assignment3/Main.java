package org.example.assignment3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Anika", 50000, "Java"));
        employees.add(new Employee(2, "Marc", 60000, "React"));
        employees.add(new Employee(3, "Bobbin", 55000, "Angular"));
        employees.add(new Employee(4, "Kevin", 52000, "Python"));

        try {
            Employee pythonEmployee = findEmployeeWithSkill(employees, "Python")
                  .orElseThrow(() -> new Exception("No employee with skill Python found"));
            System.out.println("Employee with Python skill found: " + pythonEmployee.getName());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static Optional<Employee> findEmployeeWithSkill(List<Employee> employees, String skill) {
        return employees.stream()
                .filter(employee -> employee.getSkill().equals(skill))
                .findFirst();
    }
}
