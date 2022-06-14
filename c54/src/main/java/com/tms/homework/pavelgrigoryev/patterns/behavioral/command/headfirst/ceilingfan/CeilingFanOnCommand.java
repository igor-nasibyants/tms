package com.tms.homework.pavelgrigoryev.patterns.behavioral.command.headfirst.ceilingfan;

import com.tms.homework.pavelgrigoryev.patterns.behavioral.command.headfirst.commands.Command;

public class CeilingFanOnCommand implements Command {
    CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.on();
    }

    @Override
    public void undo() {
        ceilingFan.off();
    }
}
