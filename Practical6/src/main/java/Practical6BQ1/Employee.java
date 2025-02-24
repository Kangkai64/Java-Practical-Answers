package Practical6BQ1;

import Practical6Q1.Account;

public class Employee {
    private String name;
    private int yearJoined;
    private double basicSalary;

    Employee(String name, int yearJoined, double basicSalary) {
        this.name = name;
        this.yearJoined = yearJoined;
        this.basicSalary = basicSalary;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearJoined() {
        return this.yearJoined;
    }

    public void setYearJoined(int yearJoined) {
        this.yearJoined = yearJoined;
    }

    public double getBasicSalary() {
        return this.basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double calculateSalary() {
        return this.basicSalary;
    }

    @Override
    public String toString() {
        return "Employee name: " + this.name + "\nYear Joined: " + this.yearJoined +
                "\nBasic Salary: RM " + this.basicSalary;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Employee other = (Employee) obj;
        return this.name.equals(other.name);
    }
}
