package Practical4BQ2;

public class Car {
    private static int registrationNumberCounter = 1001;
    private int registrationNumber;
    private String carPlateNumber;
    private String carBrand;
    private String carModel;
    private double carEngineCapacity;
    private String carColor;
    private int carYearManufactured;

    public enum Color{
        Blue,
        Red,
        Black,
        White,
        Green
    }

    public enum Brand{
        Toyota,
        Honda,
        Nissan
    }

    public enum Model{
        Vios,
        Teana,
        City
    }

    public Car(String carPlateNumber, String carBrand, String carModel, double carEngineCapacity, String carColor, int carYearManufactured) {
        this.registrationNumber = registrationNumberCounter++;
        this.carPlateNumber = carPlateNumber;
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carEngineCapacity = carEngineCapacity;
        this.carColor = carColor;
        this.carYearManufactured = carYearManufactured;
    }

    public int getRegistrationNumber() {
        return this.registrationNumber;
    }

    public String getCarPlateNumber() {
        return this.carPlateNumber;
    }

    public String getCarBrand() {
        return this.carBrand;
    }

    public String getCarModel() {
        return this.carModel;
    }

    public double getCarEngineCapacity() {
        return this.carEngineCapacity;
    }

    public String getCarColor() {
        return this.carColor;
    }

    public int getCarYearManufactured() {
        return this.carYearManufactured;
    }
}
