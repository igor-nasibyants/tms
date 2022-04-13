package com.tms.task.task12.serialization;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        writeGameToFile();
        readGameFromFile();
    }

    private static void readGameFromFile() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("save.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        SavedGame savedGame = (SavedGame) objectInputStream.readObject();

        System.out.println(savedGame);
    }

    private static void writeGameToFile()  throws IOException{
        //создаем наш объект
        String[] territoryInfo = {"У Испании 6 провинций", "У России 10 провинций", "У Франции 8 провинций"};
        String[] resourcesInfo = {"У Испании 100 золота", "У России 80 золота", "У Франции 90 золота"};
        String[] diplomacyInfo = {"Франция воюет с Россией, Испания заняла позицию нейтралитета"};

        SavedGame savedGame = new SavedGame(territoryInfo, resourcesInfo, diplomacyInfo);

        //создаем 2 потока для сериализации объекта и сохранения его в файл
        FileOutputStream outputStream = new FileOutputStream("save.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        // сохраняем игру в файл
        objectOutputStream.writeObject(savedGame);

        //закрываем поток и освобождаем ресурсы
        objectOutputStream.close();
    }

}
