package com.tms.homework.nikitaelenski.task8.inheritance;

public class PrivateClinic extends MedicaInstitutions {

    public PrivateClinic(String address, Integer numberOfCabinets, Integer numberOfDoctors, Integer surnameOfTheHeadsOfTheDoctor) {
        super(address, numberOfCabinets, numberOfDoctors, surnameOfTheHeadsOfTheDoctor);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
