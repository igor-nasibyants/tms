package com.tms.homework.astakhnovich.toDo;

import com.tms.homework.astakhnovich.toDo.controller.TaskController;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        TaskController taskMenuController = new TaskController();
        taskMenuController.taskMenu();
    }
}
