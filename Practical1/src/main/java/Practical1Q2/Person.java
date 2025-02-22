package Practical1Q2;

public class Person {
    private int ageInYears;
    private int ageInDays;
    private long ageInSeconds;

    final int DAYS_PER_YEAR = 365;
    final int SECONDS_PER_DAY = 24 * 60 * 60;

    Person(int ageInYears) {
        this.ageInYears = ageInYears;
        this.ageInDays = this.ageInYears * DAYS_PER_YEAR + ageInDays;
        this.ageInSeconds = (long) this.ageInYears * DAYS_PER_YEAR * SECONDS_PER_DAY;
    }

    public int getAgeInYears() {
        return ageInYears;
    }

    public int getAgeInDays() {
        return ageInDays;
    }

    public long getAgeInSeconds() {
        return ageInSeconds;
    }

    public void setAgeInYears(int ageInYears) {
        this.ageInYears = ageInYears;
    }
}
