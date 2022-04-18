package com.tms.homework.astakhnovich.todo.controller;

import com.tms.homework.astakhnovich.todo.model.Task;
import com.tms.homework.astakhnovich.todo.taskRepo.TaskRepo;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class TaskController {
    private Task newTask;
    private TaskRepo taskRepo = new TaskRepo();
    private String [] selection = {"1","2","3","4","q"};


    public void taskMenu() {
        System.out.println("\nMenu: " +
                "\n 1 - create a new task; " +
                "\n 2 - view current tasks; " +
                "\n 3 - mark completion; " +
                "\n 4 - delete task; " +
                "\n q - exit");


        String number = validationInput();
        if (Arrays.asList(selection).contains(number)) {
            switch (number) {
                case "1" -> createNewTask();
                case "2" -> taskList();
                case "3" -> isСompleted();
                case "4" -> deleteFromUser();
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
        taskMenu();
    }

    public void deleteFromUser() {
        System.out.println("\nSelect the task to delete");
        showHeader();
        int choice = Integer.parseInt(validationInput()) - 1;
        if(deleteTask(choice)){
            System.out.println("deleted successfully");
        }else {
            System.out.println("deletion error");
        }
        taskMenu();
    }

    public void showHeader() {
        AtomicInteger i = new AtomicInteger(1);
        taskRepo.getTasksList().stream()
                .map(Task::getHeader)
                .forEach(v -> System.out.println(i.getAndIncrement() + ". " + v));
    }

    public boolean deleteTask(int choice) {
        for (int i = 0; i < taskRepo.getTasksList().size(); i++) {
            if (i == choice) {
                taskRepo.getTasksList().remove(i);
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