package com.tms.homework.max.polevoy.task7.printable;

import com.tms.homework.max.polevoy.task7.printable.Book;
import com.tms.homework.max.polevoy.task7.printable.Magazine;
import com.tms.homework.max.polevoy.task7.printable.Printable;

public class PrintableDemo {
    public static void main(String[] args) {
        Book book1 = new Book("name1");
        Book book2 = new Book("name2");
        Magazine magazine1 = new Magazine("magazine1");
        Magazine magazine2 = new Magazine("magazine2");

        Printable[] printables = {book1, book2, magazine1, magazine2};
        for (Printable printable : printables) {
            printable.print();

        }
    }
}