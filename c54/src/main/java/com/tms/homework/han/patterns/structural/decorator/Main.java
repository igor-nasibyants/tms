package com.tms.homework.han.patterns.structural.decorator;

public class Main {
    public static void main(String[] args) {
        Processor processor = new Translator("I go learn 'GO TO'");
        processor.process();
        System.out.println();

        VoiceData voiceData = new VoiceData(processor);
        voiceData.process();
        System.out.println();

        RecordData recordData = new RecordData(processor);
        recordData.process();
    }
}
