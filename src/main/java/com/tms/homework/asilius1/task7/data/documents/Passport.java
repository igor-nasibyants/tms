package com.tms.homework.asilius1.task7.data.documents;

import java.time.LocalDate;

public class Passport extends Document {

    private String id;
    private String nationality;

    public Passport(String seriesOfDocument, Integer numberOfDocument, Integer yearOfExpiry, String nationality, String id, Dates dateOfBirth) {
        super(seriesOfDocument, numberOfDocument, yearOfExpiry, dateOfBirth);
        this.id = id;
        this.nationality = nationality;
    }


}
