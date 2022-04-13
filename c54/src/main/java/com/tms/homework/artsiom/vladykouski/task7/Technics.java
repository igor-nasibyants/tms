package com.tms.homework.artsiom.vladykouski.task7;

public class Technics extends Notebook implements Programable {
    public Technics(String model, int ram, double cpu, int HDD) {
        super(model, ram, cpu, HDD);
    }

    public static void main(String[] args) {
        Notebook d = new Technics("Acer", 4, 2.0, 300);
        Programable s = new Programable() {
            @Override
            public void writing() {
                System.out.print("Write on Java");
            }
        };
        System.out.println();
        System.out.print("Модель ноутбука " + d.getModel() + ", " +
                "Оперативная память: " + d.getRam() + " Gb, Частота процессора: "
                + d.getCpu() + ", Размер жесткого диска " + d.getHDD());
        System.out.println();
        d.display();
        System.out.println();
        s.writing();

    }
        @Override
        public void display () {
            System.out.print("Watch films on notebook");

        }


    @Override
    public void writing() {

    }
}
