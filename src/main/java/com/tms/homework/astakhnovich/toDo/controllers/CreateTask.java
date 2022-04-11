package com.tms.homework.astakhnovich.toDo.controllers;

import com.tms.homework.astakhnovich.toDo.model.Task;
import com.tms.homework.astakhnovich.toDo.taskRepo.TaskRepo;

import java.util.Scanner;

public class CreateTask {
    private TaskRepo taskRepo = new TaskRepo();
    private Task newTask;

    public void taskMenu(){
        System.out.println("Меню: " +
                "\n 1 - создать новую задачу; " +
                "\n 2 - посмотреть текущие задачи; " +
                "\n 3 - поставить отметку о выполнении;");

        switch (validationInput()) {
            case "1" -> createNewTask();
            case "2" -> taskLists();
            case "3" -> isBol();
            case "0" -> taskMenu();
        }
    }

    public void createNewTask(){
        System.out.print("Введите заголовок: ");
        String header = validationInput();
        System.out.print("Введите задачу: ");
        String text = validationInput();
        newTask = new Task(header, text, false);
        taskRepo.addTaskToRepo(newTask);

        taskRepo.getHashTasks()
                .forEach((k,v) -> System.out.println(v));
    }

    public void taskLists(){
    }

    public void isBol(){
    }

    public String validationInput(){
        String text;
        try{
            Scanner scanner = new Scanner(System.in);
            text = scanner.nextLine();
            text = text.trim();
            System.out.println(text);
        }catch (Exception e){
            System.out.println("Ошибка ввода");
            text = "0";
        }
        return text;
    }
}
