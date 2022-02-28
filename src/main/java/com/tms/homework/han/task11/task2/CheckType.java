package com.tms.homework.han.task11.task2;

public interface CheckType {
    static void checkType(Plants plant, String type) throws TypeException {
        if (!(type.equalsIgnoreCase(Type.PERENNIAL.name()))
                && !(type.equalsIgnoreCase(Type.BIENNIAL.name()))
                && !(type.equalsIgnoreCase(Type.ANNUAL.name()))) {
            throw new TypeException("У растений нет типа " + type);
        }
    }
}
