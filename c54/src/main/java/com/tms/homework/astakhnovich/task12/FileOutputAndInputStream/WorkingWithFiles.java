package com.tms.homework.astakhnovich.task12.FileOutputAndInputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WorkingWithFiles {
    public static void main(String[] args) {
        String str;

        try {
            File file = new File("c://MyFile.txt");
            str = file.getPath();
            OutputStream output = new FileOutputStream("c://MyFile.txt");
            char[] c = str.toCharArray();
            for (char value : c) {
                output.write(value);
            }
            output.close();
        } catch (Exception e){
            System.out.print("Exception");
        }
    }
}
