package Practical7Q1;

public class Main {
    public static void main(String[] args) {
        PatientBill[] patientBill = new PatientBill[4];

        patientBill[0] = new OutpatientBill("V001", "John", 100.0);
        patientBill[1] = new OutpatientBill("V002", "Jane", 200.0);
        patientBill[2] = new InpatientBill("V003", "Jack", 300.0, InpatientBill.RoomType.S, 2);
        patientBill[3] = new InpatientBill("V004", "Jane", 400.0, InpatientBill.RoomType.P, 3);

        for(PatientBill patientBillMain : patientBill){
            patientBillMain.printBill();
        }

        System.out.printf("\nGrand Total: %.2f", computeTotalCollection(patientBill));
    }

    public static double computeTotalCollection(PatientBill[] patientBill) {
        double grandTotal = 0;
        for (PatientBill patientBillTotal : patientBill) {
            grandTotal += patientBillTotal.calculateTotalCharge();
        }

        return grandTotal;
    }
}