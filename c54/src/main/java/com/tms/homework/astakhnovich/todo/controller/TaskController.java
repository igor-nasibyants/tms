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
        System.out.println("\nSelect a task to mark as done\n");
        showHeader();
        int choice = Integer.parseInt(validationInput()) - 1;
        AtomicInteger i = new AtomicInteger(0);
        taskRepo.getTasksList().forEach(v -> {
            if (i.get() == choice) {
                taskRepo.getTasksList().get(i.get()).setDoneTrue();
                taskRepo.serializeToJson();
                System.out.println("\nThe task " + taskRepo.getTasksList().get(i.get()).getHeader() + " is completed!");
            }
            i.incrementAndGet();
        });
        taskMenu();
    }

    public void deleteFromUser() {
        System.out.println("\nSelect the task to delete");
        showHeader();
        int choice = Integer.parseInt(validationInput()) - 1;

        AtomicInteger i = new AtomicInteger(0);
        taskRepo.getTasksList().forEach(v -> {
            if (i.get() == choice) {
                taskRepo.getTasksList().remove(i.get());
                if(taskRepo.serializeToJson()) {
                    System.out.println("deleted successfully");
                }
            }
            i.incrementAndGet();
        });
        taskMenu();
    }

    public void showHeader() {
        AtomicInteger i = new AtomicInteger(1);
        taskRepo.getTasksList().stream()
                .map(Task::getHeader)
                .forEach(v -> System.out.println(i.getAndIncrement() + ". " + v));
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