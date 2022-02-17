package com.tms.homework.max.polevoy.task7.defaultMethod;

public interface SomeInterfase {
    //метод по умолчанию дефолтный метод с телом
    default String defaultMethot() {
        return "Объект типа String по умолчанию";

    }
}
