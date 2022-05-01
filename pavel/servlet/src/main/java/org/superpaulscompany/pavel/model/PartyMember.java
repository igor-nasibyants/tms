package org.superpaulscompany.pavel.model;

public record PartyMember(String name, String surname, int age, String email, String gender,
                          String country, String nationality, String[] provisions, String comments) {
}
