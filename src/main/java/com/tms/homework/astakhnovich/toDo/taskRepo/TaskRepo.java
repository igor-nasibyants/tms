package com.tms.homework.astakhnovich.toDo.taskRepo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.tms.homework.astakhnovich.toDo.model.Task;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;


public class TaskRepo {
    private static ArrayList<Task> tasksList = new ArrayList<>();

    public static boolean addTaskToRepo(Task newTask){
        tasksList.add(newTask);
        return serializeToGson();
    }

    public static boolean serializeToGson(){
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        String taskJson = gson.toJson(tasksList);
        try (FileOutputStream fileOutputStream = new FileOutputStream("json//TaskList.json");){
            fileOutputStream.write(taskJson.getBytes());
            return true;
        }catch (IOException e){
            return false;
        }
    }

    public static ArrayList<Object> getTasksList() throws IOException {
//        ObjectMapper objectMapper = new ObjectMapper();
//        byte[] taskListData = Files.readAllBytes(Paths.get("json//TaskList.json"));
//        tasksList = objectMapper.readValue(taskListData, ArrayList.class);
        return null;
    }
}
