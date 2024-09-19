package org.example.homeWork2.TaskManager;

import java.util.ArrayList;
import java.util.Comparator;

public class TaskManager {
    private ArrayList<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public boolean removeTask(Task task) {
        return tasks.remove(task);
    }

    public void sortByPriority() {
        tasks.sort(Comparator.comparingInt(Task::getPriority));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TaskManager:\n");
        for (Task task : tasks) {
            sb.append(task).append("\n");
        }
        return sb.toString();
    }
}