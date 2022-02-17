package com.tms.homework.max.polevoy.task7.interfaceImplementationMore;

import com.tms.homework.max.polevoy.task7.insertedInterface.A;
import com.tms.homework.max.polevoy.task7.insertedInterface.B;

public class NestedIfDemo {
    public static void main(String[] args) {
        A.NestedIf nif = new B();
        if (nif.isNotNegative(10)) {
            System.out.println("Число 10 не отрицательное.");
        }
        if (nif.isNotNegative(-12)) {
            System.out.println("Этo не будет выведено.");
        }
    }
}
