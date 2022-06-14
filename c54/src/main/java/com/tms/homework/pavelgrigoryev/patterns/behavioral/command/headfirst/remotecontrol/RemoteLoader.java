package com.tms.homework.pavelgrigoryev.patterns.behavioral.command.headfirst.remotecontrol;

import com.tms.homework.pavelgrigoryev.patterns.behavioral.command.headfirst.ceilingfan.*;
import com.tms.homework.pavelgrigoryev.patterns.behavioral.command.headfirst.garagedoor.GarageDoor;
import com.tms.homework.pavelgrigoryev.patterns.behavioral.command.headfirst.garagedoor.GarageDoorDownCommand;
import com.tms.homework.pavelgrigoryev.patterns.behavioral.command.headfirst.garagedoor.GarageDoorUpCommand;
import com.tms.homework.pavelgrigoryev.patterns.behavioral.command.headfirst.light.Light;
import com.tms.homework.pavelgrigoryev.patterns.behavioral.command.headfirst.light.LightOffCommand;
import com.tms.homework.pavelgrigoryev.patterns.behavioral.command.headfirst.light.LightOnCommand;
import com.tms.homework.pavelgrigoryev.patterns.behavioral.command.headfirst.stereo.Stereo;
import com.tms.homework.pavelgrigoryev.patterns.behavioral.command.headfirst.stereo.StereoOffCommand;
import com.tms.homework.pavelgrigoryev.patterns.behavioral.command.headfirst.stereo.StereoOnWithCDCommand;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living room");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanLowCommand ceilingFanLow = new CeilingFanLowCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
        remoteControl.setCommand(3, stereoOnWithCD, stereoOff);
        remoteControl.setCommand(4, garageDoorUp, garageDoorDown);
        remoteControl.setCommand(5, ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommand(6, ceilingFanHigh, ceilingFanOff);
        remoteControl.setCommand(7, ceilingFanLow, ceilingFanOff);

        System.out.println(remoteControl);
        System.out.println("----------------------------------------------------------------------------------------");

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();

        System.out.println("----------------------------------------------------------------------------------------");

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();

        System.out.println("----------------------------------------------------------------------------------------");

        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.undoButtonWasPushed();

        System.out.println("----------------------------------------------------------------------------------------");

        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        remoteControl.undoButtonWasPushed();

        System.out.println("----------------------------------------------------------------------------------------");

        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);
        remoteControl.undoButtonWasPushed();

        System.out.println("----------------------------------------------------------------------------------------");

        remoteControl.onButtonWasPushed(5);
        remoteControl.offButtonWasPushed(5);
        remoteControl.undoButtonWasPushed();

        System.out.println("----------------------------------------------------------------------------------------");

        remoteControl.onButtonWasPushed(6);
        remoteControl.undoButtonWasPushed();

        System.out.println("----------------------------------------------------------------------------------------");
    }
}
