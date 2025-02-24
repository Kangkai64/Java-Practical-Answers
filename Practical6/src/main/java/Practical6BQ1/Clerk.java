package Practical6BQ1;

public class Clerk extends Employee {
    private double allowance;
    private int overtimeHours;
    private double overtimeRate;

    Clerk(String name, int yearJoined, double basicSalary, double allowance, int overtimeHours, double overtimeRate) {
        super(name, yearJoined, basicSalary);
        this.allowance = allowance;
        this.overtimeHours = overtimeHours;
        this.overtimeRate = overtimeRate;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public double getOvertimeRate() {
        return overtimeRate;
    }

    public void setOvertimeRate(double overtimeRate) {
        this.overtimeRate = overtimeRate;
    }

    @Override
    public double calculateSalary() {
        return this.getBasicSalary() + allowance + overtimeHours * overtimeRate;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAllowance: RM " + this.allowance + "\nOvertime Rate: RM " + this.overtimeRate
                + "\nOvertime Hours: " + this.overtimeHours;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Clerk other = (Clerk) obj;
        return this.getName().equals(other.getName());
    }
}
