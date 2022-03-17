package com.tms.homework.asilius1.task7.data.documents;
import java.time.LocalDate;
import java.util.Scanner;


public class Dates {

    private static Scanner str = new Scanner(System.in);


    private Integer day;
    private Integer month;
    private Integer year;


    Dates (Integer day,Integer month, Integer year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Dates() {

    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Integer getDay() {
        return day;
    }

    public Integer getMonth() {
        return month;
    }

    public Integer getYear() {
        return year;
    }

    public  LocalDate getDate(){
        LocalDate date = LocalDate.of(day,month,year);
        return date;
    }

}
