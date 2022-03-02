package com.tms.homework.pavelgrigoryev.task12.task3;

import java.io.*;

public class EnterABufferedReader {
    public static void main(String[] args) {
        String[] strings = {"Don't belong! don't exist!","Don't give a shit!","Don't ever judge me!"};
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("song.txt"));
            writer.write("Fuck it all! fuck this world!\n");
            writer.write("Fuck everything that you stand for!");
            for (String string : strings) {
                writer.write("\n" + string);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("song.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
