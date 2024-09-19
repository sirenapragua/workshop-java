package org.example.homeWork2.StudentManagement;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private ArrayList<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public boolean removeStudentById(int id) {
        return students.removeIf(student -> student.getId() == id);
    }

    public List<Student> getAllStudents() {
        return new ArrayList<>(students);
    }
}