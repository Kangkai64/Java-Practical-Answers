package Practical6Q1;

import java.time.LocalDate;

public class Account {
    private static long accountNumberCounter = 10000000;
    private long accountNumber;
    private double balance;
    private String dateCreated;

    Account() {
        accountNumberCounter++;
        this.accountNumber = accountNumberCounter;
        this.balance = 0.0;
        this.dateCreated = LocalDate.now().toString();
    }

    public void deposit(double amount) {
        this.balance += amount;

        printAccountBalance();
    }

    public void withdrawal(double amount) {
        if (amount < this.balance) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }

        printAccountBalance();
    }

    public void printAccountBalance() {
        System.out.println("Current account balance: " + this.getBalance());
    }

    public long getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getDateCreated() {
        return this.dateCreated;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString(){
        return "Account Number: " + this.getAccountNumber() + "\nBalance: " + this.getBalance()
                + "\nDate Created: " + this.getDateCreated();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Account other = (Account) obj;
        return this.accountNumber == other.accountNumber;
    }
}
