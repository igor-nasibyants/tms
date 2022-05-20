package com.tms.homework.pavelgrigoryev.patterns.structural.bridge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgramCreator {
    public static void main(String[] args) {
        List<Program> programs = new ArrayList<>();
        Collections.addAll(programs,
                new BankSystem(new JavaDeveloper()),
                new StockExchange(new CppDeveloper()));

        programs.forEach(Program::developProgram);
    }
}
