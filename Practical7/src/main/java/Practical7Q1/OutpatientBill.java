package Practical7Q1;

public class OutpatientBill extends PatientBill {
    private static double registrationFee = 30.0;
    private double consultationFee;

    OutpatientBill(String visitId, String name, double consultationFee) {
        this.visitId = visitId;
        this.name = name;
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateTotalCharge(){
        return registrationFee + this.consultationFee;
    }

    @Override
    public void printBill() {
        System.out.printf("""
                
                Visit ID: %s
                Name: %s
                Registration Fee: RM %.2f
                Consultation Fee: RM %.2f
                
                Total Charge: RM %.2f
                """,
                this.visitId,
                this.name,
                registrationFee,
                this.consultationFee,
                this.calculateTotalCharge());
    }
}
