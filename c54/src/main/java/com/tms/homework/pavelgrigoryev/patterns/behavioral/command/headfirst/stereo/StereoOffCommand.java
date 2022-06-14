package com.tms.homework.pavelgrigoryev.patterns.behavioral.command.headfirst.stereo;

import com.tms.homework.pavelgrigoryev.patterns.behavioral.command.headfirst.commands.Command;

public class StereoOffCommand implements Command {
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }
}
