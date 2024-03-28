package org.example.assignment4;

public class Employee {
    private String name;
    private int age;
    private int experience;
    private double salary;
    private String department;

    public Employee(String name, int age, int experience, double salary, String department) {
        this.name = name;
        this.age = age;
        this.experience = experience;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getExperience() {
        return experience;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", experience=" + experience +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}


