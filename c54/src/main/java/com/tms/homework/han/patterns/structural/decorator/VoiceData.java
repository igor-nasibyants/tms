package com.tms.homework.han.patterns.structural.decorator;

public class VoiceData extends Decorator {
    @Override
    public void process() {
        processor.process();
        System.out.println("Данные из перевода озвучены");
    }

    public VoiceData(Processor processor) {
        super(processor);
    }
}
