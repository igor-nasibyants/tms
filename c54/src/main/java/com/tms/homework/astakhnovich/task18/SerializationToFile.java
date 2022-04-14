package com.tms.homework.astakhnovich.task18;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.tms.homework.astakhnovich.task17.RegExp;
import com.tms.homework.astakhnovich.task17.User;
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
            JAXBContext context = JAXBContext.newInstance(UsersDTO.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            UsersDTO usersDTO = new UsersDTO(regExp.checkUser());
            marshaller.marshal(usersDTO, os);
        } catch (JAXBException | IOException e) {
            System.out.println("Exception 1");
            e.printStackTrace();
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