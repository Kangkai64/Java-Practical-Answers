package Practical1Q3;

public class CreditCard {
    private String creditCardNumber;
    private long creditCardNumberLong;
    private String expiryDate;
    private boolean validCardNumber;

    CreditCard(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
        checkCreditCardNumber(this.creditCardNumber);
    }

    CreditCard(long creditCardNumber) {
        this.creditCardNumberLong = creditCardNumber;
        checkCreditCardNumber(this.creditCardNumberLong);
    }

    public void checkCreditCardNumber(String creditCardNumber) {
        int length = creditCardNumber.length();
        int checkSum = 0;
        boolean even = false;

        // Traverse from the last digit (right to left)
        for (int index = length - 1; index >= 0; index--) {
            int digit = creditCardNumber.charAt(index) - '0'; // Convert char to int
            if (index % 2 == 1) {
                checkSum += digit;
            } else {
                checkSum += generateCheckSum2(digit);
            }
        }

        this.validCardNumber = checkSum % 10 == 0;
    }

    public void checkCreditCardNumber(long creditCardNumber) {
        int checkSum = 0;
        int doubleDigit;
        boolean even = true;
        long bufferCreditCardNumber = creditCardNumber;

        while (creditCardNumber % 10 != 0) {
            if (even){
                checkSum += (int) (creditCardNumber % 10);
                creditCardNumber /= 10;
                even = false;
            } else {
                doubleDigit = (int) (creditCardNumber % 10 * 2);
                checkSum += doubleDigit % 10 + doubleDigit / 10;
                creditCardNumber /= 10;
                even = true;
            }
        }

        this.validCardNumber = checkSum % 10 == 0;
        if (!this.validCardNumber) {
            int correctDigit = (int) (bufferCreditCardNumber - checkSum) % 10;
            System.out.println("The last digit should be " + correctDigit);
        }
    }

    public int generateCheckSum2(int digit) {
        int digitDouble = digit * 2;
        return digitDouble % 10 + digitDouble / 10;
    }

    public boolean getValidCardNumber() {
        return validCardNumber;
    }
}
