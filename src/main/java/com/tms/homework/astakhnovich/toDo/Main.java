package com.tms.homework.astakhnovich.toDo;

import com.tms.homework.astakhnovich.toDo.controller.TaskMenuController;
import com.tms.homework.astakhnovich.toDo.taskRepo.TaskRepo;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        TaskMenuController c = new TaskMenuController();
//        c.taskMenu();
        TaskRepo.getTasksList().forEach(System.out::println);

    }
}
