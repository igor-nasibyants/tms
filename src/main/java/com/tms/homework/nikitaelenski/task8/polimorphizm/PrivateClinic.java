package com.tms.homework.nikitaelenski.task8.polimorphizm;

public class PrivateClinic extends MedicaInstitutions {
    public PrivateClinic(String name) {
        super(name);
    }

    @Override
    public void Alarm() {
        System.out.println("Мы из окна не видим ");
    }
}
