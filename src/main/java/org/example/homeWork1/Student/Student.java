package org.example.homeWork1.Student;

public class Student implements Printable {
    private String name;
    private String studentId;
    private double averageGrade;


    public Student(String name, String studentId, double averageGrade) {
        this.name = name;
        this.studentId = studentId;
        this.averageGrade = averageGrade;
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public void print() {
        System.out.println("Имя студента: " + name);
        System.out.println("Номер зачётной книжки: " + studentId);
        System.out.println("Средний балл: " + averageGrade);
    }
}