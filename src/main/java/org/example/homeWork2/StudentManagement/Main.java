package org.example.homeWork2.StudentManagement;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        manager.addStudent(new Student("Иван", 1));
        manager.addStudent(new Student("Мария", 2));
        manager.addStudent(new Student("Петр", 3));

        System.out.println("Все студенты:");
        manager.getAllStudents().forEach(System.out::println);

        int idToRemove = 2;
        boolean removed = manager.removeStudentById(idToRemove);

        if (removed) {
            System.out.println("После удаления студента с ID " + idToRemove + ":");
        } else {
            System.out.println("Студент с ID " + idToRemove + " не найден.");
        }

        manager.getAllStudents().forEach(System.out::println);
    }
}