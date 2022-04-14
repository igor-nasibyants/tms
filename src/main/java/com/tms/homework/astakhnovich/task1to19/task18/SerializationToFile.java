package com.tms.homework.astakhnovich.task1to19.task18;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.tms.homework.astakhnovich.task1to19.task17.RegExp;
import com.tms.homework.astakhnovich.task1to19.task17.User;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import java.io.*;
import java.util.List;

public class SerializationToFile {


    public static void main(String[] args)  {
        serializationToXML();
        serializationToJson();
    }

    public static void serializationToXML() {
        RegExp regExp = new RegExp();

        try (OutputStream os = new FileOutputStream("xml//UserList.xml" )){
            JAXBContext context = JAXBContext.newInstance(User.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            regExp.checkUser()
                    .forEach(u -> {
                        try {
                            marshaller.marshal(u, os);
                        } catch (JAXBException e) {
                            System.out.println("Exception 1/2");
                        }
                    });
//            for (User user : regExp.checkUser()) {
//                marshaller.marshal(user, os);
//                marshaller.marshal(user, System.out);
//            }
        } catch (JAXBException | IOException e) {
            System.out.println("Exception 1");
        }
    }

    public static void serializationToJson(){
        RegExp regExp = new RegExp();
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        String userJson = gson.toJson(regExp.checkUser());
        try (FileOutputStream fileOutputStream = new FileOutputStream("json//UserList.json");){
            fileOutputStream.write(userJson.getBytes());
        }catch (IOException e){
            System.out.println("Exception 2");
        }

        List newUserList = gson.fromJson(userJson, List.class);
        newUserList.forEach(System.out::println);
    }
}