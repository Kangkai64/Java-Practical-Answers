package Practical4BQ2;

public class Owner {
    private String ownerName;
    private long ownerICNumber;

    Owner(String ownerName, long ownerICNumber) {
        this.ownerName = ownerName;
        this.ownerICNumber = ownerICNumber;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public long getOwnerICNumber() {
        return this.ownerICNumber;
    }
}
