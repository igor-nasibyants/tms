package com.tms.homework.han.task13;

import java.util.Collection;

public interface Printable {
    static <T> void printCollection(Collection<T> arr) {
        System.out.print("Number of elements: " + arr.size() + "\n" + "Collection: ");
        arr.forEach(s -> System.out.print(s + " "));
        System.out.println();
    }
}
