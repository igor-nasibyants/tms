package com.tms.homework.nikitaelenski.task8.polimorphizm;

import com.tms.homework.nikitaelenski.task8.inheritance.MedicaInstitutions;

public class Main {
    public static void main(String[] args) {
        Hospital Hosp = new Hospital("10 городская больница");
        PrivateClinic clinic = new PrivateClinic("Лоде");
        Hosp.Alarm();
        clinic.Alarm();
        Hosp.Alarm("Сейчас проверю");


    }
}
