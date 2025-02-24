package Practical7Q1;

public class InpatientBill extends PatientBill {
    private double specialistCharges;
    private static double labCharges = 50.0;
    private RoomType roomType;
    private int durationOfStay;

    public enum RoomType{
        S,
        P
    };

    InpatientBill(String visitId, String name, double specialistCharges, RoomType roomType, int durationOfStay) {
        this.visitId = visitId;
        this.name = name;
        this.specialistCharges = specialistCharges;
        this.roomType = roomType;
        this.durationOfStay = durationOfStay;
    }

    public double getRoomRate(RoomType type) {
        return switch (type) {
            case S -> 100.0;
            case P -> 200.0;
        };
    }

    @Override
    public double calculateTotalCharge(){
        return this.specialistCharges + labCharges + getRoomRate(this.roomType) * this.durationOfStay;
    }

    @Override
    public void printBill() {
        System.out.printf("""
                
                Visit ID: %s
                Name: %s
                Specialist Charges: RM %.2f\
                
                Lab Charges: RM %.2f
                Room Type: %s
                Duration of Stay: %d
                Total Charge: RM %.2f
                """,
                this.visitId,
                this.name,
                this.specialistCharges,
                labCharges,
                this.roomType,
                this.durationOfStay,
                this.calculateTotalCharge());
    }
}
