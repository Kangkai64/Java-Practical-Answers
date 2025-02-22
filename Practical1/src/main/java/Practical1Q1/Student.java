package Practical1Q1;

public class Student {
    private String name;
    private int yearOfStudy;
    private double GPA;
    
    Student(){};

    Student(String name, int yearOfStudy, double GPA) {
        this.name = name;
        this.yearOfStudy = yearOfStudy;
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public double getGPA() {
        return GPA;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
}
