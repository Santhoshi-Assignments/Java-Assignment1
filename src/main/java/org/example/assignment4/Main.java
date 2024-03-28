package org.example.assignment4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("John", 30, 5, 50000, "HR"),
                new Employee("Jahangir", 25, 3, 45000, "IT"),
                new Employee("Marc", 35, 8, 60000, "HR"),
                new Employee("Emma", 28, 6, 55000, "IT"),
                new Employee("Kevin", 40, 10, 70000, "Finance")
        );

        long totalEmployees = employees.size();
        System.out.println("Total number of employees: " + totalEmployees);

        Map<String, List<Employee>> employeesByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println("Employees by Department:");
        employeesByDepartment.forEach((department, empList) -> System.out.println(department + ": " + empList));

        double totalSalary = employees.stream().mapToDouble(Employee::getSalary).sum();
        System.out.println("Total salary paid to all employees: " + totalSalary);

        Map<String, Double> totalSalaryByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingDouble(Employee::getSalary)));
        System.out.println("Total salary paid to employees of each department:");
        totalSalaryByDepartment.forEach((department, salary) -> System.out.println(department + ": " + salary));

        List<Employee> sortedByAge = employees.stream()
                .sorted((e1, e2) -> Integer.compare(e1.getAge(), e2.getAge()))
                .collect(Collectors.toList());
        System.out.println("Employees sorted by age:");
        sortedByAge.forEach(System.out::println);

        List<Employee> sortedByExperience = employees.stream()
                .sorted((e1, e2) -> Integer.compare(e1.getExperience(), e2.getExperience()))
                .collect(Collectors.toList());
        System.out.println("Employees sorted by experience:");
        sortedByExperience.forEach(System.out::println);

        List<String> countries = Arrays.asList("United States", "United Kingdom", "Canada", "Australia", "South Africa");
        String countryWithLongestName = countries.stream()
                .reduce((country1, country2) -> country1.length() > country2.length() ? country1 : country2)
                .orElse(null);
        System.out.println("Country with the longest name: " + countryWithLongestName);
    }
}


