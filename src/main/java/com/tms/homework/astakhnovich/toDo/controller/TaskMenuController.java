package com.tms.homework.astakhnovich.toDo.controller;

import com.tms.homework.astakhnovich.toDo.model.Task;
import com.tms.homework.astakhnovich.toDo.taskRepo.TaskRepo;

import java.util.Objects;
import java.util.Scanner;

public class TaskMenuController {
    Task newTask;

    public void taskMenu(){
        System.out.println("Меню: " +
                "\n 1 - создать новую задачу; " +
                "\n 2 - посмотреть текущие задачи; " +
                "\n 3 - поставить отметку о выполнении;");

        String number = validationInput();
        if(number.equals("1") || number.equals("2") || number.equals("3")){
            switch (number) {
                case "1" -> createNewTask();
                case "2" -> taskLists();
                case "3" -> isBol();
            }
        }else{
            taskMenu();
        }

    }

    public void createNewTask(){
        System.out.print("Введите заголовок: ");
        String header = validationInput();

        System.out.print("Введите задачу: ");
        String text = validationInput();

        newTask = new Task(header, text, false);

        System.out.println("\nНовая задача:" + newTask + "\n Coхранить? 1 - да, 2 - нет");

        String input = validationInput();
        if (input.equals("1")){
            saveTask();
        }else{
            taskMenu();
        }
    }

    public void  saveTask(){
        System.out.println("Сохраненние...");
          boolean flag = TaskRepo.addTaskToRepo(newTask);
        if(flag){
            System.out.println("Сохранено\n");
            taskMenu();
        }else{
            System.out.println("Ошибка сохранения");
        }
    }


    public void taskLists(){
        System.out.println("Текущие задачи:");
        Objects.requireNonNull(TaskRepo.getTasksList())
                .forEach(System.out::println);
    }

    public void isBol(){
    }

    public static String validationInput(){
        String text;
        try{
            Scanner scanner = new Scanner(System.in);
            text = scanner.nextLine();
            text = text.trim();
        }catch (Exception e){
            System.out.println("Ошибка ввода");
            text = "";
        }
        return text;
    }
}
