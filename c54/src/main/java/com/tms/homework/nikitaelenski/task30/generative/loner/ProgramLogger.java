package com.tms.homework.nikitaelenski.task30.generative.loner;

public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String Logfile = "This is log file . \n\n";

    public static synchronized ProgramLogger getProgramLogger(){
        if(programLogger == null){
            programLogger = new ProgramLogger();
        }
        return programLogger;
    }
    private ProgramLogger(){

    }

    public void addLogInfo(String logInfo){
        Logfile+=logInfo + "\n";
    }
    public void logShow( ){
        System.out.println(Logfile);
    }
    public void repeatLog(){
        System.out.println(Logfile.repeat(10));
    }
}
