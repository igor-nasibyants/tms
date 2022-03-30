package com.tms.homework.pavelgrigoryev.task18.json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonParser {

    private static final String TAG_NAME_MAIN = "name";
    private static final String TAG_PIZZAS = "pizzas";
    private static final String TAG_NAME = "name";
    private static final String TAG_SIZE = "size";

    public Bakery parse() throws IOException, ParseException {
        Bakery bakery = new Bakery();
        JSONParser parser = new JSONParser();
        FileReader reader = new FileReader("json//BakeryList.json");

        JSONObject bakeryJsonObject = (JSONObject) parser.parse(reader);
        String name = (String) bakeryJsonObject.get(TAG_NAME_MAIN);

        JSONArray pizzasJsonArray = (JSONArray) bakeryJsonObject.get(TAG_PIZZAS);
        List<Pizza> pizzaList = new ArrayList<>();

        for (Object item : pizzasJsonArray) {
            JSONObject pizzasJsonObject = (JSONObject) item;
            String namePizza = (String) pizzasJsonObject.get(TAG_NAME);
            long size = (Long) pizzasJsonObject.get(TAG_SIZE);
            Pizza pizza = new Pizza(namePizza, (int) size);
            pizzaList.add(pizza);
        }

        bakery.setName(name);
        bakery.setPizzas(pizzaList);
        return bakery;
    }

    public static void main(String[] args) throws IOException, ParseException {
        JsonParser jsonParser = new JsonParser();
        Bakery bakery = jsonParser.parse();

        System.out.println(bakery.toString());
    }
}
