package com.tms.homework.astakhnovich.task12;

public class Main {
    public static void main(String[] args) {
        task11();
    }

    public static void task11(){
        TextReadAndWrite traw = new TextReadAndWrite("hi. My name is nikita and I'm 24" +
                "\nI study in TMS ");

        traw.textWriter("C://MyFile.txt");
        traw.textReader("C://MyFile.txt");
    }
}
