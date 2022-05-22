package com.tms.homework.han.patterns.structural.decorator;

public class RecordData extends Decorator {
    @Override
    public void process() {
        processor.process();
        System.out.println("Данные из перевода записаны");
    }

    public RecordData(Processor processor) {
        super(processor);
    }
}
