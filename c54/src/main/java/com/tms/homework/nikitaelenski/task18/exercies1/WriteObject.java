package com.tms.homework.nikitaelenski.task18.exercies1;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class WriteObject {

    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        Person person1 = new Person(1 ,"Bob");
        Person person2 = new Person(2 ,"Sara");
        Person person3 = new Person(3 ,"Masha");
        Person person4 = new Person(4 ,"Grisha");
        Person person5 = new Person(5 ,"Oleg");
        Person[] people = {person1 , person2 , person3 , person4, person5};
        List<Person> people1 = List.of(new Person[]{person1, person2, person3, person4, person5});

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("json//Person.json");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(people);
            objectOutputStream.writeObject(people1);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
