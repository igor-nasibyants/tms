package com.tms.homework.astakhnovich.toDo.taskRepo;

import com.tms.homework.astakhnovich.toDo.model.Task;
import java.util.HashMap;

public class TaskRepo {
    HashMap<String, Task> hashTasks;

    public void addTaskToRepo(Task newTask){
        hashTasks.put(newTask.getHeader(), newTask);
    }

    public HashMap<String, Task> getHashTasks() {
        return hashTasks;
    }
}
