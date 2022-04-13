package com.tms.homework.shumchenia.task6;

public enum Stastus {
    SINGLE("Одинок"),
    MARRIED("Женат"),
    DIWORSED("Разведен"),
    ALL_COMPLICATED("Все сложно");

    private String status;

    Stastus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Status{" +
                "status='" + status + '\'' +
                '}';
    }
}
