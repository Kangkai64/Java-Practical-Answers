package Practical4BQ2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String ownerName;
        long ownerICNumber;
        int numberOfCarsToRegister = 0;
        String carPlateNumber;
        int carBrandChoice;
        int carModelChoice;
        double carEngineCapacity;
        int carColorChoice;
        int carYearManufactured;

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWelcome to the Car Registration System by Road Transport Department");
        System.out.println("=====================================================================");
        System.out.print("Enter the number of cars to be registered: ");
        numberOfCarsToRegister = scanner.nextInt();
        scanner.nextLine();

        Car[] cars = new Car[numberOfCarsToRegister];
        Owner[] owners = new Owner[numberOfCarsToRegister];

        for (int index = 0; index < numberOfCarsToRegister; index++) {
            System.out.println("\nCar " + (index + 1));
            System.out.println("=================================================================");
            System.out.print("Enter the name of the owner: ");
            ownerName = scanner.nextLine();
            System.out.print("Enter the IC number of the owner: ");
            ownerICNumber = scanner.nextLong();
            scanner.nextLine();
            System.out.print("Enter the plate number of the car: ");
            carPlateNumber = scanner.nextLine();
            System.out.print("\n1.Toyota\n2.Honda\n3.Nissan\n");
            System.out.print("Enter the brand of the car: ");
            carBrandChoice = scanner.nextInt();
            System.out.print("\n1.Vios\n2.Teana\n3.City\n");
            System.out.print("Enter the model of the car: ");
            carModelChoice = scanner.nextInt();
            System.out.print("Enter the engine capacity of the car (L) : ");
            carEngineCapacity = scanner.nextDouble();
            System.out.print("\n1.Blue\n2.Red\n3.Black\n4.White\n5.Green\n");
            System.out.print("Enter the color of the car: ");
            carColorChoice = scanner.nextInt();
            System.out.print("Enter the year manufactured: ");
            carYearManufactured = scanner.nextInt();
            scanner.nextLine();

            owners[index] = new Owner(ownerName, ownerICNumber);
            cars[index] = new Car(carPlateNumber, Car.Brand.values()[carBrandChoice - 1].toString(),
                    Car.Model.values()[carModelChoice - 1].toString(), carEngineCapacity,
                    Car.Color.values()[carColorChoice - 1].toString(), carYearManufactured);
        }

        System.out.println("Car Registration Listing");
        System.out.println("===========================================================================================");
        System.out.println("Reg\t\t|Name\t\t\t|IC\t\t\t\t|Plate\t|Color\t|Year\t|Brand\t|Model\t|Capacity");
        System.out.println("===========================================================================================");
        for (int index = 0; index < numberOfCarsToRegister; index++) {
            System.out.printf("%4d\t|%s\t\t\t|%12d\t|%s\t|%s\t|%4d\t|%s\t|%s\t|%1.1f\n",
                    cars[index].getRegistrationNumber(),
                    owners[index].getOwnerName(),
                    owners[index].getOwnerICNumber(),
                    cars[index].getCarPlateNumber(),
                    cars[index].getCarColor(),
                    cars[index].getCarYearManufactured(),
                    cars[index].getCarBrand(),
                    cars[index].getCarModel(),
                    cars[index].getCarEngineCapacity());
        }
    }
}