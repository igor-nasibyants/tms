package com.tms.task.task13.examples;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("First");
        list.addLast("Second");
        System.out.println(list);
    }
}
