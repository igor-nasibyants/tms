package com.tms.homework.han.todo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;

public interface PrintFile extends ListFromFile {
    default void printFile(String path) {
        FileInputStream file = null;
        try {
            file = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            System.err.println("Ошибка получения файла");
            e.printStackTrace();
        }
        try {
            int c;
            System.out.println("Ваши задачи (" + getListFromFile(path).size() + "):");
            while ((c = Objects.requireNonNull(file).read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.err.println("Невозможно прочитать файл");
            e.printStackTrace();
        }
    }
}
