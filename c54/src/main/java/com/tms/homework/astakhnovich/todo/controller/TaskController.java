package com.tms.homework.astakhnovich.todo.controller;

import com.tms.homework.astakhnovich.todo.model.Task;
import com.tms.homework.astakhnovich.todo.taskRepo.TaskRepo;

import java.util.Scanner;

public class TaskController {
    Task newTask;
    TaskRepo taskRepo = new TaskRepo();

    public void taskMenu() {
        System.out.println("\nMenu: " +
                "\n 1 - create a new task; " +
                "\n 2 - view current tasks; " +
                "\n 3 - mark completion; " +
                "\n 4 - delete task; " +
                "\n q - exit");


        String number = validationInput();
        if (number.equals("1") || number.equals("2") || number.equals("3") || number.equals("4") || number.equals("q")) {
            switch (number) {
                case "1" -> createNewTask();
                case "2" -> taskList();
                case "3" -> isСompleted();
                case "4" -> deleteFromeUser();
                case "q" -> exitАpplication();
            }
        } else {
            taskMenu();
        }
    }

    public void createNewTask() {
        System.out.print("Enter header: ");
        String header = validationInput();

        System.out.print("Enter task: ");
        String taskText = validationInput();

        newTask = new Task(header, taskText, false);
        System.out.println("\nNew task:" + newTask + "\n\nSave? 1 - yes, 2 - no");

        String input = validationInput();

        if (input.equals("1")) {
            saveTask();
        } else {
            taskMenu();
        }
    }

    public void saveTask() {
        System.out.println("Saving...");
        if (taskRepo.addTaskToRepo(newTask)) {
            System.out.println("Saved");
            taskMenu();
        } else {
            System.out.println("Save error");
            taskMenu();
        }
    }

    public void taskList() {
        System.out.println("Current tasks:");
        taskRepo.getTasksList()
                .forEach(System.out::println);
        taskMenu();
    }

    public void isСompleted() {
        System.out.println("\n Select a task to mark as done");
        showHeader();
        int choice = Integer.parseInt(validationInput()) - 1;

        for (int i = 0; i < taskRepo.getTasksList().size(); i++) {
            if (i == choice) {
                taskRepo.getTasksList().get(i).setDoneTrue();
                taskRepo.serializeToJson();
                System.out.println("\n The task " + taskRepo.getTasksList().get(i).getHeader() + " is completed!");
                break;
            }
        }
        System.out.println("Do you want to delete task? 1 - yes; 2 - no");

        String deleteChoice = validationInput();
        if (deleteChoice.equals("1")) {
            if (deleteTask(choice)) {
                taskRepo.serializeToJson();
                System.out.println("Deleted successfully");
            } else {
                System.out.println("Delete error");
            }
        }
        taskMenu();
    }

    public void deleteFromeUser() {
        System.out.println("\nSelect the task to delete");
        showHeader();
        int choice = Integer.parseInt(validationInput()) - 1;

        for (int i = 0; i < taskRepo.getTasksList().size(); i++) {
            if (i == choice && deleteTask(choice)) {
                taskRepo.serializeToJson();
                System.out.println("Deleted successfully");
                break;
            }
        }
        taskMenu();
    }

    public void showHeader() {
        for (int i = 1; i <= taskRepo.getTasksList().size(); i++) {
            String header = taskRepo.getTasksList().get(i - 1).getHeader();
            System.out.println(i + ". " + header);
        }
    }

    public boolean deleteTask(int choice) {
        for (int i = 0; i < taskRepo.getTasksList().size(); i++) {
            if (i == choice) {
                taskRepo.getTasksList().remove(i);
                taskRepo.deleteTask();
                taskRepo.serializeToJson();
                return true;
            }
        }
        return false;
    }

    public static String validationInput() {
        String text;
        try {
            Scanner scanner = new Scanner(System.in);
            text = scanner.nextLine();
            text = text.trim();
        } catch (Exception e) {
            System.out.println("Input Error");
            text = "";
        }
        return text;
    }

    private static void exitАpplication() {
    }
}

