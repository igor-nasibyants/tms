package com.tms.homework.asilius1.task7.Data.Documents;

import com.tms.homework.asilius1.task7.Data.Months;

public class Passport extends Document {

    private String ID;

    Passport(String seriesofDocument, Integer numberofDocument, Integer issueNumber, Months months, Integer yearofIssue, Integer yearofExpiry, String nationality, String ID) {
        super(seriesofDocument, numberofDocument, issueNumber, months, yearofIssue, yearofExpiry, nationality);
        this.ID = ID;
    }


}
