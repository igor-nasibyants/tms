package com.tms.homework.artsiom.vladykouski.task6;

public class Main {
    public static void main (String [] args){
        Gadjet.MyPhone d = new Gadjet.MyPhone("Android", 4, 48, 64);
        String s = "Huawei P Smart";
        System.out.print("Мой телефон " + s + " с основными характеристиками: "+ "Операционная система " + d.operSystem + ", Размер внутренней памяти в гб: " + d.hardDisk + ", оперативная память устройства: " +
                d.ram + " , Максимальное разрешение фотосъемки: " + d.cameraPix);
        System.out.println();
        d.MakeView();
        System.out.println();
        Gadjet.MyWatch a = new Gadjet.MyWatch("Garmin Pay");
        a.Alarm();
        System.out.println();
        a.Pay();

    }
}
