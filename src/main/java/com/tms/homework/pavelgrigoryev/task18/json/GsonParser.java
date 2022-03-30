package com.tms.homework.pavelgrigoryev.task18.json;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;

public class GsonParser {
    public Bakery parse() throws IOException {
        Gson gson = new Gson();
        FileReader reader = new FileReader("json//BakeryList.json");
        Bakery bakery = gson.fromJson(reader, Bakery.class);
        reader.close();

        return bakery;
    }

    public static void main(String[] args) throws IOException {
        GsonParser parser = new GsonParser();
        Bakery bakery = parser.parse();

        System.out.println(bakery);
    }
}
