package com.tms.homework.asilius1.task7.data.documents;

import com.tms.homework.asilius1.task7.data.Months;

public class Passport extends Document {

    private String id;

    public Passport(String seriesOfDocument, Integer numberOfDocument, Integer issueNumber, Months months,
                    Integer yearOfIssue, Integer yearOfExpiry, String nationality, String id) {
        super(seriesOfDocument, numberOfDocument, issueNumber, months, yearOfIssue, yearOfExpiry, nationality);
        this.id = id;
    }


}
