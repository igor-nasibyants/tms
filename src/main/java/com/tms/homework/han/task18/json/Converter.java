package com.tms.homework.han.task18.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Converter {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Human nik = new Human();
        nik.setAge(10);
        nik.setName("Nikita");
        nik.setFriends(new String[]{"Masha", "Sasha", "Rita", "Lena"});
        String result = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(nik);
        System.out.println(result);
        FileOutputStream fileOutputStream = new FileOutputStream("nik.json");
        fileOutputStream.write(result.getBytes(StandardCharsets.UTF_8));
        fileOutputStream.close();
//        objectMapper.readValue("nik.json", Human.class);
    }
}
