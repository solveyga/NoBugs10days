package org.example.task_1.Student;

public class Main {
    public static void main(String[] args) {
        Student student_test = new Student();
        student_test.setStudentName("Test student");
        student_test.setStudentGradeBookNumber(19876340);
        student_test.setStudentAverageScore(8.7);

        student_test.print();

    }
}
