package com.tms.homework.astakhnovich.todo.taskRepo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tms.homework.astakhnovich.todo.model.Task;
import com.tms.task.task12.File;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TaskRepo {
    private ObjectMapper objectMapper = new ObjectMapper();
    private List<Task> tasksList;

    {
        Path path = Paths.get("json//TaskList.json");
        if(!Files.exists(path)){
            File file = new File("json//TaskList.json");
        }
    }

    public boolean addTaskToRepo(Task newTask){
        tasksList = new ArrayList<>(getTasksList());
        tasksList.add(newTask);
        return serializeToJson();

    }

    public boolean serializeToJson() {

        try (FileOutputStream fileOutputStream = new FileOutputStream("json//TaskList.json")){
            String result = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(tasksList);
            fileOutputStream.write(result.getBytes());
            return true;
        }catch (IOException e){
            e.printStackTrace();
            return false;
        }
    }

    public List<Task> getTasksList() {
        try {
            byte[] arrayFromJson = Files.readAllBytes(Paths.get("json//TaskList.json"));
            return tasksList = objectMapper.readValue(arrayFromJson, objectMapper.getTypeFactory()
                    .constructCollectionType(List.class, Task.class));
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}









//    private List<Task> unmodifiableTasksList;

//            Task [] listFromJson =  objectMapper.readValue(arrayFromJson, Task[].class);
//            tasksList = Arrays.stream(listFromJson).toList();
//            return unmodifiableTasksList = new ArrayList<>(tasksList);

//        try (OutputStream os = new FileOutputStream("xml//taskList.xml" )){
//            JAXBContext context = JAXBContext.newInstance(Task.class);
//            Marshaller marshaller = context.createMarshaller();
//            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//
//            for (Task task : tasksList) {
//                marshaller.marshal(task, os);
//            }
//            return true;
//        } catch (JAXBException | IOException e) {
//            e.printStackTrace();
//            return false;
//        }


//    public static ArrayList<Task> getTasksList() {
//        try {
//            JAXBContext context = JAXBContext.newInstance(Task.class);
//            Unmarshaller unmarshaller = context.createUnmarshaller();
//            Task taskFromXML = (Task) unmarshaller.unmarshal(new File("xml//taskList.xml"));
//            ArrayList<Task> newTasksList = new ArrayList<>();
//            newTasksList.add(taskFromXML);
//            tasksList.addAll(newTasksList);
//            return tasksList;
//        } catch (JAXBException e) {
//            e.printStackTrace();
//            return null;
//        }
//    }


//    public static void serializeToXML(Task task) {
//        try (OutputStream os = new FileOutputStream("xml//taskList.xml" )){
//            JAXBContext context = JAXBContext.newInstance(Task.class);
//            Marshaller marshaller = context.createMarshaller();
//            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//            marshaller.marshal(task, os);
//        } catch (JAXBException | IOException e) {
//            e.printStackTrace();
//        }
//    }