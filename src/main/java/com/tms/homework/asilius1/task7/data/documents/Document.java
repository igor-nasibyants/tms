package com.tms.homework.asilius1.task7.data.documents;


import com.tms.homework.asilius1.task7.data.Months;

abstract public class Document {

    private String seriesOfDocument;
    private Integer numberOfDocument;
    private Integer issueNumber;
    private Months months;
    private Integer yearOfIssue;
    private Integer yearOfExpiry;
    private String nationality;

    public Document(String seriesOfDocument, Integer numberOfDocument, Integer issueNumber,
                    Months months, Integer yearofIssue, Integer yearofExpiry,
                    String nationality) {
        this.seriesOfDocument = seriesOfDocument;
        this.numberOfDocument = numberOfDocument;
        this.issueNumber = issueNumber;
        this.months = months;
        this.yearOfIssue = yearofIssue;
        this.yearOfExpiry = yearofExpiry;
        this.nationality = nationality;
    }

    public String getSeriesOfDocument() {
        return seriesOfDocument;
    }

    public void setSeriesOfDocument(String seriesOfDocument) {
        this.seriesOfDocument = seriesOfDocument;
    }

    public Integer getNumberOfDocument() {
        return numberOfDocument;
    }

    public void setNumberOfDocument(Integer numberOfDocument) {
        this.numberOfDocument = numberOfDocument;
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

    public Integer getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(Integer yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public Integer getYearOfExpiry() {
        return yearOfExpiry;
    }

    public void setYearOfExpiry(Integer yearOfExpiry) {
        this.yearOfExpiry = yearOfExpiry;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
