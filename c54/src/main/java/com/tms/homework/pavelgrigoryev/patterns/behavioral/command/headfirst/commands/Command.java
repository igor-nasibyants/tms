package com.tms.homework.pavelgrigoryev.patterns.behavioral.command.headfirst.commands;

public interface Command {
    void execute();

    void undo();
}
