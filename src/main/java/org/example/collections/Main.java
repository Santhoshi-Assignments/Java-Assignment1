package org.example.collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("001", "Marc Andre","ABC",50000);
        Employee employee2 = new Employee("002", "Kelvin", "XYZ", 20000);
        Employee employee3 = new Employee("003", "Emma Watson", "PQR", 30000);
        Employee employee4 = new Employee("004", "John Smith", "DEF", 10000);

        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);

        Set<String> employeeIDs = new HashSet<>();
        for (Employee emp : employees) {
            employeeIDs.add(emp.getId());
        }

        List<String> sortedEmployeeIDs = new ArrayList<>(employeeIDs);
        Collections.sort(sortedEmployeeIDs, Collections.reverseOrder());

        Map<String, Employee> employeeMap = new HashMap<>();
        for (Employee emp : employees) {
            employeeMap.put(emp.getId(), emp);
        }

        for (String id : sortedEmployeeIDs) {
            Employee emp = employeeMap.get(id);
            if (emp != null) {
                emp.printDetails();
            }
        }
    }
}

