package com.tms.homework.pavelgrigoryev.task18.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class JsonCreator {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    public static void main(String[] args) throws IOException {
        Bakery bakery = new Bakery("ChessMinos", Arrays.asList(new Pizza("pepperoni", 35),
                new Pizza("margarita", 27), new Pizza("special", 45)));
        String json = GSON.toJson(bakery);
        System.out.println(json);

        FileWriter fileWriter = new FileWriter("json//BakeryList.json");
        fileWriter.write(json);
        fileWriter.close();

        System.out.println("==========================================================================================");

        Bakery bakery1 = GSON.fromJson(json, Bakery.class);
        System.out.println(bakery1);
    }
}
