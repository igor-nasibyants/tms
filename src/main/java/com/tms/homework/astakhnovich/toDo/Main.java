package com.tms.homework.astakhnovich.toDo;

import com.tms.homework.astakhnovich.toDo.controller.TaskMenuController;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        TaskMenuController taskMenuController = new TaskMenuController();
        taskMenuController.taskMenu();
    }
}
