package com.tms.homework.han.todo;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TodoList implements ListFromFile, PrintFile, UpdateFile {
    String path = "c54\\src\\main\\java\\com\\tms\\homework\\han\\todo\\todo-list.txt";
    void createTodo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вы хотите добавить задачу? (yes, no)");
        List<String> list = new ArrayList<>(getListFromFile(path));
        switch (scanner.nextLine().toLowerCase()) {
            case "yes" -> {
                addToList(list);
                getFileTodo(list);
                printFile(path);
            }
            case "no" -> {
                printFile(path);
                System.out.println("Вы выполнили задание?");
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("yes")) {
                    updateFile(list, path);
                    readyTask(list);
                    printFile(path);
                } else if (input.equalsIgnoreCase("no")) {
                    System.out.println("Выполняйте задания!");
                    printFile(path);
                } else {
                    System.out.println("Что вы вводите?");
                }
            }
            default -> System.out.println("Вы ввели не то, что вас просили");
        }
    }

    private static void addToList(List<String> list) {
        System.out.println("Введите задание, которое нужно добавить");
        Scanner scanner = new Scanner(System.in);
        list.add(scanner.nextLine());
    }

    private void getFileTodo(List<String> list) {
        Path file = Path.of(path);
        String lastElement = list.get(list.size() - 1);
        try {
            Files.write(file, (list.size() + ") " + lastElement + "\n")
                    .getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            try {
                FileOutputStream newFile = new FileOutputStream(path, true);
                Files.write(file, (list.size() + ") " + lastElement + "\n")
                        .getBytes(), StandardOpenOption.APPEND);
                newFile.close();
            } catch (IOException ex) {
                System.err.println("Ошибка записи при создании файла");
                throw new RuntimeException(ex);
            }
        }
    }

    private void readyTask(List<String> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер выполенного задания:");
        int number = scanner.nextInt();
        list.set(number - 1, list.get(number - 1) + " is DONE");
        updateFile(list, path);
    }
}
