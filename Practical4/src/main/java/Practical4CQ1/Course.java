package Practical4CQ1;

public class Course {
    private String courseTitle;
    private double feesPerStudent;
    private static int numberOfStudents = 0;
    private String[] studentNames = new String[100];
    private static int courseCount = 0;

    Course(String courseTitle, double feesPerStudent) {
        courseCount++;
        this.courseTitle = courseTitle;
        this.feesPerStudent = feesPerStudent;
    }

    public String getCourseTitle() {
        return this.courseTitle;
    }

    public double getFeesPerStudent() {
        return this.feesPerStudent;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String[] getStudentNames() {
        return this.studentNames;
    }

    public int getCourseCount() {
        return courseCount;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public void setFeesPerStudent(double feesPerStudent) {
        this.feesPerStudent = feesPerStudent;
    }

    public void setNumberOfStudents(int numberOfStudentsNew) {
        numberOfStudents = numberOfStudentsNew;
    }

    public void setStudentNames(String[] studentNames) {
        this.studentNames = studentNames;
    }

    public double calculateFeesCollected() {
        return (this.feesPerStudent * numberOfStudents);
    }

    public void addStudent(String studentName) {
        this.studentNames[numberOfStudents] = studentName;
        numberOfStudents++;
    }

    @Override
    public String toString() {
        return ("\nCourse title: " + this.courseTitle + "\n" + "Fees per student: " +
                this.feesPerStudent + "\n" + "Number of students enrolled: " + numberOfStudents);
    }
}
