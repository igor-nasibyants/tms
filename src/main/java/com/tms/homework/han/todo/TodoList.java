package com.tms.homework.han.todo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class TodoList implements UpdateTodo, ReadTodo {

    public void getTodo() throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileOutputStream file = new FileOutputStream("todo-list.txt", true);
        System.out.print("Введите занятие: ");
        getUpdateTodo(file, "\n" + getCountTasks() + ") " + scanner.nextLine());
        scanner.close();
    }

    public long getCountTasks() throws IOException {
        if (Files.lines(Paths.get("todo-list.txt")).findAny().isEmpty()) {
            return 1;
        }
        return Files.lines(Paths.get("todo-list.txt")).count();
    }
}
