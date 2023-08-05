package org.wipro.pack;

public class Student {
    private int studentId;
    private String studentName;
    private double scienceMarks;
    private double mathMarks;
    private double totalMarks;
    private double averageMarks;

    public Student() {
    }

    public Student(int studentId, String studentName, double scienceMarks, double mathMarks, double totalMarks, double averageMarks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.scienceMarks = scienceMarks;
        this.mathMarks = mathMarks;
        this.totalMarks = totalMarks;
        this.averageMarks = averageMarks;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getScienceMarks() {
        return scienceMarks;
    }

    public void setScienceMarks(double scienceMarks) {
        this.scienceMarks = scienceMarks;
    }

    public double getMathMarks() {
        return mathMarks;
    }

    public void setMathMarks(double mathMarks) {
        this.mathMarks = mathMarks;
    }

    public double getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(double totalMarks) {
        this.totalMarks = totalMarks;
    }

    public double getAverageMarks() {
        return averageMarks;
    }

    public void setAverageMarks(double averageMarks) {
        this.averageMarks = averageMarks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", scienceMarks=" + scienceMarks +
                ", mathMarks=" + mathMarks +
                ", totalMarks=" + totalMarks +
                ", averageMarks=" + averageMarks +
                '}';
    }
}
