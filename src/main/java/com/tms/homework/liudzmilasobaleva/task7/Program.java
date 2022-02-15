package com.tms.homework.liudzmilasobaleva.task7;

import static com.tms.homework.liudzmilasobaleva.task7.PetsType.CAT;

public class Program implements Printable {
    public static void main(String[] args) {

        Pet ksu = new Pet("Ksu", 13);
        ksu.PetsType = CAT;
        ksu.run();
        ksu.eatMilk();

    }
}