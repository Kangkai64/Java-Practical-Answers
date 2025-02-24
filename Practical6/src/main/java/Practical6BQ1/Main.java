package Practical6BQ1;

public class Main {
    public static void main(String[] args) {
        Employee[] empArray = new Employee[3];

        empArray[0] = new Employee("John", 2000, 2000.0);
        empArray[1] = new CommissionEmployee("Ken", 2005, 2000.0, 1000.0, 20);
        empArray[2] = new Clerk("Susan", 2006, 2000.0, 1000, 4, 30.0);

        printElements(empArray);
    }

    public static void printElements(Employee[] empArray) {
        for (Employee emp : empArray) {
            System.out.println("\n" + emp.toString());
        }
    }
}