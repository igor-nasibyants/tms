package com.tms.homework.artsiom.vladykouski.task18;


import com.tms.homework.artsiom.vladykouski.task15.Main;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import org.glassfish.jaxb.runtime.v2.runtime.JAXBContextImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JaxbMain {
public Fishing createExample() {
    Tourism tourism = new Tourism("stells", "premium", "barbeque");
    Fishing fishing = new Fishing("mikado", "vabik", "owner", tourism);
    return fishing;
}

    public void marshallExample(){
        try {
            JAXBContext context = JAXBContext.newInstance(Fishing.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
            marshaller.marshal(createExample(),System.out);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        JaxbMain instance = new JaxbMain();
        instance.marshallExample();



    }
}
