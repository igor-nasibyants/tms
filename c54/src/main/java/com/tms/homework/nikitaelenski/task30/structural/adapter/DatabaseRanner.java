package com.tms.homework.nikitaelenski.task30.structural.adapter;

public class DatabaseRanner {
    public static void main(String[] args) {
        Database database = new Adapter();
        database.insert();
        database.remove();
        database.select();
        database.update();
    }
}
