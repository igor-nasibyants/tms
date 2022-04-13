package com.tms.task.task13;


import com.tms.task.task8.aggregation.Person;

public class Program {
    public static void main(String[] args) {
        Printer.print(12);
        Printer.print("12");
        Printer.print(new Person("Igor", 32));
    }
}

class Printer {

    public static <T> void print(T t) {
        System.out.println(t);
    }
}
