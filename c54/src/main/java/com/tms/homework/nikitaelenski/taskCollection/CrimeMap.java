package com.tms.homework.nikitaelenski.taskCollection;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;



public class CrimeMap {


    public static void main(String[] args) throws IOException {
        MaximumLengthCalculation maximumLengthCalculation =  new MaxList();
        MaximumLengthCalculation getMaximumLengthCalculation = new MaxListSeven();
        Map<Integer , String> map = new HashMap<>();

        String f = "c54\\src\\main\\java\\com\\tms" +
                "\\homework\\nikitaelenski\\taskCollection\\CrimeAndPunishmentChapter2.txt";

        String str = String.valueOf(Files.readAllLines(Paths.get(f)));
        str = str.replaceAll("[^a-zA-Z ]", "");
        str = str.replaceAll("\\\\s*(\\\\s|,|!|\\\\.)\\\\s*\""," ");
        List<String> list = new ArrayList<>(Arrays.asList(str.split(" ")));

        for (int x = -0 ; list.size() > x ; x++){
            map.put(x, list.get(x));
        }

        System.out.println("Всего слов в тексте " + map.size());
        System.out.println("Самое популярное слово " + maximumLengthCalculation.Max(list));
        System.out.println("Самое популярное слово больше 7 символов " + getMaximumLengthCalculation.Max(list));




    }


}
