package com.tms.homework.pavelgrigoryev.patterns.behavioral.command.headfirst.remotecontrol;

import com.tms.homework.pavelgrigoryev.patterns.behavioral.command.headfirst.garagedoor.GarageDoor;
import com.tms.homework.pavelgrigoryev.patterns.behavioral.command.headfirst.garagedoor.GarageDoorOpenCommand;
import com.tms.homework.pavelgrigoryev.patterns.behavioral.command.headfirst.light.Light;
import com.tms.homework.pavelgrigoryev.patterns.behavioral.command.headfirst.light.LightOnCommand;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("Hey");
        LightOnCommand lightOn = new LightOnCommand(light);

        GarageDoor garageDoor = new GarageDoor("Oop");
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }
}
