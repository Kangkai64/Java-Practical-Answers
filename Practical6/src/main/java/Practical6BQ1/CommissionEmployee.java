package Practical6BQ1;

public class CommissionEmployee extends Employee {
    private double grossSale;
    private double commissionRate;

    CommissionEmployee(String name, int yearJoined, double basicSalary, double grossSale, double commissionRate) {
        super(name, yearJoined, basicSalary);
        this.grossSale = grossSale;
        this.commissionRate = commissionRate;
    }

    public double getGrossSale() {
        return grossSale;
    }

    public void setGrossSale(double grossSale){
        this.grossSale = grossSale;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate){
        this.commissionRate = commissionRate;
    }

    @Override
    public double calculateSalary() {
        return this.getBasicSalary() + grossSale * commissionRate / 100.0;
    }

    @Override
    public String toString() {
        return super.toString() + "\nGross Sale: RM " + this.grossSale + "\nCommission Rate: RM " +
                this.getCommissionRate();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        CommissionEmployee other = (CommissionEmployee) obj;
        return this.getName().equals(other.getName());
    }
}
