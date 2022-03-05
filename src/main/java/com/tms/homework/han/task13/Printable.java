package com.tms.homework.han.task13;

import java.util.List;

public interface Printable {
    static <T> void printList(List<T> arr) {
        System.out.print("Number of elements: " + arr.size() + "\n" + "Array: ");
        arr.forEach(s -> System.out.print(s + " "));
        System.out.println();
    }
}
