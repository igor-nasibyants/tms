package com.tms.homework.nikitaelenski.task8.encapsulation;

public class MedicalInstitutions {
    private String address;
    private Integer NumberOfCabinets;
    private Integer NumberOfDoctors;
    private Integer SurnameOfTheHeadsOfTheDoctor;

    public MedicalInstitutions(String address, Integer numberOfCabinets, Integer numberOfDoctors,
                               Integer surnameOfTheHeadsOfTheDoctor) {
        this.address = address;
        NumberOfCabinets = numberOfCabinets;
        NumberOfDoctors = numberOfDoctors;
        SurnameOfTheHeadsOfTheDoctor = surnameOfTheHeadsOfTheDoctor;
    }

    public MedicalInstitutions(Integer surnameOfTheHeadsOfTheDoctor) {

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getNumberOfCabinets() {
        return NumberOfCabinets;
    }

    public void setNumberOfCabinets(Integer numberOfCabinets) {
        NumberOfCabinets = numberOfCabinets;
    }

    public Integer getNumberOfDoctors() {
        return NumberOfDoctors;
    }

    public void setNumberOfDoctors(Integer numberOfDoctors) {
        NumberOfDoctors = numberOfDoctors;
    }

    public Integer getSurnameOfTheHeadsOfTheDoctor() {
        return SurnameOfTheHeadsOfTheDoctor;
    }

    public void setSurnameOfTheHeadsOfTheDoctor(Integer surnameOfTheHeadsOfTheDoctor) {
        SurnameOfTheHeadsOfTheDoctor = surnameOfTheHeadsOfTheDoctor;
    }

    @Override
    public String toString() {
        return "Медицинское учереждение " +
                "по адресу= " + address +
                ", Количество кабинетов =" + NumberOfCabinets +
                ", Врачей =" + NumberOfDoctors +
                ", с общей площадью =" + SurnameOfTheHeadsOfTheDoctor +
                " квадратных метров";
    }
}
