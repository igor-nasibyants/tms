package com.tms.homework.liudzmilasobaleva.task7;

import static com.tms.homework.liudzmilasobaleva.task7.PetsType.CAT;
import static com.tms.homework.liudzmilasobaleva.task7.PetsType.GUINEA_PIG;

public class Program implements Printable {

    @Override
    public void print() {
        System.out.printf("asjkdfalsdflaskd, %s", "asdfsf");
    }

    public static void main(String[] args) {

        Program p = new Program();
        p.print();
        Pet ksu = new Pet("Ksu", 13);
        ksu.PetsType = CAT;
        System.out.println(ksu.toString());
        System.out.println(ksu.PetsType);
        ksu.run();
        ksu.eatMilk();

        Printable p1 = () -> System.out.println("another way");

        p1.print();
        Pet asya = new Pet("Asya", 2);
        asya.PetsType = GUINEA_PIG;
        System.out.println(asya.toString());
        System.out.println(asya.PetsType);
        asya.run();
        asya.eatMilk();

    }
}