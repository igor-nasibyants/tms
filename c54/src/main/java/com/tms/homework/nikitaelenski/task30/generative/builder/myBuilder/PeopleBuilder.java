package com.tms.homework.nikitaelenski.task30.generative.builder.myBuilder;

public class PeopleBuilder {

    private String name;
    private String surname;
    private String mail;
    private String phone;
    private String address;


    public PeopleBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public PeopleBuilder surname(final String surname) {
        this.surname = surname;
        return this;
    }

    public PeopleBuilder mail(final String mail) {
        this.mail = mail;
        return this;
    }

    public PeopleBuilder phone(final String phone) {
        this.phone = phone;
        return this;
    }

    public PeopleBuilder address(final String address) {
        this.address = address;
        return this;
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

    public People build(){
        return new People(this);
    }

}

