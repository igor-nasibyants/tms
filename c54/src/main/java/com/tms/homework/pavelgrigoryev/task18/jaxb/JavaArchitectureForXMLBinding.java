package com.tms.homework.pavelgrigoryev.task18.jaxb;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import java.io.*;

public class JavaArchitectureForXMLBinding {
    public static void main(String[] args) throws JAXBException, IOException {
        jaxbWriter();
        System.out.println("=====================================================================");
        jaxbReader();
    }

    private static void jaxbWriter() throws JAXBException, IOException {
        Gnome gnome = new Gnome();
        gnome.setId(1);
        gnome.setName("MilkHouse");
        gnome.setAge(45);

        FileOutputStream outputStream = new FileOutputStream("xml//gnome.xml");
        JAXBContext context = JAXBContext.newInstance(Gnome.class);
        Marshaller marshaller = context.createMarshaller();

        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        marshaller.marshal(gnome, outputStream);
        marshaller.marshal(gnome, System.out);
        outputStream.close();
    }

    private static void jaxbReader() throws JAXBException, IOException {
        FileInputStream fileInputStream = new FileInputStream("xml//gnome.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Gnome.class);

        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Gnome gnome = (Gnome) unmarshaller.unmarshal(fileInputStream);
        System.out.println(gnome);
        fileInputStream.close();
    }
}
