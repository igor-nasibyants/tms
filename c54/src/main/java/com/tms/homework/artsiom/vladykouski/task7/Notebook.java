package com.tms.homework.artsiom.vladykouski.task7;

public abstract class Notebook implements Watchable {
    private String model;
    private int ram;
    private double cpu;
    private int HDD;

    public Notebook(String model, int ram, double cpu, int HDD) {
        this.model = model;
        this.ram = ram;
        this.cpu = cpu;
        this.HDD = HDD;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public int getHDD() {
        return HDD;
    }

    public void setHDD(int HDD) {
        this.HDD = HDD;
    }
}
