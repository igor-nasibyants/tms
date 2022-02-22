package com.tms.homework.nikitaelenski.task8.polimorphizm;


public class Hospital extends MedicaInstitutions {
    public Hospital(String name) {
        super(name);
    }

    @Override
    public void Alarm() {
        System.out.println("У нас пожара нету ");
    }

    public void Alarm(String say) {
        System.out.println(say);
    }

}
