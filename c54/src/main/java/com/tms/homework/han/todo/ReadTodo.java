package com.tms.homework.han.todo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;

public interface ReadTodo {
    default void readTodo() {
        FileInputStream file = null;
        try {
            file = new FileInputStream("todo-list.txt");
        } catch (FileNotFoundException e) {
            System.err.println("Ошибка получения файла");
            e.printStackTrace();
        }
        try {
            int c;
            System.out.print("Ваши дела:");
            while ((c = Objects.requireNonNull(file).read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.err.println("Невозможно прочитать файл");
            e.printStackTrace();
        }
    }
}
