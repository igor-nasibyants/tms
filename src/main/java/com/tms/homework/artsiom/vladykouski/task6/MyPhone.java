package com.tms.homework.artsiom.vladykouski.task6;


public class MyPhone extends Gadjet {
    public String operSystem;
    public int ram;
    public int cameraPix;
    int hardDisk;


    public MyPhone(String operSystem, int ram, int cameraPix, int hardDisk,
                   String nameModel, String color, String price) {
        super(nameModel, color, price);
        this.cameraPix = cameraPix;
        this.operSystem = operSystem;
        this.ram = ram;
        this.hardDisk = hardDisk;
    }

    void MakeView() {
        cameraPix = 48;
        System.out.print(" Снимаем на фотокамеру с разрешением  " + cameraPix);
    }
}

