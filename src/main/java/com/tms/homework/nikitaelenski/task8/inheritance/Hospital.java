package com.tms.homework.nikitaelenski.task8.inheritance;

public class Hospital extends MedicaInstitutions {

    public Hospital(String address, Integer numberOfCabinets, Integer numberOfDoctors, Integer surnameOfTheHeadsOfTheDoctor) {
        super(address, numberOfCabinets, numberOfDoctors, surnameOfTheHeadsOfTheDoctor);
    }

    @Override
    public String Alarm() {
        return super.Alarm();
    }
}
