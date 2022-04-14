package com.tms.homework.nikitaelenski.task18.exercies1;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("json//Person.json");

            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            Person[] people = (Person[]) objectInputStream.readObject();
            List<Person> people1 = (List<Person>) objectInputStream.readObject();

            Arrays.stream(people).forEach(System.out::println);
            people1.stream().forEach(System.out::println);
            objectInputStream.close();


        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
