package org.example.assignment3;

class Employee {
    private int id;
    private String name;
    private double salary;
    private String skill;

    public Employee(int id, String name, double salary, String skill) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.skill = skill;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getSkill() {
        return skill;
    }
}

