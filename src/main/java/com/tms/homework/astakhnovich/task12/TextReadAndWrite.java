package com.tms.homework.astakhnovich.task12;

import java.io.*;

public class TextReadAndWrite {
    private String text;
    private StringBuilder newText = new StringBuilder();

    public TextReadAndWrite(String text) {
        this.text = text;
    }

    public void textWriter(String fileName){
        try {
            File file = new File(fileName);
            FileWriter writer = new FileWriter(file);
            writer.write(text);
            writer.close();
        }catch (IOException e){
            System.out.println("ups part 1");
        }
    }

    public void textReader(String fileName){
        try {
            FileReader reader = new FileReader(fileName);
            int i = 0;
            while ((i = reader.read())!= -1){
                newText.append((char)i);
            }
            reader.close();
            System.out.println(newText);
        }catch (IOException e){
            System.out.println("ups part 2");
        }
    }
}
