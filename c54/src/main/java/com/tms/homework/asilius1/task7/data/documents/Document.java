package com.tms.homework.asilius1.task7.data.documents;


abstract public class Document {

    private String seriesOfDocument;
    private Integer numberOfDocument;
    private Integer yearOfExpiry;
    private Dates dateOfBirth;
    private String nationality;

    public Document(String seriesOfDocument, Integer numberOfDocument, Integer yearOfExpiry, Dates dateOfBirth) {
        this.seriesOfDocument = seriesOfDocument;
        this.numberOfDocument = numberOfDocument;
        this.yearOfExpiry = yearOfExpiry;
        this.dateOfBirth = dateOfBirth;
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

    @Override
    public String toString() {
        return "Document{" +
                "seriesOfDocument='" + seriesOfDocument + '\'' +
                ", numberOfDocument=" + numberOfDocument +
                ", yearOfExpiry=" + yearOfExpiry +
                ", dateOfBirth=" + dateOfBirth +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}
