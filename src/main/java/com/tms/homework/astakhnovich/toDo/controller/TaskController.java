package com.tms.homework.astakhnovich.toDo.controller;

import com.tms.homework.astakhnovich.toDo.model.Task;
import com.tms.homework.astakhnovich.toDo.taskRepo.TaskRepo;
import java.util.Objects;
import java.util.Scanner;

public class TaskController {
    Task newTask;
    TaskRepo taskRepo = new TaskRepo();

    public void taskMenu(){
        System.out.println("\nМеню: " +
                "\n 1 - create a new task; " +
                "\n 2 - view current tasks; " +
                "\n 3 - mark completion;");

        String number = validationInput();
        if(number.equals("1") || number.equals("2") || number.equals("3")){
            switch (number) {
                case "1" -> createNewTask();
                case "2" -> taskList();
                case "3" -> isBol();
            }
        }else{
            taskMenu();
        }
    }

    public void createNewTask(){
        System.out.print("Enter header: ");
        String header = validationInput();

        System.out.print("Enter task: ");
        String taskText = validationInput();

        newTask = new Task(header, taskText, false);
        System.out.println("\nNew task:" + newTask + "\n\nSave? 1 - yes, 2 - no");

        String input = validationInput();
        if (input.equals("1")){
            saveTask();
        }else{
            taskMenu();
        }
    }

    public void  saveTask(){
        System.out.println("Saveing...");
        if(taskRepo.addTaskToRepo(newTask)){
            System.out.println("Saved\n");
            taskMenu();
        }else{
            System.out.println("Save error");
            taskMenu();
        }
    }


    public void taskList(){
        System.out.println("Current tasks:");
        taskRepo.getTasksList()
                .forEach(System.out::println);
        taskMenu();
    }

    public void isBol(){
        System.out.println("Select a task to mark as done");
        for (int i = 1; i <= taskRepo.getTasksList().size(); i++){
            String header = taskRepo.getTasksList().get(i-1).getHeader();
            System.out.println(i + ". " + header);
        }
        int choice = Integer.parseInt(validationInput()) - 1;
        System.out.println(choice);

        for (int i = 0; i < taskRepo.getTasksList().size(); i++){
            if(i == choice){
                taskRepo.getTasksList().get(i).setDoneTrue();
                taskRepo.serializeToJson();
            }
        }
    }

    public static String validationInput(){
        String text;
        try{
            Scanner scanner = new Scanner(System.in);
            text = scanner.nextLine();
            text = text.trim();
        }catch (Exception e){
            System.out.println("Input Error");
            text = "";
        }
        return text;
    }
}