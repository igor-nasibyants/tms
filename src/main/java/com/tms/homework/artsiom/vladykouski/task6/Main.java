package com.tms.homework.artsiom.vladykouski.task6;

public class Main {
    public static void main(String[] args) {
        MyPhone d = new MyPhone("Android", 4, 48,
                64, "Huawei P Smart", "black", "500 USD");
        System.out.print("Мой телефон " + d.getNameModel() + " с основными характеристиками: " + "Операционная система " + d.operSystem + ", Размер внутренней памяти в гб: " + d.hardDisk + ", оперативная память устройства: " +
                d.ram + " , Максимальное разрешение фотосъемки: " + d.cameraPix);
        System.out.println();
        d.MakeView();
        System.out.println();
        MyWatch a = new MyWatch("Garmin Pay", "Garmin", "black", "200 USD");
        a.alarm();
        System.out.println();
        a.pay();

    }
}
