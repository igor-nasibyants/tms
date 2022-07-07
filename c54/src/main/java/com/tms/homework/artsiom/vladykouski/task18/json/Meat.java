package com.tms.homework.artsiom.vladykouski.task18.json;

public class Meat {
    private String kolbasa;
    private String sosiski;
    private String salo;

    public Meat(String kolbasa, String sosiski, String salo) {
        this.kolbasa = kolbasa;
        this.sosiski = sosiski;
        this.salo = salo;
    }

    public String getKolbasa() {
        return kolbasa;
    }

    public void setKolbasa(String kolbasa) {
        this.kolbasa = kolbasa;
    }

    public String getSosiski() {
        return sosiski;
    }

    public void setSosiski(String sosiski) {
        this.sosiski = sosiski;
    }

    public String getSalo() {
        return salo;
    }

    public void setSalo(String salo) {
        this.salo = salo;
    }
}
