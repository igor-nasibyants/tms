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
        //������� ��� ������
        String[] territoryInfo = {"� ������� 6 ���������", "� ������ 10 ���������", "� ������� 8 ���������"};
        String[] resourcesInfo = {"� ������� 100 ������", "� ������ 80 ������", "� ������� 90 ������"};
        String[] diplomacyInfo = {"������� ����� � �������, ������� ������ ������� ������������"};

        SavedGame savedGame = new SavedGame(territoryInfo, resourcesInfo, diplomacyInfo);

        //������� 2 ������ ��� ������������ ������� � ���������� ��� � ����
        FileOutputStream outputStream = new FileOutputStream("save.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        // ��������� ���� � ����
        objectOutputStream.writeObject(savedGame);

        //��������� ����� � ����������� �������
        objectOutputStream.close();
    }

}
