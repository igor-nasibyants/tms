package com.tms.homework.astakhnovich.toDo.taskRepo;

import com.tms.homework.astakhnovich.toDo.model.Task;
import jakarta.xml.bind.*;
import java.io.*;
import java.util.ArrayList;

public class TaskRepo {
    private static ArrayList<Task> tasksList = new ArrayList<>();

    public static boolean addTaskToRepo(Task newTask){
        tasksList.add(newTask);
//        serializeToXML(newTask);
        return true;
    }

    public static boolean serializeToXML() {
        try (OutputStream os = new FileOutputStream("xml//taskList.xml" )){
            JAXBContext context = JAXBContext.newInstance(Task.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            for (Task task : tasksList) {
                marshaller.marshal(task, os);
            }
            return true;
        } catch (JAXBException | IOException e) {
            e.printStackTrace();
            return false;
        }
//        Gson gson = new GsonBuilder()
//                .setPrettyPrinting()
//                .create();
//        String taskJson = gson.toJson(tasksList);
//        try (FileOutputStream fileOutputStream = new FileOutputStream("json//TaskList.json");){
//            fileOutputStream.write(taskJson.getBytes());
//            return true;
//        }catch (IOException e){
//            return false;
//        }
    }

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


//    public static ArrayList<Task> getTasksList() {
//        try {
//            JAXBContext context = JAXBContext.newInstance(StaminaOfPavel.class);
//            Unmarshaller unmarshaller = context.createUnmarshaller();
//            ArrayList<Task> listofTasks = (ArrayList<Task>) unmarshaller.unmarshal(new File("xml//taskList.xml"));
//            return true;
//        } catch (JAXBException e) {
//            return false;
//        }
//    }


    public static ArrayList<Task> getTasksList() {
        try {
            JAXBContext context = JAXBContext.newInstance(Task.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Task taskFromXML = (Task) unmarshaller.unmarshal(new File("xml//taskList.xml"));
            ArrayList<Task> newTasksList = new ArrayList<>();
            newTasksList.add(taskFromXML);
            tasksList.addAll(newTasksList);
            return tasksList;
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void setTasksList(ArrayList<Task> tasksList) {
        TaskRepo.tasksList = tasksList;
    }
}
