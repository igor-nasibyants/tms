package com.tms.homework.pavelgrigoryev.task14;

import java.util.Objects;

public class Orc {
    private final String lastname;
    private final String firstname;

    public Orc(String lastname, String firstname) {
        this.lastname = lastname != null ? lastname : "";
        this.firstname = firstname != null ? firstname : "";
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    @Override
    public String toString() {
        return lastname + " - " + firstname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orc orc = (Orc) o;
        return Objects.equals(lastname, orc.lastname) && Objects.equals(firstname, orc.firstname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastname, firstname);
    }
}
