package Practical7Q1;

public abstract class PatientBill {
    protected String visitId;
    protected String name;

    public abstract double calculateTotalCharge();

    public abstract void printBill();
}
