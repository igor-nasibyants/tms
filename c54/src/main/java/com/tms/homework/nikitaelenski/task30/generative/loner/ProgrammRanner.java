package com.tms.homework.nikitaelenski.task30.generative.loner;

public class ProgrammRanner {
    public static void main(String[] args) {
        System.out.println(ProgramLogger.getProgramLogger().toString());
        System.out.println(ProgramLogger.getProgramLogger().toString());
        System.out.println(ProgramLogger.getProgramLogger().toString());

        ProgramLogger.getProgramLogger().addLogInfo("First Log");
        System.out.println(ProgramLogger.getProgramLogger().toString());
        ProgramLogger.getProgramLogger().addLogInfo("Second Log");
        System.out.println(ProgramLogger.getProgramLogger().toString());
        ProgramLogger.getProgramLogger().addLogInfo("Third Log");
        System.out.println(ProgramLogger.getProgramLogger().toString());
        ProgramLogger.getProgramLogger().logShow();
        ProgramLogger.getProgramLogger().repeatLog();
    }
}
