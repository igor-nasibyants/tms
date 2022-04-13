package com.tms.homework.nnazarv.task1.task12;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        FileInputStream fis = null;
        int b = 0;

        try {
            fis = new FileInputStream("D://Programs//HelloWorld.txt");
            while ((b = fis.read()) != -1 ){
                System.out.println((char) b );
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
