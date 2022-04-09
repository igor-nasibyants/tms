package com.tms.homework.nikitaelenski.task18;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class AngryParser {

    public static void main(String[] args) {

        JSONParser jsonParser = new JSONParser();
        try (FileReader reader = new FileReader("json//WhoHasWon.json")) {
            JSONObject rootJsonObject = (JSONObject)
                    jsonParser.parse(reader);
            String name = (String) rootJsonObject.get("birdName");
            System.out.println(name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
