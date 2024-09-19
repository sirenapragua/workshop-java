package org.example.homeWork2.TaskManager;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        Task task1 = new Task("Завершить проект", 3);
        Task task2 = new Task("Сходить в магазин", 1);
        Task task3 = new Task("Позвонить клиенту", 2);

        manager.addTask(task1);
        manager.addTask(task2);
        manager.addTask(task3);

        System.out.println("Начальный список задач:");
        System.out.println(manager);

        manager.sortByPriority();
        System.out.println("Список задач после сортировки по приоритету:");
        System.out.println(manager);

        manager.removeTask(task2);
        System.out.println("Список задач после удаления задачи 'Сходить в магазин':");
        System.out.println(manager);
    }
}