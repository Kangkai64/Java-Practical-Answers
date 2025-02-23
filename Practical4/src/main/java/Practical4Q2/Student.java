package Practical4Q2;

public class Student {
    private String studentID;
    private String name;
    private int numberOfQuizTaken;
    private int totalQuizScore;
    private double courseworkMark;

    Student(){

    }

    Student(String studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }

    public String getStudentID() {
        return this.studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfQuizTaken() {
        return this.numberOfQuizTaken;
    }

    public void setNumberOfQuizTaken(int numberOfQuizTaken) {
        this.numberOfQuizTaken = numberOfQuizTaken;
    }

    public int getTotalQuizScore() {
        return this.totalQuizScore;
    }

    public void setTotalQuizScore(int totalQuizScore) {
        this.totalQuizScore = totalQuizScore;
    }

    public double getCourseworkMark() {
        return this.courseworkMark * 0.2;
    }

    public void setCourseworkMark(int courseworkMark) {
        this.courseworkMark = courseworkMark;
    }

    public void addQuiz(int score) {
        this.totalQuizScore += score;
    }

    public double getAverageScore() {
        return this.totalQuizScore / (double) this.numberOfQuizTaken;
    }
}
