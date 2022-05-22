package com.tms.homework.han.patterns.structural.decorator;

abstract class Decorator implements Processor {
    public Processor processor;

    @Override
    public void process() {
        processor.process();
    }

    public Decorator(Processor processor) {
        this.processor = processor;
    }
}
