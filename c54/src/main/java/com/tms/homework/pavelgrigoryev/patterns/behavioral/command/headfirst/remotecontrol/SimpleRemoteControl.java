package com.tms.homework.pavelgrigoryev.patterns.behavioral.command.headfirst.remotecontrol;

import com.tms.homework.pavelgrigoryev.patterns.behavioral.command.headfirst.commands.Command;

public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {

    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
