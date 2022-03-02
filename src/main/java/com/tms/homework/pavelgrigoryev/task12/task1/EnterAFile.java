package com.tms.homework.pavelgrigoryev.task12.task1;


import java.io.File;


public class EnterAFile {
    public static void main(String[] args) {
        File file = new File("file.txt");

        if (file.exists()) {
            System.out.println("That file exists ! :O ");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
        } else {
            System.out.println("That file doesn't exist :( ");
        }
    }
}
