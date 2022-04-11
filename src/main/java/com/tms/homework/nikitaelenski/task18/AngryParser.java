package com.tms.homework.nikitaelenski.task18;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class AngryParser {

    public static void main(String[] args) throws Exception{
        String str = "C:\\Users\\user1\\IdeaProjects\\tms\\json\\WhoHasWon.json";
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        AngryClass student = gson.fromJson(str, AngryClass.class);
        System.out.println(student.getBirdName() + student.getPower());

    }


}
