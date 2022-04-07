package com.tms.homework.han.todo;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        TodoList todo = new TodoList();
        todo.getTodo();
        todo.readTodo();
    }
}