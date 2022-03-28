package com.tms.homework.astakhnovich.task18;

import com.tms.homework.astakhnovich.task17.RegExp;
import com.tms.homework.astakhnovich.task17.User;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.StringWriter;
import java.util.HashMap;

public class SerializationToFile {


    public static void main(String[] args)  {
        serializationToXML();
    }

    public static void serializationToXML() {
        RegExp regExp = new RegExp();
        HashMap<Integer, User> hashMapUser = regExp.checkUser();

        try {
            StringWriter writer = new StringWriter();
            JAXBContext context = JAXBContext.newInstance(User.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            OutputStream os = new FileOutputStream("xml//UserList.xml" );
            for (Integer key : hashMapUser.keySet()) {
                marshaller.marshal(hashMapUser.get(key), os);
                marshaller.marshal(hashMapUser.get(key), writer);
            }
            String result = writer.toString();
            System.out.println(result);
        }catch (JAXBException | FileNotFoundException j){
            System.out.println("Exception");
        }
    }

    public static void serializationToJson() {
        RegExp regExp = new RegExp();
        HashMap<Integer, User> hashMapUser = regExp.checkUser();
    }
}
