package com.tms.homework.asilius1.task7.data.documents;


import com.tms.homework.asilius1.task7.data.Months;

abstract public class Document {

    private String seriesofDocument;
    private Integer numberofDocument;
    private Integer issueNumber;
    private Months months;
    private Integer yearofIssue;
    private Integer yearofExpiry;
    private String nationality;

    public Document(String seriesofDocument, Integer numberofDocument, Integer issueNumber, Months months, Integer yearofIssue, Integer yearofExpiry, String nationality) {
        this.seriesofDocument = seriesofDocument;
        this.numberofDocument = numberofDocument;
        this.issueNumber = issueNumber;
        this.months = months;
        this.yearofIssue = yearofIssue;
        this.yearofExpiry = yearofExpiry;
        this.nationality = nationality;
    }

    public String getSeriesofDocument() {
        return seriesofDocument;
    }

    public void setSeriesofDocument(String seriesofDocument) {
        this.seriesofDocument = seriesofDocument;
    }

    public Integer getNumberofDocument() {
        return numberofDocument;
    }

    public void setNumberofDocument(Integer numberofDocument) {
        this.numberofDocument = numberofDocument;
    }

    public Integer getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(Integer issueNumber) {
        this.issueNumber = issueNumber;
    }

    public Months getMonths() {
        return months;
    }

    public void setMonths(Months months) {
        this.months = months;
    }

    public Integer getYearofIssue() {
        return yearofIssue;
    }

    public void setYearofIssue(Integer yearofIssue) {
        this.yearofIssue = yearofIssue;
    }

    public Integer getYearofExpiry() {
        return yearofExpiry;
    }

    public void setYearofExpiry(Integer yearofExpiry) {
        this.yearofExpiry = yearofExpiry;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
