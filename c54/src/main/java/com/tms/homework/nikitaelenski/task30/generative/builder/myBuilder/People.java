package com.tms.homework.nikitaelenski.task30.generative.builder.myBuilder;

public class People {
    private  final String name;
    private  final String surname;
    private  final String mail;
    private  final String phone;
    private  final String address;

    People(final PeopleBuilder peopleBuilder) {
        this.name = peopleBuilder.getName();
        this.surname = peopleBuilder.getSurname();
        this.mail = peopleBuilder.getMail();
        this.phone = peopleBuilder.getPhone();
        this.address = peopleBuilder.getAddress();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMail() {
        return mail;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", mail='" + mail + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
