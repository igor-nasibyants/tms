package com.tms.task.task7.human;

public enum Status {
    SINGLE("Одинок"),
    MARRIED("Женат"),
    DIWORSED("Разведен"),
    ALL_COMPLICATED("Все сложно");

    private final String status;

    Status(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Status{" +
                "status='" + status + '\'' +
                '}';
    }


}
