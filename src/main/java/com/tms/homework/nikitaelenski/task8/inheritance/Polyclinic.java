package com.tms.homework.nikitaelenski.task8.inheritance;

public class Polyclinic extends MedicaInstitutions {
    private final String polyclinic = "Поликлиника";

    public Polyclinic(String address, Integer numberOfCabinets, Integer numberOfDoctors, Integer surnameOfTheHeadsOfTheDoctor) {
        super(address, numberOfCabinets, numberOfDoctors, surnameOfTheHeadsOfTheDoctor);
    }

    @Override
    public String Alarm() {
        return super.Alarm();
    }
}
