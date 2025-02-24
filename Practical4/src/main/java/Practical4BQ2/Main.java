package Practical4Q1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String employeeName;
        double currentSalary;
        Employee higherSalaryEmployee;

        System.out.println("Welcome to the Employee Payroll Calculator!");
        System.out.println("============================================");
        System.out.print("Enter your name: ");
        employeeName = scanner.nextLine();
        System.out.print("Enter your current salary: RM ");
        currentSalary = scanner.nextDouble();

        Employee employee1 = new Employee(employeeName, currentSalary);
        Employee employee2 = new Employee();

        System.out.println("============================================");
        System.out.println("Your name: " + employee1.getName());
        System.out.printf("Your current salary: RM %.2f", employee1.getSalary());
        employee1.raiseSalary(8);
        System.out.printf("\nYour salary after a raise of 8%%: RM %.2f", employee1.getSalary());
        System.out.println("\n============================================");

        if (employee1.getSalary() > employee2.getSalary()) {
            higherSalaryEmployee = employee1;
        } else {
            higherSalaryEmployee = employee2;
        }

        System.out.println("Employee with a higher salary: " + higherSalaryEmployee.getName());
        System.out.printf("The salary: RM %.2f ", higherSalaryEmployee.getSalary());
        System.out.println("\n============================================");
        System.out.printf("Total salary of the employees: RM %.2f ", (employee1.getSalary() + employee2.getSalary()));
        System.out.println("\n============================================");
    }
}