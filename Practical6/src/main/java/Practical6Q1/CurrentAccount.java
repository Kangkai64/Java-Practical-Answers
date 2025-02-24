package Practical6Q1;

public class CurrentAccount extends Account {
    private int freeTransactions = 3;
    private final static double TRANSACTION_FEE = 20.00;

    CurrentAccount() {
        super();
    }

    @Override
    public void withdrawal(double amount) {
        if (freeTransactions > 0) {
            super.withdrawal(amount);
            freeTransactions--;
        } else {
            super.withdrawal(amount);
            this.setBalance(this.getBalance() - TRANSACTION_FEE);
        }

        printAccountBalance();
    }

    public int getFreeTransactions() {
        return this.freeTransactions;
    }

    public void setFreeTransactions(int freeTransactions) {
        this.freeTransactions = freeTransactions;
    }

    @Override
    public String toString(){
        return super.toString() + "\nFree Transactions: " + this.freeTransactions;
    }
}
