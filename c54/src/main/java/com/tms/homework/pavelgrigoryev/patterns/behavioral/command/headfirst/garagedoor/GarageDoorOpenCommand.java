package com.tms.homework.pavelgrigoryev.patterns.behavioral.command.headfirst.garagedoor;

import com.tms.homework.pavelgrigoryev.patterns.behavioral.command.headfirst.commands.Command;

public class GarageDoorOpenCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {
        garageDoor.down();
    }
}
