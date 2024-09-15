package org.example.homeWork1.Student;

public class StudentDemo {
    public static void main(String[] args) {
        Student student = new Student("Иван Иванов", "12345", 4.5);
        student.setName("Петр Петров");
        student.setStudentId("67890");
        student.setAverageGrade(4.8);
        student.print();
    }
}