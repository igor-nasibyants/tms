package com.tms.homework.han.todo;

import java.io.FileInputStream;
import java.io.IOException;

public interface ReadTodo {
    default void readTodo() throws IOException {
        FileInputStream file = new FileInputStream("todo-list.txt");
        int c;
        System.out.print("Ваши дела:");
        while ((c = file.read()) != -1) {
            System.out.print((char) c);
        }
    }
}
