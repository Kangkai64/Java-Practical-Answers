package Practical2Q3;

public class UnitConversion {
    private double centimeterValue;
    private double inchesValue;

    UnitConversion(double input){
        inchToCentimeter(input);
        centimeterToInch(input);
    }
    void inchToCentimeter(double input){
        this.centimeterValue = input * 2.54;
    }

    void centimeterToInch(double input){
        this.inchesValue = input / 2.54;
    }

    public double getCentimeterValue(){
        return this.centimeterValue;
    }

    public double getInchesValue(){
        return this.inchesValue;
    }
}
