package com.tms.homework.pavelgrigoryev.task12.task2;

import java.io.*;

public class EnterASerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        GameCharacter one = new GameCharacter("Геральт из Ривии",200,"Man",
                new String[]{"Серебряный меч", "Железный меч", "Арбалет","Знаки"},"work_your_magic5679");
        GameCharacter two = new GameCharacter("Зул'джин", 175,"Troll",
                new String[]{"Магия амани","Кинжалы разбойника","Метательные топоры"},"One_Eye_Moms_Killer666");
        GameCharacter three = new GameCharacter("Женщина кошка", 190, "Woman",
                new String[]{"Когти","Кнут"},"LOVE_SUX!!!");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("GameCharacter.ser"));
        objectOutputStream.writeObject(one);
        objectOutputStream.writeObject(two);
        objectOutputStream.writeObject(three);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("GameCharacter.ser"));
        GameCharacter oneRestored = (GameCharacter) objectInputStream.readObject();
        GameCharacter twoRestored = (GameCharacter) objectInputStream.readObject();
        GameCharacter threeRestored = (GameCharacter) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println("Before Serialize: " + "\n" + one + "\n" + two + "\n" + three);
        System.out.println("After Restored: " + "\n" + oneRestored + "\n" + twoRestored + "\n" + threeRestored);
    }
}
