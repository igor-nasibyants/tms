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

        try {
            StringWriter writer = new StringWriter();
            JAXBContext context = JAXBContext.newInstance(User.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            OutputStream os = new FileOutputStream("xml//UserList.xml" );
            for (User user : regExp.checkUser()) {
                marshaller.marshal(user, os);
                marshaller.marshal(user, writer);
            }
            String result = writer.toString();
            System.out.println(result);
        }catch (JAXBException | FileNotFoundException j){
            System.out.println("Exception");
        }
    }

    public static void serializationToJson(){
        RegExp regExp = new RegExp();
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        String userJson = gson.toJson(regExp.checkUser());
//        System.out.println(json);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("json//UserList.json");
            fileOutputStream.write(userJson.getBytes());
            fileOutputStream.close();
        }catch (IOException e){
            System.out.println("Exception");
        }

        List newUserList = gson.fromJson(userJson, List.class);
        newUserList.forEach(System.out::println);
    }
}