package com.tms.homework.pavelgrigoryev.task8.shopDIY.departments;

public enum StoreDepartments {

    DEPARTMENT_NUM_ONE(1, "\"Строительные материалы\""),
    DEPARTMENT_NUM_TWO(2, "\"Товары для дома\""),
    DEPARTMENT_NUM_THREE(3, "\"Iнструмент и Электрика\""),
    DEPARTMENT_NUM_FOUR(4, "\"Iзделия из дерева\""),
    DEPARTMENT_NUM_FIVE(5, "\"Сантехника\""),
    DEPARTMENT_NUM_SIX(6, "\"Плитка и напольные покрытия\""),
    DEPARTMENT_NUM_SEVEN(7, "\"Краски\""),
    DEPARTMENT_NUM_EIGHT(8, "\"Декоративные материалы\""),
    DEPARTMENT_NUM_NINE(9, "\"Садовый Мир\"");

    private final int number;
    private final String departmentName;

    StoreDepartments(int number, String departmentName) {
        this.number = number;
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Отдел " +
                "номер " + number +
                ", название отдела - " + departmentName;
    }
}
