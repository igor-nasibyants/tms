package com.tms.homework.nikitaelenski.task12;


import java.io.File;

import static com.tms.homework.nikitaelenski.task12.Text.printOut;

public class Main {
    public static void main(String[] args) {
        File folderName = new File("src\\main\\java\\com\\tms\\homework");
        String[] list = folderName.list();
        printOut(list);
    }
}
