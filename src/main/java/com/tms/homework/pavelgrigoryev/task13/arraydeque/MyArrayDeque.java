package com.tms.homework.pavelgrigoryev.task13.arraydeque;

import java.util.ArrayDeque;

public class MyArrayDeque {
    public static void main(String[] args) {

        ArrayDeque<Terminator> terminators = new ArrayDeque<>();

        Terminator gromozeka = new Terminator("Gromozeka","T",70);
        Terminator viktor = new Terminator("Viktor","REV",9);
        Terminator kail = new Terminator("Kail","T",600);
        Terminator markus = new Terminator("Markus","I",950);
        Terminator arnold = new Terminator("Arnold","T",800);

        terminators.addFirst(gromozeka);
        terminators.push(viktor);
        terminators.addLast(viktor);
        terminators.add(kail);
        terminators.add(markus);
        terminators.add(arnold);

        while (terminators.peek() != null) {
            System.out.println(terminators.pop());
        }
    }
}
