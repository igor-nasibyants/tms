package com.tms.homework.han.todo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class TodoList implements UpdateTodo, ReadTodo, ConvertTodoToList {

    void createTodo() {
        Scanner scanner = new Scanner(System.in);
        TodoList todo = new TodoList();
        getMapTodo();
        System.out.println("Вы хотите создать ToDo лист? (yes, no)");
        switch (scanner.nextLine().toLowerCase()) {
            case "yes" -> {
                todo.createTodoFile();
                todo.readTodo();
            }
            case "no" -> {
                try {
                    if (Files.lines(Paths.get("todo-list.txt")).findAny().isPresent()) {
                        todo.readTodo();
                    }
                } catch (IOException e) {
                    System.out.println("Действующих задач нет");
                }
            }
            default -> System.out.println("Вы ввели не то, что вас просили");
        }
    }

    void createTodoFile() {
        Scanner scanner = new Scanner(System.in);
        FileOutputStream file = null;
        try {
            file = new FileOutputStream("todo-list.txt", true);
        } catch (FileNotFoundException e) {
            System.err.println("Ошибка создания файла");
            e.printStackTrace();
        }
        System.out.print("Введите занятие: ");
        getUpdateTodo(Objects.requireNonNull(file), "\n" + getCountTasks() + ") " + scanner.nextLine());
        scanner.close();
    }

    static long getCountTasks() {
        try {
            if (Files.lines(Paths.get("todo-list.txt")).findAny().isEmpty()) {
                return 1;
            }
            return Files.lines(Paths.get("todo-list.txt")).count();
        } catch (IOException e) {
            System.err.println("Ошибка подсчета тасков");
            e.printStackTrace();
        }
        return 0;
    }
}
