package com.tms.task.task12;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileSymbolCopy {
    public static void main(String args[]) throws IOException {
        FileReader fileIn = null;
        FileWriter fileOut = null;

        try {
            fileIn = new FileReader("src\\main\\resources\\file.txt");
            fileOut = new FileWriter("src\\main\\resources\\copied_file_1.txt");

            int a;
            while ((a = fileIn.read()) != -1) {
                fileOut.write(a);
            }
        } finally {
            if (fileIn != null) {
                fileIn.close();
            }
            if (fileOut != null) {
                fileOut.close();
            }
        }
    }
}
