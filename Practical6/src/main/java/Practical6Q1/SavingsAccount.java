package Practical6Q1;

public class SavingsAccount extends Account {

    SavingsAccount() {
        super();
    }

    public void calculateInterest(double interestRate) {
        setBalance(getBalance() + getBalance() * interestRate / 100.0);

        printAccountBalance();
    }
}
