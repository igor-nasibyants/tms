package com.tms.homework.han.task18.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class Converter {
    public static void main(String[] args) throws IOException {


        ObjectMapper objectMapper = new ObjectMapper();

        Human lera = new Human("Lera", 20);
        Human masha = new Human("Masha", 21);
        masha.setFriends(new Human[]{new Human("Natasha", 28),
                new Human("Misha", 24)});
        Human nika = new Human("Nika", 19);
        Human rita = new Human("Rita", 18);
        rita.setFriends(new Human[]{new Human("Nikita", 18), new Human()});
        Human nik = new Human();
        nik.setAge(23);
        nik.setName("Nikita");
        nik.setFriends(new Human[]{rita, lera, masha, nika});

        String result = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(nik);
        System.out.println(result);
        FileOutputStream fileOutputStream = new FileOutputStream("nik.json");
        fileOutputStream.write(result.getBytes(StandardCharsets.UTF_8));
        fileOutputStream.close();

        byte[] mapDate = Files.readAllBytes(Paths.get("nik.json"));
        Map map = objectMapper.readValue(mapDate, HashMap.class);
        System.out.println(map);
    }
}
