package org.example.task_1.Student;

import org.example.task_1.Printable;

public class Student implements Printable {
    private String studentName;
    private int studentGradeBookNumber;
    private double studentAverageScore;

    public void setStudentName(String setStudentName){
        this.studentName = setStudentName;

    }

    public void setStudentGradeBookNumber(int studentGradeBookNumber){
        this.studentGradeBookNumber = studentGradeBookNumber;
    }

    public void setStudentAverageScore(double studentAverageScore) {
        this.studentAverageScore = studentAverageScore;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getStudentAverageScore() {
        return studentAverageScore;
    }

    public int getStudentGradeBookNumber() {
        return studentGradeBookNumber;
    }

    @Override
    public void print() {
        System.out.println("Student's name: " + studentName + "\n" +
                "Student's Grade Book Number: " + studentGradeBookNumber + "\n" +
                "Student's Average Score: " + studentAverageScore + "\n");
    }
}
