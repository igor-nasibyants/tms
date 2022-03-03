package com.tms.homework.astakhnovich.task12.FileOutputAndInputStream;

import java.io.*;

public class WorkingWithFiles {
    private String str;
    private String path;
    private char[] c;
    private StringBuilder sb = new StringBuilder();


    public static void main(String[] args) {
        WorkingWithFiles wwf = new WorkingWithFiles();
        wwf.getPathFile();
        wwf.writeInFile();

    }

    public String getPathFile(){
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            System.out.println("Введите название файла. В конце введите .");
            char a;
            do {
                a = (char) isr.read();
                sb.append(a);
            }while (a != '.');

        }catch (Exception e){
            System.out.print("Exception");
        }

        str = "c://" + sb.append("txt").toString();
        System.out.println(str);
        File file = new File(str);
        return path = file.getPath();
    }

    public void writeInFile(){
        try {
            OutputStream output = new FileOutputStream(path);
            c = str.toCharArray();
            for (char value : c) {
                output.write(value);
            }
            output.close();
        } catch (Exception e){
            System.out.print("Exception");
        }
    }
}